package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerProject implements ActionListener{

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
		default:
			break;

		}
	}

	private void stop() {
		
	}

	private void showReport() {
		
	}

	private void init() {
		
	}

	private void addSpecie() {
		
	}
}