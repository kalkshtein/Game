package com.brunoyam.unit_2.services.impl;

import com.brunoyam.unit_2.models.BattleField;
import com.brunoyam.unit_2.models.army.AbstractUnit;
import com.brunoyam.unit_2.services.CurrentBattleField;

public class CurrentBattleFieldImpl implements CurrentBattleField {
    private BattleField currentBattleField;

    public void newGame(){

        BattleField newBattleField = new BattleField();
    }

    @Override
    public void saveGame() {
        

    }


}
