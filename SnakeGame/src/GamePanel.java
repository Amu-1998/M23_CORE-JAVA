import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;


public class GamePanel extends JPanel implements ActionListener
{
	static final int SCREEN_WIDTH =600;
	static final int SCREEN_HEIGHT =600;
	
	//How big u want the items in the game
	static final int UNIT_SIZE = 25;
	
	//how many objects we can fit in this screen
	static final int GAME_UNITS =((SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE);
	static final int DELAY = 200;
	
	//Arrays are going to hold all of the coordinates for all the body parts.
	final int x[]= new int[GAME_UNITS];
	final int y[]= new int[GAME_UNITS];
	
	//initial amount of body parts we want for the snake.
	int bodyParts =4;
	int applesEaten;
	
	//X & Y position where the apple will come after snake eats it.
	int appleX;
	int appleY;
	
	//at start the snake will move towards the right.
	char direction = 'R';
	boolean running = false;
	Timer timer;
	Random random;
	
	//constructor
	GamePanel()
	{
		random = new Random();
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.black);
		this.setFocusable(true);
		this.addKeyListener(new MyKeyAdapter());
		startGame();
	}
	//method
	public void startGame()
	{
		newApple();
		running = true;
		timer = new Timer(DELAY,this);
		timer.start();
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		draw(g);
	}
	
	//making grid
	public void draw(Graphics g)
	{
		//if the game is running do all these
		if(running) 
		{
			/*
			for(int i=0; i<SCREEN_HEIGHT/UNIT_SIZE;i++)
			{
				g.drawLine(i*UNIT_SIZE, 0, i*UNIT_SIZE, SCREEN_HEIGHT);
				g.drawLine(0, i*UNIT_SIZE, SCREEN_WIDTH, i*UNIT_SIZE);
			}
			*/
		// Apple color
			g.setColor(Color.red);
			g.fillOval(appleX, appleY, UNIT_SIZE, UNIT_SIZE);
		
		//to draw the snake
			for(int i =0; i< bodyParts; i++)
			{
				if(i==0)
				{
					g.setColor(Color.green);
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
				else
				{
					g.setColor(new Color(45,180,0));
					g.fillRect(x[i], y[i], UNIT_SIZE, UNIT_SIZE);
				}
			}
		
		
	//score TEXT
			g.setColor(Color.RED);
			g.setFont(new Font(" Ink Free", Font.BOLD, 40));
			
			//to show score at the top of the screen.
			FontMetrics metrics = getFontMetrics(g.getFont());
			g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
		}
			else
			{
				//g is the graphic we are receiving with parameter Graphics. 
				gameOver(g);
			}
	}
		
			
	public void newApple()
	{
		appleX = random.nextInt((int)(SCREEN_WIDTH/UNIT_SIZE))*UNIT_SIZE;
		appleY = random.nextInt((int)(SCREEN_HEIGHT/UNIT_SIZE))*UNIT_SIZE;
	}
	public void move()
	{
		for(int i = bodyParts; i>0; i--) {
			//shifting the body parts coordinates by 1.
			x[i] = x[i-1];
			y[i] = y[i-1];
		}
		//to show where the snake is heading.
		switch(direction)
		{
		case 'U':
			y[0] = y[0] - UNIT_SIZE;
			break;
		case 'D':
			y[0] = y[0] + UNIT_SIZE;
			break;
		case 'L':
			x[0] = x[0] - UNIT_SIZE;
			break;
		case 'R':
			x[0] = x[0] + UNIT_SIZE;
			break;
		}
	}
	public void checkApple()
	{
		//if the x position of the head  = x position of the apple. 
		if((x[0] == appleX) && (y[0] == appleY))
		{
			//increases the size of the snake
			bodyParts++;
			applesEaten++;
			newApple();
		}
	}
	public void checkCollisions()
	{
		for(int i= bodyParts;i>0;i--)
		{
			//checks if head collides with the body
			if((x[0] == x[i] && (y[0] == y[i]))) {
				running = false;
			}
		}
		//check if head touches left border.
		if(x[0] < 0)
		{
			running = false;
		}
		//check if head touches right border.
		if(x[0] > SCREEN_WIDTH)
		{
			running = false;
		}
		//check if head touches top border
		if(y[0] < 0)
		{
			running = false;
		}
		//check if head touches bottom border.
		if(y[0] > SCREEN_HEIGHT)
		{
			running = false;
		}
		if(!running) {
			timer.stop();
		}
	}
	public void gameOver(Graphics g)
	{
		//to display score
		g.setColor(Color.RED);
		g.setFont(new Font(" Ink Free", Font.BOLD, 40));
		
		//to show score at the top of the screen.
		FontMetrics metrics1 = getFontMetrics(g.getFont());
		g.drawString("Score: "+applesEaten, (SCREEN_WIDTH - metrics1.stringWidth("Score: "+applesEaten))/2, g.getFont().getSize());
		
		//GAME OVER TEXT
		g.setColor(Color.RED);
		g.setFont(new Font(" Ink Free", Font.BOLD, 75));
		
		//to align at the center of the screen
		FontMetrics metrics2 = getFontMetrics(g.getFont());
		g.drawString("Game Over", (SCREEN_WIDTH - metrics2.stringWidth("Game Over"))/2, SCREEN_HEIGHT/2);
	}
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		if(running) {
			move();
			checkApple();
			checkCollisions();
		}
		//if the game is no longer running.
		repaint();
		
	}
	public class MyKeyAdapter extends KeyAdapter
	{
		@Override
		public void keyPressed(KeyEvent e) {
			switch(e.getKeyCode())
			{
			case KeyEvent.VK_LEFT:
				//to limit user to 90 degree turn.
				if(direction != 'R')
				{
					direction = 'L';
				}
				break;
			case KeyEvent.VK_RIGHT:
				//to limit user to 90 degree turn.
				if(direction != 'L')
				{
					direction = 'R';
				}
				break;
			case KeyEvent.VK_UP:
				//to limit user to 90 degree turn.
				if(direction != 'D')
				{
					direction = 'U';
				}
				break;
			case KeyEvent.VK_DOWN:
				//to limit user to 90 degree turn.
				if(direction != 'U')
				{
					direction = 'D';
				}
				break;
			}
		}
	}

}
