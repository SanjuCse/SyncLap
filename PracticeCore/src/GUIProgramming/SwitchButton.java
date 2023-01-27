package GUIProgramming;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwitchButton extends Frame implements ActionListener {
	Frame frame;
	Button button, button2;

	public static void main(String[] args) {
		SwitchButton switchButton = new SwitchButton("SwitchButton");

	}

	public SwitchButton(String string) {
		super(string);
		this.setVisible(true);
		this.setSize(400, 400);
		this.setLayout(new FlowLayout());

		button = new Button("HIDE");
		button.addActionListener(this);
		this.add(button);

		button2 = new Button("SHOW");
		button2.addActionListener(this);
		this.add(button2);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		Button btn = (Button) e.getSource();
//		if (btn == button)
//			button.setName("HIDE");
//		else
//			button.setName("HIDE");
//		System.out.println(button.setName("HIDE"));
	}

}
