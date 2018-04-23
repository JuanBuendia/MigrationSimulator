package view;

import model.Animal;
import model.Status;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.util.ArrayList;

public class EnvironmentPanel extends JPanel{

	private ArrayList<Animal> listAnimals;
	private static final long serialVersionUID = 1L;

	public void refreshAnimals(ArrayList<Animal> animals) {
		this.listAnimals = animals;
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (listAnimals != null) {
			for (Animal animal : listAnimals) {
				if (animal != null) {
					if (animal.getStatus() != Status.DEAD && animal.getStatus() != Status.EXILED) {
						g.fillOval(animal.getX(), animal.getY(), 25, 25);
					}
				}
			}
		}
	}
}