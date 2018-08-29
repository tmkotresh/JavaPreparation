package GUI;

import java.awt.*;

import javax.swing.*;

public class GUIPractice   {
	
	public static void main(String arg[]){
		
		JFrame frame = new JFrame("Cyber BeatBox");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		BorderLayout layout = new BorderLayout();
		
		JPanel background = new JPanel(layout);
		background.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		
//		JButton button = new JButton("Click Me");
//		
//		frame.getContentPane().add(BorderLayout.EAST, button);
//		JPanel panel = new JPanel();
//		
//        frame.getContentPane().add(button);
//		
		frame.setSize(300,300);
		frame.setVisible(true);
		
	}

	
	

}
