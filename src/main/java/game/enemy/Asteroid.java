package game.enemy;

import game.ImageLoader;
import game.path.PathPosition;

/**
 * This class creates a single comet enemy
 */
public class Asteroid extends Enemy
{
	/**
	 * Constructor
	 */
	public Asteroid(PathPosition p)
	{
		ImageLoader loader = ImageLoader.getLoader();
		this.enemy = loader.getImage("images/asteroid.png");
		this.position = p;
		this.anchorX = -20;
		this.anchorY = -20;
		this.velocity = 2;
	}
	
}