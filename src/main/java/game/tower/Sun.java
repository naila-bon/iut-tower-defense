package game.tower;

import game.ImageLoader;
import game.effect.Effect;
import game.effect.SunSpot;
import game.path.Coordinate;

/**
 * This class creates a single sun tower
 */
public class Sun extends Tower
{
	/**
	 * Constructor
	 */
	public Sun(Coordinate pos)
	{
		ImageLoader loader = ImageLoader.getLoader();
		this.tower = loader.getImage("images/sun.png");
		this.position = pos;
		this.anchorX = -50;
		this.anchorY = -50;
	}

	/**
	 * 
	 */
	protected double getFireRate() {
		return 0.2;
	}

	protected double getRange() {
		return 100.0;
	}

	protected Effect createEffect(Coordinate towerPos, Coordinate enemyPos) {
		return new SunSpot(towerPos, enemyPos);
	}
}
