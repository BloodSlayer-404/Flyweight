package org.example;

import java.util.ArrayList;
import java.util.List;

public class Room {

    private List<Enemy> enemies = new ArrayList<>();

    /**
     * Puts a new enemy inside the room
     * @param x: The X coordinate of the room where the enemy will be
     * @param y: The Y coordinate of the room where the enemy will be
     * @param name: The name of the enemy type
     * @param texture: The path of the texture of the enemy type
     * @param lifePoints: The life points of the enemy type
     */
    public void putEnemy(int x, int y, String name, String texture, int lifePoints) {
        EnemyType type = EnemyFactory.getEnemyType(name, texture, lifePoints);
        Enemy enemy = new Enemy(x, y, type);
        enemies.add(enemy);
    }

    /**
     * Spawn all the enemies in the room
         * @return A list of all the enemies in the room with each enemy's type and coordinates
     */
    public String spawn() {
        String enemyList = "";
        for (Enemy enemy : enemies) {
            enemyList = enemyList + enemy.spawn() + "\n";
        }

        return enemyList;
    }
}
