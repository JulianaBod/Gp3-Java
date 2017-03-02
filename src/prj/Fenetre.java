package prj;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;

import javafx.scene.layout.Border;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

public class Fenetre extends JFrame {
	
	private JPanel buildContentPane(){
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
	
		JLabel label = new JLabel("Bienvenue dans 4 mots pour 1 mot \n");
		
		panel.add(label);
		
		return panel;
	}	

	public Fenetre(){
		
		this.setTitle("4 mots pour 1 mot");
		this.setSize(700, 700);
		this.setResizable(true);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setContentPane(buildContentPane());
		
		
		this.setLayout(new GridLayout(2, 2));
		
		JButton button1 = new JButton("1");
		JButton button2 = new JButton("2");
		JButton button3 = new JButton("3");
		JButton button4 = new JButton("4");
		
		this.getContentPane().add(button1);
		//button1.setSize(10, 10);
		button1.setLocation(300, 300);
	
		this.getContentPane().add(button2);
		button2.setSize(10, 10);
		this.getContentPane().add(button3);
		button3.setSize(10, 10);
		this.getContentPane().add(button4);
		button4.setSize(10, 10);
		
		
		

		this.setVisible(true);
		
	}

}
