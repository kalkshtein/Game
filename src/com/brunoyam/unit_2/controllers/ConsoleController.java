package com.brunoyam.unit_2.controllers;

import com.brunoyam.unit_2.services.impl.CurrentBattleFieldImpl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleController {

    public void listenConsole () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while ( true ){
            String command = br.readLine();
            System.out.println("есть " + command);
            switch (command){
                case "new": new CurrentBattleFieldImpl().newGame(); break;
                case "save": new CurrentBattleFieldImpl().saveGame(); break;
                case "load": new CurrentBattleFieldImpl().loadGame(); break;
                case "exit": return;

            }

        }
    }
}
