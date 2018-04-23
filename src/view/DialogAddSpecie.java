package view;

import model.Specie;
import model.Echosystem;
import controller.Events;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JFrame;
import javax.swing.JDialog;
import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import java.awt.event.ActionListener;

public class DialogAddSpecie extends JDialog{

	private JSpinner spSurvival;
	private JSpinner spKnowledge;
	private JSpinner spAdaptability;
	private JTextField txSpecieName;
	private static final String ACCEPT = "Aceptar";
	private static final long serialVersionUID = 1L;
	private static final Color FOREGROUND = Color.white;
	private static final String NAME = "Nombre de la especie:";
	private static final Color BACKGROUND = Color.decode("#1c313a");
	private static final String KNOWLEGDE = "Conocimiento del terreno:";
	private static final String SUVARVILITY = "Capacidad de supervivencia:";

	public DialogAddSpecie(JFrame frame, ActionListener controller) {
		super(frame);
		setSize(500, 500);
		setLocationRelativeTo(frame);
		setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
		
		txSpecieName = new JTextField();
		txSpecieName.setBorder(BorderFactory.createTitledBorder(NAME));
		txSpecieName.setFont(txSpecieName.getFont().deriveFont(24.f));
		add(txSpecieName);
		
		spSurvival = new JSpinner();
		spSurvival.setBorder(BorderFactory.createTitledBorder(SUVARVILITY));
		spSurvival.setFont(spSurvival.getFont().deriveFont(24.f));
		add(spSurvival);
		
		spKnowledge = new JSpinner();
		spKnowledge.setBorder(BorderFactory.createTitledBorder(KNOWLEGDE));
		spKnowledge.setFont(spKnowledge.getFont().deriveFont(24.f));
		add(spKnowledge);
		
		spAdaptability = new JSpinner();
		spAdaptability.setBorder(BorderFactory.createTitledBorder("Capacidad de adaptacion:"));
		spAdaptability.setFont(spAdaptability.getFont().deriveFont(24.f));
		add(spAdaptability);
		
		JButton btnAccept = new JButton(ACCEPT);
		btnAccept.setBackground(BACKGROUND);
		btnAccept.setForeground(FOREGROUND);
		btnAccept.addActionListener(controller);
		btnAccept.setAlignmentX(Component.CENTER_ALIGNMENT);
		btnAccept.setFont(btnAccept.getFont().deriveFont(24.f));
		btnAccept.setActionCommand(Events.ACCEPT_SPECIE.toString());
		add(btnAccept);
	}
	
	public void setDefaultData() {
		spSurvival.setValue(50);
		spKnowledge.setValue(50);
		txSpecieName.setText(null);
		spAdaptability.setValue(50);
	}
	
	public Specie getNewSpecie() {
		return Echosystem.createSpecie(txSpecieName.getText(), ((int) spSurvival.getValue()),
				((int) spAdaptability.getValue()), ((int) spKnowledge.getValue()));
	}
}