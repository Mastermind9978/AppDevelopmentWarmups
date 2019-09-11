import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.JFrame;

public class mouseTracker extends JPanel
{
	int x = 0;
	int y = 0;

	public mouseTracker()
	{
		JFrame frame = new JFrame();
		frame.add(this);
		frame.setVisible(true);
		setFocusable(true);

		//MouseListener mouse = new mouseTrackerInterface();
		//addMouseListener(mouse);

		MouseMotionListener mouse2 = new mouseMotion();
		addMouseMotionListener(mouse2);
	}

	public static void main(String[]args)
	{
		mouseTracker tracker = new mouseTracker();
	}

/*	public class mouseTrackerInterface implements MouseListener
	{
		public void mouseClicked(MouseEvent e){
			x = e.getX();
			y = e.getY();
			System.out.println("X: "+x+"/tY: "+y);
		}
		public void mouseExited(MouseEvent e){}
		public void mousePressed(MouseEvent e){}
		public void mouseReleased(MouseEvent e){}
		public void mouseEntered(MouseEvent e){}
	}
*/
	public class mouseMotion implements MouseMotionListener
	{
		public void mouseDragged(MouseEvent e){}
		public void mouseMoved(MouseEvent e)
		{
			x = e.getX();
			y = e.getY();
			System.out.println("X: "+x+"\tY: "+y);
		}
	}
}
