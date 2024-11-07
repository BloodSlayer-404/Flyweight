package org.example;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EnemyType {
    private String name;
    private String texture;
    private int lifePoints;

    /**
     * Spawns an enemy
     * @param x: The X coordinate where the enemy spawn
     * @param y: The Y coordinate where the enemy spawn
     * @return The type and coordinates where the Enemy spawn
     */
    public String spawn(int x, int y){
        return "A " + name + " spawn in (" + x + ", " + y + ")";
    }
}
