package game.enemy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.path.PathPoints;
import game.path.PathPosition;

class AlienTest {

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
    void testAlienCreation() {
        Alien alien = new Alien(pathPosition);
        assertNotNull(alien);
    }

    @Test
    void testAlienHasPosition() {
        Alien alien = new Alien(pathPosition);
        assertNotNull(alien.getPosition());
    }

    @Test
    void testAlienCanMove() {
        Alien alien = new Alien(pathPosition);
        alien.advance();
        assertNotNull(alien.getPosition());
    }
}
