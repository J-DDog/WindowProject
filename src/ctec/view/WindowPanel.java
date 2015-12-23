package ctec.view;


import javax.swing.*;

import java.awt.event.*;
import java.awt.Color;

import ctec.controller.WindowController;


public class WindowPanel extends JPanel
{
	
	private WindowController baseController;
	private JButton firstButton;
	private JTextField firstTextField;
	private SpringLayout baseLayout;
	
	public WindowPanel(WindowController mainController)
	{
		this.baseController = mainController;
		
		
		baseLayout = new SpringLayout();
		firstButton = new JButton("My Button");
		firstTextField = new JTextField();

		firstTextField.setColumns(10);
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.add(firstTextField);
		this.add(firstButton);
		
	}
	
	private void setupLayout()
	{
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 60, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 150, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 29, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 0, SpringLayout.WEST, firstTextField);
		baseLayout.putConstraint(SpringLayout.EAST, firstButton, 0, SpringLayout.EAST, firstTextField);
		
	}
	
	private void changeRandomColor()
	{
		int red, green, blue;
		red = (int) (Math.random() * 256);
		green = (int) (Math.random() * 256);
		blue = (int) (Math.random() * 256);
		
		this.setBackground(new Color(red, green, blue));
	}
	
	private void setupListeners()
	{
		firstButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				firstTextField.setText("Wow, This is amazing");
			}
		});
		
		this.addMouseListener(new MouseListener()
		{

			@Override
			public void mouseClicked(MouseEvent clicked)
			{
				// When you Click the Mouse change to random color background
//				changeRandomColor();
			}

			@Override
			public void mousePressed(MouseEvent presses)
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseReleased(MouseEvent released)
			{
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent entered)
			{
				// Randomize Background on mouse entered panel
//				changeRandomColor();
			}

			@Override
			public void mouseExited(MouseEvent exited)
			{
				// Randomize Background on mouse exited panel
//				changeRandomColor();
			}
		
		});
		
		this.addMouseMotionListener(new MouseMotionListener()
		{

			@Override
			public void mouseDragged(MouseEvent dragged)
			{
				// TODO Auto-generated method stub
				
				//changeRandomColor();
				
			}

			@Override
			public void mouseMoved(MouseEvent moved)
			{
				// TODO Auto-generated method stub
				
			}
			
		});
	}
}
