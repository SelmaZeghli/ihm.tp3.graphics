package ihm.supmti.graphics;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class GraphicsPanel extends JPanel{
	boolean isRectangle, isCircle;
	GraphicsPanel(){
		
	}
	
	public void SetRectangle() {
		isRectangle = true;
		isCircle = false;
	}
	
	public void SetCircle() {
		isRectangle = false;
		isCircle = true;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		if(isRectangle) {
			g.drawRect(20,30,100,40);
			
		}
		else if(isCircle) {
			g.drawOval(20, 30, 50, 50);
			
		}
		repaint();
		
	}
}
