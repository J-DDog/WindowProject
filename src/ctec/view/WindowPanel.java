package ctec.view;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SpringLayout;
import javax.swing.SwingConstants;

import ctec.controller.WindowController;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

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
		baseLayout.putConstraint(SpringLayout.WEST, firstButton, 162, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.NORTH, firstButton, 29, SpringLayout.SOUTH, firstTextField);
		baseLayout.putConstraint(SpringLayout.NORTH, firstTextField, 60, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, firstTextField, 150, SpringLayout.WEST, this);
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
	}
}
