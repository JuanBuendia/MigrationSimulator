package view;

import java.awt.BorderLayout;

import javax.swing.JFrame;

public class SimulatorJFrame extends JFrame{

	private EnvironmentPanel environmentPanel;
	private static final long serialVersionUID = 1L;
	private static final String TITLE = "Migracion forzada";

	public SimulatorJFrame(){
		setTitle(TITLE);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		environmentPanel = new EnvironmentPanel(); 
		add(environmentPanel, BorderLayout.CENTER);
		
		setVisible(true);
	}
	
	public void initEnvironmentPanel(){
	environmentPanel.initEnvironment();
	}
}
