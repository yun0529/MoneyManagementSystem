package Listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JTextField;

import gui.ViewMoney;
import gui.WindowFrame;

public class ViewButtonListener implements ActionListener {
	WindowFrame frame;
	
	public ViewButtonListener(WindowFrame frame){
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		JButton button = (JButton)e.getSource();
		ViewMoney viewer = frame.getViewMoney();
		
		frame.setupPanel(viewer);
	}

}
