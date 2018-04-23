package controller;

import model.Animal;
import model.Echosystem;
import model.Specie;

import javax.swing.JOptionPane;
import javax.swing.Timer;
import view.SimulatorJFrame;
import persistence.FileManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class ControllerProject implements ActionListener{

	private int timeLapse;
	private Timer generalTimer;
	private Echosystem echosystem;
	private FileManager fileManager;
	private SimulatorJFrame mainWindow;
	
	public ControllerProject() {
		echosystem = new Echosystem();
		fileManager = new FileManager();
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

	private void init() {
		if (!echosystem.getListSpecies().isEmpty()) {
			generalTimer = new Timer(1000, new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					checkForSpecies();
					echosystem.giveBirth();
					echosystem.moveAnimals();
					echosystem.checkNaturalDead();
					echosystem.impregnateAnimals();
					echosystem.incrementAnimalAge();
					mainWindow.refreshSpecie(echosystem.getListSpecies());
				}
			});
			generalTimer.start();
		}else {
			addSpecie();
		}
	}

	private void addSpecie() {
		mainWindow.addSpecie();
	}
	
	private void acceptSpecie() {
		Specie sp = mainWindow.acceptSpecie();
		echosystem.addSpecie(sp);
		for (int i = 0; i < 20; i++) {
			Animal an = echosystem.createAnimal();
			echosystem.addAnimal(sp, an);
		}
	}
	
	private void checkForSpecies() {
		ArrayList<Specie> list = echosystem.getListSpecies();
		for (Specie specie : list) {
			if(specie.checkStatus()) {
				stop();
			}
		}
	}
	
	private void stop() {
		generalTimer.stop();
		JOptionPane.showMessageDialog(mainWindow, "Especie terminada");
	}

	private void showReport() {
		try {
			fileManager.writeReport(timeLapse, echosystem.reportSpecies());
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}