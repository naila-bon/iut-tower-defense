package game.path;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PathPointsTest {

    private PathPoints pathPoints;

    @BeforeEach
    void setUp() {
        String pathData = "3\n10 20\n50 60\n100 150";
        InputStream is = new ByteArrayInputStream(pathData.getBytes());
        Scanner scanner = new Scanner(is);
        pathPoints = new PathPoints(scanner);
    }

    @Test
    void testPathPointsCreation() {
        assertNotNull(pathPoints);
    }

    @Test
    void testGetStartPosition() {
        PathPosition startPos = pathPoints.getStart();
        assertNotNull(startPos);
        
        Coordinate coord = startPos.getCoordinate();
        assertEquals(10, coord.getX());
        assertEquals(20, coord.getY());
    }

    @Test
    void testDistanceToPath() {
        double distance = pathPoints.distanceToPath(10, 20);
        assertEquals(0.0, distance, 0.01);
    }
}
