package prj;
import java.awt.Color;
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BoxLayout;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.sun.prism.Graphics;


public class Fenetre extends JFrame{
	
	
	public Fenetre(){
		setTitle("4 mots pour 1 mots"); //On donne un titre à l'application
		setSize(900,500); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
		setResizable(false); //On interdit la redimensionnement de la fenêtre
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //On dit à l'application de se fermer lors du clic sur la croix
		setContentPane(buildContentPane());
		
		//String[][] tableau = Tab.afficher();
		// Tu récupère les 4 premières casess du tableau et tu les stockent dans des String. qui remplaceront "mot 1 etc").
		
		//this.setLayout(new BorderLayout());
		//this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
		
		this.setLayout(null);
		//this.setLayout(new GridLayout(3, 1));
		//this.setLayout(new GridLayout(2, 1));
		//this.setContentPane(new GridLayout(2, 1));
		
		JButton b1 = new JButton("Mot 1");
		JButton b2 = new JButton("Mot 2");
		JButton b3 = new JButton("Mot 3");
		JButton b4 = new JButton("Mot 4");
		
		b1.setBounds(100, 50, 300, 50);
		b2.setBounds(500, 50, 300, 50);
		b3.setBounds(100, 100, 300, 50);
		b4.setBounds(500, 100, 300, 50);
		
		this.getContentPane().add(b1);
		this.getContentPane().add(b2);
		this.getContentPane().add(b3);
		this.getContentPane().add(b4);
		
		
		
		this.setVisible(true);
		
		
	}
	
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		panel.setBackground(Color.white);
		
		
		JTextField field1;
		
		field1 = new JTextField();
		field1.setColumns(10);
		
		field1.setBounds(100, 200, 400, 50);
		
		panel.add(field1); // Ajout du textField
		
	
		
		
		JButton bouton = new JButton(new CalculAction(this, "Valider !"));
		bouton.setBounds(550, 200, 150, 50);
		panel.add(bouton);
		
		//JLabel label = new JLabel("Résultat : Pas encore calculé");
		
		//panel.add(label);
		
		return panel;
	}
	

	public class CalculAction extends AbstractAction {
		private Fenetre fenetre;
		
		public CalculAction(Fenetre fenetre, String texte){
			super(texte);
			
			this.fenetre = fenetre;
		}
		
		public void actionPerformed1(ActionEvent e) { 
			//Action lors du clic sur le bouton calculer
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			
		} 
	}
	


	

	
	
}
