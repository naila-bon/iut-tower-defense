package game.effect;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.path.Coordinate;

class EffectTest {

    private Coordinate sourcePos;
    private Coordinate targetPos;

    @BeforeEach
    void setUp() {
        sourcePos = new Coordinate(100, 100);
        targetPos = new Coordinate(150, 150);
    }

    @Test
    void testSunSpotCreation() {
        SunSpot sunSpot = new SunSpot(sourcePos, targetPos);
        assertNotNull(sunSpot);
    }

    @Test
    void testStarDustCreation() {
        StarDust starDust = new StarDust(sourcePos, targetPos);
        assertNotNull(starDust);
    }

    @Test
    void testEffectWithIdenticalCoordinates() {
        Coordinate pos = new Coordinate(75, 75);
        SunSpot effect = new SunSpot(pos, pos);
        assertNotNull(effect);
    }
}
