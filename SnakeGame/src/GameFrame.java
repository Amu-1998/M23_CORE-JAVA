import javax.swing.JFrame;

public class GameFrame extends JFrame
{
	GameFrame()
	{
		GamePanel panel = new GamePanel();
		this.add(panel);
		this.setTitle("Snake Game");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		//to set it at the middle of the screen
		this.setLocationRelativeTo(null);
	}
}
