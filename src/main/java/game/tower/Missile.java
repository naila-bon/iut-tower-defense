package game.tower;

import java.util.List;

import game.Game;
import game.ImageLoader;
import game.effect.SunSpot;
import game.enemy.Enemy;
import game.path.Coordinate;

/**
 * This class creates a single missile tower
 */
public class Missile extends Tower
{
	/**
	 * Constructor
	 */
	public Missile(Coordinate pos)
	{
		ImageLoader loader = ImageLoader.getLoader();
		this.tower = loader.getImage("images/missile.png");
		// this.position = pos;
		// this.anchorX = -30;
		// this.anchorY = -30;
	}

	/**
	 * 
	 */
	public void interact(Game game, double deltaTime)
	{
		// TODO
	}
}
