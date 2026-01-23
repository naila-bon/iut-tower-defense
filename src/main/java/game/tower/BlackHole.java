package game.tower;

import game.ImageLoader;
import game.effect.Effect;
import game.effect.StarDust;
import game.path.Coordinate;

/**
 * This class creates a single blackhole tower
 */
public class BlackHole extends Tower
{
	/**
	 * Constructor
	 */
	public BlackHole(Coordinate pos)
	{
		ImageLoader loader = ImageLoader.getLoader();
		this.tower = loader.getImage("images/blackhole.png");
		this.position = pos;
		this.anchorX = -40;
		this.anchorY = -40;
	}
	
	/**
	 * 
	 */
	protected double getFireRate() {
		return 1.0;
	}

	protected double getRange() {
		return 80.0;
	}

	protected Effect createEffect(Coordinate towerPos, Coordinate enemyPos) {
		return new StarDust(towerPos, enemyPos);
	}
}
