package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import gui.MenuSelection;
import gui.WindowFrame;

public class BackButtonListener implements ActionListener {
	WindowFrame frame;
	
	public BackButtonListener(WindowFrame frame){
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		MenuSelection viewer = frame.getMenuSelection();
		
		frame.setupPanel(viewer);
	}

}
