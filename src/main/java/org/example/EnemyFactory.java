package org.example;

import java.util.HashMap;
import java.util.Map;

public class EnemyFactory {
    static Map<String, EnemyType> enemyTypes = new HashMap<>();

    /**
     * Seeks for an enemy type with the name provided, if there isn't one, then it creates it with the
     * specified parameters
     * @param name: The name of the enemy type
     * @param texture: The path of the texture that this type of enemy have
     * @param lifePoints: The life points of the enemy type
     * @return An enemy type with the specified name
     */
    public static EnemyType getEnemyType(String name, String texture, int lifePoints) {
        EnemyType result = enemyTypes.get(name);
        if (result == null) {
            result = new EnemyType(name, texture, lifePoints);
            enemyTypes.put(name, result);
        }
        return result;
    }
}
