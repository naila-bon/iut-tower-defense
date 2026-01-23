package game.enemy;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.path.PathPoints;
import game.path.PathPosition;

class AsteroidTest {

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
    void testAsteroidCreation() {
        Asteroid asteroid = new Asteroid(pathPosition);
        assertNotNull(asteroid);
    }

    @Test
    void testAsteroidHasPosition() {
        Asteroid asteroid = new Asteroid(pathPosition);
        assertNotNull(asteroid.getPosition());
    }

    @Test
    void testAsteroidCanMove() {
        Asteroid asteroid = new Asteroid(pathPosition);
        asteroid.advance();
        assertNotNull(asteroid.getPosition());
    }
}
