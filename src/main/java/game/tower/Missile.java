package game.tower;

import java.util.List;

import game.Game;
import game.ImageLoader;
import game.effect.MissileShot;
import game.enemy.Enemy;
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

	public void interact(Game game, double deltaTime)
	{
		List<Enemy> enemies = game.getEnemies();
		
		timeSinceLastFire += deltaTime;
		
		if(timeSinceLastFire < 0.15)
			return;
		
		for(Enemy e: enemies)
		{	
			Coordinate enemyPos = e.getPosition().getCoordinate();

			double dx, dy, dist;
			
			dx = enemyPos.x - position.x;
			dy = enemyPos.y - position.y;
		
			dist = Math.sqrt((dx*dx) + (dy*dy));
			
			Coordinate pos = new Coordinate(position.x, position.y);	
			
			if(dist < 50)
			{	MissileShot missileShot = new MissileShot(pos, enemyPos);
				game.addEffect(missileShot);
				timeSinceLastFire = 0;
				return;
			}	
		} 
	}
}
