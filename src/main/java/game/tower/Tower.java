package game.tower;

import java.awt.Graphics;
import java.awt.Image;
import java.util.List;

import game.Game;
import game.effect.Effect;
import game.enemy.Enemy;
import game.path.Coordinate;

/**
 * This is an abstract superclass for a tower in the game
 */
abstract public class Tower 
{
	/* instance variables */
	protected Coordinate position;	// holds position of tower
	protected Image tower; 			// holds tower image
	protected int anchorX;			// shifts X coordinate
	protected int anchorY;			// shifts Y coordinate
	protected double timeSinceLastFire;// time since last effect was fired
	
	public void draw(Graphics g)
	{
		// Draws tower object to location specified by user
		g.drawImage(tower, position.getX() + anchorX, position.getY() + anchorY, null);
		
		// Draws dot on Enemy's (x, y) coordinates
		//g.setColor(Color.WHITE);
		//g.fillOval(position.getX(), position.getY(), 5, 5);	
	}
	/**
	 * 
	 * @param c
	 */
	public void setPosition(Coordinate c)
	{
		position = c;
	}
	
	public void interact(Game game, double deltaTime)
	{
		timeSinceLastFire += deltaTime;

		if(timeSinceLastFire < getFireRate())
			return;

		List<Enemy> enemies = game.getEnemies();

		for(Enemy e: enemies)
		{
			Coordinate enemyPos = e.getPosition().getCoordinate();

			double dx = enemyPos.x - position.x;
			double dy = enemyPos.y - position.y;

			double dist = Math.sqrt((dx*dx) + (dy*dy));

			Coordinate pos = new Coordinate(position.x, position.y);

			if(dist < getRange())
			{
				Effect effect = createEffect(pos, enemyPos);
				game.addEffect(effect);
				timeSinceLastFire = 0;
				return;
			}
		}
	}

	protected abstract double getFireRate();
	protected abstract double getRange();
	protected abstract Effect createEffect(Coordinate towerPos, Coordinate enemyPos);
}





