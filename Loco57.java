package ManuelGreub;
import robocode.*;

public class Loco57 extends JuniorRobot
{

	public void run()
	{
		setColors(purple, purple, white, white, white);
		
		while(true)
		{
		 goZickzack();
		 turnGunRight(360);
		}
	}

	public void onScannedRobot() 
	{
		aimToEnemy();
		if(scannedDistance < 100)
		{
			fire(3);
		}
		else 
		{
			fire(1);
		}	
	}

	public void onHitByBullet() 
	{
		goZickzack();
		aimToEnemy();
		if(scannedDistance < 100) 
		{
			fire(3);
		}
		else 
		{
			fire (1);
		}
	}
	
	public void onHitWall()
	{
		turnRight(90);
		ahead(200);
	}	
	
	public void goZickzack()
	{
		ahead(200);
		turnRight(45);
		ahead(200);
		turnLeft(45);
	}
	
	public void aimToEnemy()
	{
		turnGunTo(scannedAngle);
	}
}
