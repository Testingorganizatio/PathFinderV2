package com.rpgfoundation.Character;

import com.rpgfoundation.Gear.Weapon;
import com.rpgfoundation.Secondary.Attribute;

/**
 * Created by Brandon on 1/1/2017.
 */
public class Human extends Person {

    public Human(String name, int level, Weapon weapon, Side team, ClassRole specialty) {
        super(name, level, weapon, team, specialty);
    }
}
