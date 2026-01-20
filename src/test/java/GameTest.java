import org.junit.jupiter.api.Test;

import game.Game;

import static org.junit.jupiter.api.Assertions.*;

class GameTest {
    

    @Test
    void testAddKill() {
        Game game = new Game();

        game.addKill();
        assertEquals(1, game.getKills());
    }

    @Test
    void testScore() {
        Game game = new Game();

        game.addScore(200);
        assertEquals(200, game.getScore());
    }


}
