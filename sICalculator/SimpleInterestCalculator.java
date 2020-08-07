package sICalculator;

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleInterestCalculator extends JFrame implements ActionListener{
	Container cp;
	JLabel pa,ny,ra,si;
	JTextField patf,nytf,ratf,sitf;
	JButton calculate, reset;
	
	public SimpleInterestCalculator()
	{
		cp=getContentPane();
		cp.setLayout(new GridLayout(5,2));
		
		setVisible(true);
		setTitle("Simple Interest Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500,500);
		
		pa = new JLabel("Principal amount:");
		patf= new JTextField(20);
		ny =new JLabel("No. of years:");
		nytf= new JTextField(20);
		ra= new JLabel("Rate:");
		ratf= new JTextField(20);
		si= new JLabel("Simple Interest:");
		sitf= new JTextField(20);
		
		calculate= new JButton("Calculate");
		calculate.addActionListener(this);
		reset= new JButton("Reset");
		reset.addActionListener(this);
		
		cp.add(pa);cp.add(patf);
		cp.add(ny);cp.add(nytf);
		cp.add(ra);cp.add(ratf);
		cp.add(calculate);cp.add(reset);
		cp.add(si);cp.add(sitf);
		
	}
	

	public static void main(String[] args) {
		
		SimpleInterestCalculator s= new SimpleInterestCalculator();

	}


	public void actionPerformed(ActionEvent e) {
		if(e.getSource()==calculate)
		{
			double n1= Double.parseDouble(patf.getText());
			double n2= Double.parseDouble(nytf.getText());
			double n3= Double.parseDouble(ratf.getText());
			double n4= n1*n2*n3;
			sitf.setText(""+n4);
		}
		if(e.getSource()==reset)
		{
			patf.setText("");
			nytf.setText("");
			ratf.setText("");
			sitf.setText("");
		}
		
	}

}

