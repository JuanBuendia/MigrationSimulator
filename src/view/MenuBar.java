package view;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import controller.Events;

public class MenuBar extends JMenuBar{

	private static final long serialVersionUID = 1L;
	private static final Color FOREGROUND = Color.white;
	private static final Color BACKGROUND = Color.decode("#1c313a");

	public MenuBar(ActionListener controller) {
		setBackground(BACKGROUND);
		setFont(this.getFont().deriveFont(20.0f));
		
		JMenu archive = new JMenu("File");
		archive.setForeground(FOREGROUND);
		
		JMenuItem folder = new JMenuItem("Agregar especie");
		folder.setActionCommand(Events.ADD_SPECIE.toString());
		folder.addActionListener(controller);
		folder.setBackground(BACKGROUND);
		folder.setForeground(FOREGROUND);
		archive.add(folder);
		
		add(archive);
	}
}