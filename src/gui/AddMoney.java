package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import ClassProject.MoneyManager;
import Listener.BackButtonListener;
import Listener.EditButtonListener;
import Listener.SaveButtonListener;
import Money.Money;

public class AddMoney extends JPanel{
	WindowFrame frame;
	MoneyManager moneyManager;
	Money money;
	String kind;
	String classification;
	String moneyName;
	String amount;
	int idx;
	public AddMoney(WindowFrame frame, MoneyManager moneyManager, String kind) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		this.kind = kind;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel kindLabel = new JLabel("Kind : ",JLabel.TRAILING);
		JTextField kindText = new JTextField(10);
		kindLabel.setLabelFor(kindText);
		kindText.setText(kind);
		panel.add(kindLabel);
		panel.add(kindText);
		
		JLabel classificationLabel = new JLabel("Classification : ",JLabel.TRAILING);
		JTextField classificationText = new JTextField(10);
		classificationLabel.setLabelFor(classificationText);
		panel.add(classificationLabel);
		panel.add(classificationText);
		
		JLabel nameLabel = new JLabel("Name : ",JLabel.TRAILING);
		JTextField nameText = new JTextField(10);
		nameLabel.setLabelFor(nameText);
		panel.add(nameLabel);
		panel.add(nameText);
		
		JLabel amountLabel = new JLabel("Amount : ",JLabel.TRAILING);
		JTextField amountText = new JTextField(10);
		JButton cancelButton = new JButton("cacel");
		JButton saveButton = new JButton("save");
		BackButtonListener back = new BackButtonListener(frame);
		SaveButtonListener save = new SaveButtonListener(frame,moneyManager,kindText,classificationText,nameText,amountText);
		saveButton.addActionListener(save);
		classificationLabel.setLabelFor(amountText);
		cancelButton.addActionListener(back);
		panel.add(amountLabel);
		panel.add(amountText);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
	} 
	//edit 할 경우의 생성자
	public AddMoney(WindowFrame frame, MoneyManager moneyManager, String kind, String classification,
			String moneyName, String amount, int idx) {
		this.frame = frame;
		this.moneyManager = moneyManager;
		this.kind = kind;
		this.classification = classification;
		this.moneyName = moneyName;
		this.amount = amount;
		this.idx = idx;
		
		JPanel panel = new JPanel();
		panel.setLayout(new SpringLayout());
		
		JLabel kindLabel = new JLabel("Kind : ",JLabel.TRAILING);
		JTextField kindText = new JTextField(10);
		kindLabel.setLabelFor(kindText);
		kindText.setText(kind);
		panel.add(kindLabel);
		panel.add(kindText);
		
		JLabel classificationLabel = new JLabel("Classification : ",JLabel.TRAILING);
		JTextField classificationText = new JTextField(10);
		classificationLabel.setLabelFor(classificationText);
		classificationText.setText(classification);
		panel.add(classificationLabel);
		panel.add(classificationText);
		
		JLabel nameLabel = new JLabel("Name : ",JLabel.TRAILING);
		JTextField nameText = new JTextField(10);
		nameLabel.setLabelFor(nameText);
		nameText.setText(moneyName);
		panel.add(nameLabel);
		panel.add(nameText);
		
		JLabel amountLabel = new JLabel("Amount : ",JLabel.TRAILING);
		JTextField amountText = new JTextField(10);
		amountText.setText(amount);
		JButton cancelButton = new JButton("cacel");
		JButton saveButton = new JButton("edit");
		BackButtonListener back = new BackButtonListener(frame);
		EditButtonListener save = new EditButtonListener(frame,moneyManager,kindText,classificationText,nameText,amountText,idx);
		saveButton.addActionListener(save);
		classificationLabel.setLabelFor(amountText);
		cancelButton.addActionListener(back);
		panel.add(amountLabel);
		panel.add(amountText);
		
		panel.add(saveButton);
		panel.add(cancelButton);
		
		SpringUtilities.makeCompactGrid(panel, 5, 2, 6, 6, 6, 6);
		
		this.add(panel);
	}
}
