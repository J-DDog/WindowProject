package ctec.view;

import javax.swing.JFrame;
import ctec.controller.WindowController;
import ctec.view.WindowPanel;

public class WindowFrame extends JFrame
{
	private WindowController baseController;
	private WindowPanel basePanel;
	
	private WindowFrame(){}
	
	public WindowFrame(WindowController mainController)
	{
		this.baseController = mainController;
		basePanel = new WindowPanel(mainController);
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(400, 400);
		this.setTitle("My Window");
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public WindowController getMainController()
	{
		return baseController;
	}
	
}
