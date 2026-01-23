package game.path;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class CoordinateTest {

    @Test
    void testCoordinateCreation() {
        Coordinate coord = new Coordinate(100, 200);
        assertEquals(100, coord.x);
        assertEquals(200, coord.y);
    }

    @Test
    void testGetX() {
        Coordinate coord = new Coordinate(50, 75);
        assertEquals(50, coord.getX());
    }

    @Test
    void testGetY() {
        Coordinate coord = new Coordinate(50, 75);
        assertEquals(75, coord.getY());
    }

    @Test
    void testToString() {
        Coordinate coord = new Coordinate(123, 456);
        assertEquals("123 456", coord.toString());
    }

    @Test
    void testModifyCoordinates() {
        Coordinate coord = new Coordinate(10, 20);
        coord.x = 30;
        coord.y = 40;
        assertEquals(30, coord.getX());
        assertEquals(40, coord.getY());
    }
}
