package calculator;
import java.awt.*;
import javax.swing.*;
public class Calculator extends JFrame{
	
	Container cp;
	JTextField tf;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	JPanel p;
	
	public Calculator()
	{
		cp=getContentPane();
		cp.setLayout(new BorderLayout());
		
		setVisible(true);
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Calculator");
		
		tf= new JTextField(20);
		
		p= new JPanel();
		p.setLayout(new GridLayout(4,6,20,20));
		p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);p.add(b10);
		p.add(b11);p.add(b12);p.add(b13);p.add(b14);p.add(b15);p.add(b16);p.add(b17);p.add(b18);p.add(b19);p.add(b20);
		p.add(b21);p.add(b22);p.add(b23);p.add(b24);
		
		cp.add(tf,"North");
		cp.add(p,"Center");
		
	}
	
	public static void main(String[] args) {
		Calculator c= new Calculator();
	}
}
