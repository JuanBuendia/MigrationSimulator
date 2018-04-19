package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Events;

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
		pnActionButtons.setLayout(new GridLayout(1, 2));
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(controller);
		btnStart.setActionCommand(Events.INIT.toString());
		pnActionButtons.add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(controller);
		btnStop.setActionCommand(Events.STOP.toString());
		pnActionButtons.add(btnStop);
		
		add(pnActionButtons, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void initEnvironmentPanel(){
	environmentPanel.initEnvironment();
	}
}
