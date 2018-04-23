package view;

import model.Specie;
import java.awt.Color;
import controller.Events;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;

public class SimulatorJFrame extends JFrame{

	private JPanel pnActionButtons;
	private DialogAddSpecie dialogAddSpecie;
	private EnvironmentPanel environmentPanel;
	private static final String STOP = "Stop";
	private static final String START = "Start";
	private static final long serialVersionUID = 1L;
	private static final String LOGO = "/img/logo.png";
	private static final Color FOREGROUND = Color.white;
	private static final String TITLE = "Disputa territorial";
	private static final Color BACKGROUND = Color.decode("#1c313a");

	public SimulatorJFrame(ActionListener controller){
		setTitle(TITLE);
		setExtendedState(MAXIMIZED_BOTH);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setIconImage(new ImageIcon(getClass().getResource(LOGO)).getImage());
		setJMenuBar(new MenuBar(controller));
		
		dialogAddSpecie = new DialogAddSpecie(this, controller);
		
		environmentPanel = new EnvironmentPanel(); 
		add(environmentPanel, BorderLayout.CENTER);
		
		pnActionButtons = new JPanel();
		pnActionButtons.setLayout(new GridLayout(1, 2));
		
		JButton btnStart = new JButton(START);
		btnStart.setBackground(BACKGROUND);
		btnStart.setForeground(FOREGROUND);
		btnStart.addActionListener(controller);
		btnStart.setActionCommand(Events.INIT.toString());
		btnStart.setFont(btnStart.getFont().deriveFont(20.f));
		pnActionButtons.add(btnStart);
		
		JButton btnStop = new JButton(STOP);
		btnStop.setBackground(BACKGROUND);
		btnStop.setForeground(FOREGROUND);
		btnStop.addActionListener(controller);
		btnStop.setActionCommand(Events.STOP.toString());
		btnStop.setFont(btnStop.getFont().deriveFont(20.f));
		pnActionButtons.add(btnStop);
		
		add(pnActionButtons, BorderLayout.SOUTH);
		setVisible(true);
	}
	
	public void addSpecie() {
		dialogAddSpecie.setVisible(true);
	}
	
	public Specie acceptSpecie() {
		Specie specie = dialogAddSpecie.getNewSpecie();
		dialogAddSpecie.setVisible(false);
		dialogAddSpecie.setDefaultData();
		return specie;
	}
	
	public void refreshSpecie(ArrayList<Specie> speciesToMove) {
		for (Specie specie: speciesToMove) {
			environmentPanel.refreshAnimals(specie.getAnimals());
		}
	}
}