package view;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;
import model.Animal;

public class EnvironmentPanel extends JPanel{

	private ArrayList<Animal> listAnimals;
	private static final long serialVersionUID = 1L;

	public EnvironmentPanel(){
		
	}
	
	public void initEnvironment(){
		
	}

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
					g.fillOval(animal.getX(), animal.getY(), 50, 50);
				}
			}
		}
	}
}