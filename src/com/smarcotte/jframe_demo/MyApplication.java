package com.smarcotte.jframe_demo;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MyApplication extends JFrame implements ActionListener
{
	// class level reference
	private JLabel lblName;
	private JTextField txfName;
	private JButton btnRun;
	private JButton btnExit;
	
	// constructor
	public MyApplication()
	{
		// set the layout manager
		this.setLayout(new FlowLayout());
		
		// create our objects
		lblName = new JLabel("Enter name: ");
		txfName = new JTextField(10);
		btnRun = new JButton("Click Here");
		btnExit = new JButton("Exit");
		
		// activate the button (click event)
		btnRun.addActionListener(this);
		btnExit.addActionListener(this);
		
		// add object to JFrame
		this.add(lblName);
		this.add(txfName);
		this.add(btnRun);
		this.add(btnExit);
		
		// display the JFrame here OR in the Launcher class
		// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// ...
	}

	@Override
	public void actionPerformed(ActionEvent ev)
	{
		// tell Java what to do when the button is pressed
		if(ev.getSource() == btnRun)
		{
			// run this code id the btnRun is clicked
			String name = txfName.getText();
			JOptionPane.showMessageDialog(this, "Hello " + name + "!");
		}
		else if(ev.getSource() == btnExit)
		{
			// run this code if the btnExit is clicked
			System.exit(0);
		}
		else
		{
			JOptionPane.showMessageDialog(this, "Error. Invalid button");
		}
		

	}

}
