package art.view;

import javax.swing.JFrame;

import art.controller.ArtController;

public class ArtFrame extends JFrame{
	private ArtPanel appPanel;
	
	public ArtFrame(ArtController app)
	{
		super();
		appPanel = new ArtPanel(app);
		
		setupFrame();
	}
	
	private void setupFrame()
	{
		this.setSize(1063, 768);
		this.setContentPane(appPanel);
		this.setTitle("Modern Art");
		this.setVisible(true);
	}
}
