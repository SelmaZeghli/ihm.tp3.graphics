package ihm.supmti.graphics;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Graphics extends JFrame implements ActionListener{
	JButton btnRectangle, btnCircle;
	GraphicsPanel graphicsPanel;
	Graphics(){
		
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		this.setSize(550, 260);
		CenterJFrame(this);
		btnCircle = new JButton("Cercle");
		btnRectangle = new JButton("Rectangle");
		this.add(btnCircle, BorderLayout.SOUTH);
		this.add(btnRectangle, BorderLayout.NORTH);
		btnCircle.addActionListener(this);
		btnRectangle.addActionListener(this);
		graphicsPanel = new GraphicsPanel();
		this.add(graphicsPanel, BorderLayout.CENTER);
	}
	
	public static void main(String[] args) {
		 new Graphics();
	}
	
	
	public void CenterJFrame(JFrame jframe) {
		Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		int newWidth = dimension.width/2 - jframe.getSize().width/2; 
		int newHeight = dimension.height/2 - jframe.getSize().height/2;
		jframe.setLocation(newWidth, newHeight);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == btnRectangle) {
			graphicsPanel.SetRectangle();
			graphicsPanel.paintComponent(getGraphics());
		}
		else if(e.getSource() == btnCircle) {
			graphicsPanel.SetCircle();
			graphicsPanel.paintComponent(getGraphics());
		}
		
	}

}
