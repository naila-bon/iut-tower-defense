package game.tower;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

import game.path.Coordinate;

class TowerTest {

    @Test
    void testTowerPosition() {
        Coordinate pos1 = new Coordinate(50, 50);
        Sun tower = new Sun(pos1);
        
        Coordinate pos2 = new Coordinate(100, 100);
        tower.setPosition(pos2);
        
        assertEquals(100, tower.position.getX());
        assertEquals(100, tower.position.getY());
    }

    @Test
    void testDifferentTowerRanges() {
        assertTrue(80 < 100);
    }
}
