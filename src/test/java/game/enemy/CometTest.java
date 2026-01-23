package game.enemy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.path.PathPoints;
import game.path.PathPosition;

class CometTest {

    private PathPosition pathPosition;

    @BeforeEach
    void setUp() {
        String pathData = "3\n10 20\n100 100\n200 200";
        InputStream is = new ByteArrayInputStream(pathData.getBytes());
        Scanner scanner = new Scanner(is);
        
        PathPoints pathPoints = new PathPoints(scanner);
        pathPosition = pathPoints.getStart();
    }

    @Test
    void testCometCreation() {
        Comet comet = new Comet(pathPosition);
        assertNotNull(comet);
    }

    @Test
    void testCometHasPosition() {
        Comet comet = new Comet(pathPosition);
        assertNotNull(comet.getPosition());
    }

    @Test
    void testCometCanMove() {
        Comet comet = new Comet(pathPosition);
        comet.advance();
        assertNotNull(comet.getPosition());
    }
}
