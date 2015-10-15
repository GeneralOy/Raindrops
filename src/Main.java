import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Toolkit;
import java.awt.geom.Ellipse2D;

import javax.swing.JFrame;
import javax.swing.colorchooser.ColorSelectionModel;

public class Main extends Component
{
	int circleY = 0;
	Ellipse2D.Double raindrop = new Ellipse2D.Double(50.0, circleY, 50.0, 50.0);
	Ellipse2D.Double raindrop2 = new Ellipse2D.Double(100.0, circleY, 50.0, 50.0);
	Ellipse2D.Double raindrop3 = new Ellipse2D.Double(150.0, circleY, 50.0, 50.0);
	Ellipse2D.Double raindrop4 = new Ellipse2D.Double(200.0, circleY, 50.0, 50.0);
	JFrame gameFrame = new JFrame();
	int width = Toolkit.getDefaultToolkit().getScreenSize().width / 2;
	int length = Toolkit.getDefaultToolkit().getScreenSize().height / 2;
	int y = 0;

	public static void main(String[] args)
	{
		new Main().getGoing(null);

	}

	private void getGoing(Graphics g)
	{
		RainDrop rain = new RainDrop(g);
		gameFrame.setVisible(true);
		gameFrame.add(this);
		gameFrame.setSize(width, length);
		gameFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void paint(Graphics g)
	{
		Graphics2D g2 = (Graphics2D) g;
		g.drawRect(20, 20 + y, 25, 25);
		g.setColor(Color.BLUE);
		g.fillRect(20, 20 + y, 25, 25);
		g2.draw(raindrop);
		g2.draw(raindrop2);
		g2.draw(raindrop3);
		g2.draw(raindrop4);
		repaint();
		y += 1;
		circleY += 1;
	}
}
