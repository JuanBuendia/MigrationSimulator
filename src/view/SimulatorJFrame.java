package view;

import java.awt.BorderLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class SimulatorJFrame extends JFrame{

	private JPanel pnActionButtons;
	private EnvironmentPanel environmentPanel;
	private static final long serialVersionUID = 1L;
	private static final String TITLE = "Migracion forzada";

	public SimulatorJFrame(ActionListener controller){
		setTitle(TITLE);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		environmentPanel = new EnvironmentPanel(); 
		add(environmentPanel, BorderLayout.CENTER);
		
		pnActionButtons = new JPanel();
		JButton btnStart = new JButton("Start");
		pnActionButtons.add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		pnActionButtons.add(btnStop);
		
		add(pnActionButtons, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void initEnvironmentPanel(){
	environmentPanel.initEnvironment();
	}
}
