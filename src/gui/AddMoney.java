package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class AddMoney extends JFrame{
	public AddMoney(String title) {
		super(title);
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel kindLabel = new JLabel("Kind : ",JLabel.TRAILING);
		JTextField kindText = new JTextField(10);
		kindLabel.setLabelFor(kindText);
		panel.add(kindLabel);
		panel.add(kindText);
		
		JLabel classificationLabel = new JLabel("Classification : ",JLabel.TRAILING);
		JTextField classificationText = new JTextField(10);
		classificationLabel.setLabelFor(classificationText);
		panel.add(classificationLabel);
		panel.add(classificationText);
		
		JLabel nameLabel = new JLabel("name : ",JLabel.TRAILING);
		JTextField nameText = new JTextField(10);
		nameLabel.setLabelFor(nameText);
		panel.add(nameLabel);
		panel.add(nameText);
		
		JLabel amountLabel = new JLabel("Classification : ",JLabel.TRAILING);
		JTextField amountText = new JTextField(10);
		classificationLabel.setLabelFor(amountText);
		panel.add(amountLabel);
		panel.add(amountText);
		
		panel.add(new JButton("save"));
		panel.add(new JButton("cacel"));
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		this.setSize(300,300);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setContentPane(panel);
		this.setVisible(true);
	}
}
