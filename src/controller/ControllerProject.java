package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;

import model.Echosystem;
import model.Specie;
import view.SimulatorJFrame;

public class ControllerProject implements ActionListener{

	private Echosystem echosystem;
	private SimulatorJFrame mainWindow;
	
	public ControllerProject() {
		echosystem = new Echosystem();
		mainWindow = new SimulatorJFrame(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		switch (Events.valueOf(e.getActionCommand())) {
		case ADD_SPECIE:
			addSpecie();
			break;
		case INIT:
			init();
			break;
		case SHOW_REPORT:
			showReport();
			break;
		case STOP:
			stop();
			break;
		case ACCEPT_SPECIE:
			acceptSpecie();
		default:
			break;

		}
	}

	private void acceptSpecie() {
		echosystem.addSpecie(mainWindow.acceptSpecie(0));
	}

	private void stop() {
		
	}

	private void showReport() {
		
	}

	private void init() {
		final Specie specie = Echosystem.createSpecie(0, "mutante", 80, 40, 10);
		echosystem.addSpecie(specie);
		
		Timer timer = new Timer(1000, new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				echosystem.addAnimal(specie, echosystem.createAnimal());
				echosystem.moveAnimals(specie);
				mainWindow.refreshSpecie(echosystem.getAnimals(specie));
			}
		});
		timer.start();
	}

	private void addSpecie() {
		mainWindow.addSpecie();
	}
}