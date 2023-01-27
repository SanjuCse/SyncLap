package GUIProgramming;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIAppEvent extends Frame implements ActionListener {

	Frame frame;
	Button button, button2;
	TextField field;

	public static void main(String[] args) {
		GUIAppEvent appEvent = new GUIAppEvent("GUIAppEvent");
	}

	GUIAppEvent(String str) {
		super(str);
		this.setVisible(true);
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());

		button = new Button("OK");
		button.addActionListener(this);
		this.add(button);

		button2 = new Button("Cancel");
		button2.addActionListener(this);
		this.add(button2);

		field = new TextField(10);
		this.add(field);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Button btn = (Button)e.getSource();
		if(btn==button)
		field.setText("sanju");
		else
		field.setText("");

	}
}
