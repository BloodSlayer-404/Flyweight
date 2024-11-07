package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    Room room = new Room();
    
    @Test
    void roomTest(){
        room.putEnemy(0,0,"Armos", "Armos.png", 50);
        room.putEnemy(20, 30, "Bow Moblin", "Bow Moblin.png", 25);
        room.putEnemy(30, 20, "Bow Moblin", "Bow Moblin.png", 25);
        room.putEnemy(10,15,"Armos", "Armos.png", 50);
        room.putEnemy(25, 25, "Bow Moblin", "Bow Moblin.png", 25);

        assertEquals("A Armos spawn in (0, 0)\n" +
                            "A Bow Moblin spawn in (20, 30)\n" +
                            "A Bow Moblin spawn in (30, 20)\n" +
                            "A Armos spawn in (10, 15)\n" +
                            "A Bow Moblin spawn in (25, 25)\n",
                room.spawn());
    }
}