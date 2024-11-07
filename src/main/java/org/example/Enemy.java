package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Enemy {
    private int x;
    private int y;
    private EnemyType type;

    /**
     * Spawns an enemy
     * @return The type and the coordinates where the enemy spawns
     */
    public String spawn(){
        return type.spawn(x,y);
    }
}
