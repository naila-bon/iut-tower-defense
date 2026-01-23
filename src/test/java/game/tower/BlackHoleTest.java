package game.tower;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.path.Coordinate;

class BlackHoleTest {

    private Coordinate position;
    private BlackHole blackHole;

    @BeforeEach
    void setUp() {
        position = new Coordinate(150, 150);
        blackHole = new BlackHole(position);
    }

    @Test
    void testBlackHoleCreation() {
        assertNotNull(blackHole);
    }

    @Test
    void testBlackHolePositionSet() {
        assertEquals(150, blackHole.position.getX());
        assertEquals(150, blackHole.position.getY());
    }

    @Test
    void testBlackHolePositionChange() {
        Coordinate newPos = new Coordinate(300, 300);
        blackHole.setPosition(newPos);
        
        assertEquals(300, blackHole.position.getX());
        assertEquals(300, blackHole.position.getY());
    }
}
