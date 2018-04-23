package view;

import java.awt.Color;
import javax.swing.JMenu;
import controller.Events;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;

public class MenuBar extends JMenuBar{

	private static final String FILE = "File";
	private static final long serialVersionUID = 1L;
	private static final Color FOREGROUND = Color.white;
	private static final String REPORT = "Informe simulacion";
	private static final String ADD_SPECIE = "Agregar especie";
	private static final Color BACKGROUND = Color.decode("#1c313a");

	public MenuBar(ActionListener controller) {
		setBackground(BACKGROUND);
		setFont(this.getFont().deriveFont(20.0f));
		
		JMenu archive = new JMenu(FILE);
		archive.setForeground(FOREGROUND);
		archive.setFont(archive.getFont().deriveFont(20.f));
		
		JMenuItem folder = new JMenuItem(ADD_SPECIE);
		folder.setBackground(BACKGROUND);
		folder.setForeground(FOREGROUND);
		folder.addActionListener(controller);
		folder.setFont(folder.getFont().deriveFont(20.f));
		folder.setActionCommand(Events.ADD_SPECIE.toString());
		archive.add(folder);
		
		JMenuItem report = new JMenuItem(REPORT);
		report.setBackground(BACKGROUND);
		report.setForeground(FOREGROUND);
		report.addActionListener(controller);
		report.setFont(report.getFont().deriveFont(20.f));
		report.setActionCommand(Events.SHOW_REPORT.toString());
		archive.add(report);
		
		add(archive);
	}
}