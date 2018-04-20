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

	public void refreshHero(ArrayList<Animal> animals) {
		this.listAnimals = animals;
		repaint();
	}
	
	@Override
	public void paint(Graphics g) {
		super.paint(g);
		for (Animal animal : listAnimals) {
			if (animal != null) {
				g.fillOval(animal.getX(), 100, 50, 50);
			}
		}
	}
}