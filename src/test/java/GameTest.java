import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import game.Game;

class GameTest {
    
    private Game game;

    @BeforeEach
    void setUp() {
        game = new Game();
    }
    
    @Test
    void testAddKill() {
        int killsBefore = game.getKills();
        game.addKill();
        assertEquals(killsBefore + 1, game.getKills());
    }

    @Test
    void testMultipleKills() {
        game.addKill();
        game.addKill();
        game.addKill();
        assertEquals(3, game.getKills());
    }

    @Test
    void testAddScore() {
        int scoreBefore = game.getScore();
        game.addScore(100);
        assertEquals(scoreBefore + 100, game.getScore());
    }

    @Test
    void testScoreAccumulation() {
        game.addScore(50);
        game.addScore(50);
        assertEquals(100, game.getScore());
    }

    @Test
    void testLivesInitialized() {
        int lives = game.getLives();
        assertTrue(lives >= 0);
    }

}
