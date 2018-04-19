package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;

import controller.Events;

public class SimulatorJFrame extends JFrame{

	private JPanel pnActionButtons;
	private DialogAddSpecie dialogAddSpecie;
	private EnvironmentPanel environmentPanel;
	private static final long serialVersionUID = 1L;
	private static final Color FOREGROUND = Color.white;
	private static final String TITLE = "Migracion forzada";
	private static final Color BACKGROUND = Color.decode("#1c313a");

	public SimulatorJFrame(ActionListener controller){
		setTitle(TITLE);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setJMenuBar(new MenuBar(controller));
		
		dialogAddSpecie = new DialogAddSpecie(this, controller);
		
		environmentPanel = new EnvironmentPanel(); 
		add(environmentPanel, BorderLayout.CENTER);
		
		pnActionButtons = new JPanel();
		pnActionButtons.setLayout(new GridLayout(1, 2));
		
		JButton btnStart = new JButton("Start");
		btnStart.addActionListener(controller);
		btnStart.setActionCommand(Events.INIT.toString());
		btnStart.setBackground(BACKGROUND);
		btnStart.setForeground(FOREGROUND);
		pnActionButtons.add(btnStart);
		
		JButton btnStop = new JButton("Stop");
		btnStop.addActionListener(controller);
		btnStop.setActionCommand(Events.STOP.toString());
		btnStop.setBackground(BACKGROUND);
		btnStop.setForeground(FOREGROUND);
		pnActionButtons.add(btnStop);
		
		add(pnActionButtons, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void addSpecie() {
		dialogAddSpecie.setVisible(true);
	}
	
	public void initEnvironmentPanel(){
		environmentPanel.initEnvironment();
	}
}
