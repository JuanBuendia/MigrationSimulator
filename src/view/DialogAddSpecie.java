package view;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JTextField;
import controller.Events;
import model.Echosystem;
import model.Specie;

import java.awt.event.ActionListener;

public class DialogAddSpecie extends JDialog{

	private static final String ACCEPT = "Aceptar";
	private static final String KNOWLEGDE = "Conocimiento del terreno:";
	private static final String SUVARVILITY = "Capacidad de supervivencia:";
	private static final String NAME = "Nombre de la especie:";
	private JSpinner spSurvival;
	private JSpinner spKnowledge;
	private JSpinner spAdaptability;
	private JTextField txSpecieName;
	private static final long serialVersionUID = 1L;

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
		btnAccept.addActionListener(controller);
		btnAccept.setFont(btnAccept.getFont().deriveFont(24.f));
		btnAccept.setActionCommand(Events.ADD_SPECIE.toString());
		add(btnAccept);
	}
	
	public String getName() {
		return txSpecieName.getText();
	}
	
	public int getSurvival() {
		
	}
	
	public int getKnowledge() {
		
	}
	
	public int getAdaptability() {
		
	}
}