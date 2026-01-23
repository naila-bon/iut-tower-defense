package game.tower;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.path.Coordinate;

class MissileTest {

    private Coordinate position;
    private Missile missile;

    @BeforeEach
    void setUp() {
        position = new Coordinate(200, 200);
        missile = new Missile(position);
    }

    @Test
    void testMissileCreation() {
        assertNotNull(missile);
    }

    @Test
    void testMissilePositionSet() {
        assertEquals(200, missile.position.getX());
        assertEquals(200, missile.position.getY());
    }

    @Test
    void testMissilePositionChange() {
        Coordinate newPos = new Coordinate(400, 400);
        missile.setPosition(newPos);
        
        assertEquals(400, missile.position.getX());
        assertEquals(400, missile.position.getY());
    }
}
