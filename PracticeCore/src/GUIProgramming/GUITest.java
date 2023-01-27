package GUIProgramming;

import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class GUITest {
	Frame frame;
	Button button1, button2;
	Label label1, label2, label3;
	TextField field, field2, field3;

	public GUITest(String title) {
		frame = new Frame(title);
		frame.setVisible(true);
		frame.setSize(400, 400);
		frame.setLocation(200, 200);
		System.out.println(frame.getLocation());
		frame.setBackground(Color.YELLOW);
		button1 = new Button("Add");
		button2 = new Button("Sub");
		label1 = new Label("Enter First Number");
		label2 = new Label("Enter Second Number");
		label3 = new Label("Enter Third Number");
//		frame.setLayout(new FlowLayout());
		frame.setLayout(null);
		frame.setBounds(100, 100, 100, 100);
		frame.add(label1);
		frame.add(field);
		frame.add(label2);
		frame.add(field2);
		frame.add(label3);
		frame.add(field3);
		frame.add(button1);
		frame.add(button2);
		
	}

	public static void main(String[] args) {
		GUITest guiTest = new GUITest("GUIAPP");
	}

}
