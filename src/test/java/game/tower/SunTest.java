package game.tower;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.path.Coordinate;

class SunTest {

    private Coordinate position;
    private Sun sun;

    @BeforeEach
    void setUp() {
        position = new Coordinate(100, 100);
        sun = new Sun(position);
    }

    @Test
    void testSunCreation() {
        assertNotNull(sun);
    }

    @Test
    void testSunPositionSet() {
        assertEquals(100, sun.position.getX());
        assertEquals(100, sun.position.getY());
    }

    @Test
    void testSunPositionChange() {
        Coordinate newPos = new Coordinate(200, 200);
        sun.setPosition(newPos);
        
        assertEquals(200, sun.position.getX());
        assertEquals(200, sun.position.getY());
    }
}
