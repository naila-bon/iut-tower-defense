package game.tower;

import game.ImageLoader;
import game.effect.Effect;
import game.effect.MissileShot;
import game.path.Coordinate;

public class Missile extends Tower
{
	public Missile(Coordinate pos)
	{
		ImageLoader loader = ImageLoader.getLoader();
		this.tower = loader.getImage("images/missile.png");
		this.position = pos;
		this.anchorX = -30;
		this.anchorY = -50;
		this.timeSinceLastFire = 0;
	}

	protected double getFireRate() {
		return 0.15;
	}

	protected double getRange() {
		return 50.0;
	}

	protected Effect createEffect(Coordinate towerPos, Coordinate enemyPos) {
		return new MissileShot(towerPos, enemyPos);
	}
}
