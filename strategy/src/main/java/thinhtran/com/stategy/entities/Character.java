package thinhtran.com.stategy.entities;

import lombok.Setter;

@Setter
public abstract class Character {
    private WeaponBehavior weaponBehavior;

    public abstract void fight();
}
