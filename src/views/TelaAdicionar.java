package views;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Scrollable;
import javax.swing.table.DefaultTableModel;

import connectionFactory.ConnectionFactory;
import repository.ClienteDAO;

public class TelaAdicionar extends JFrame {
	private JPanel pn1;
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
	private JButton voltar;
	private ImageIcon logo,logo2,fundo,teste;
	private JTextField nome,cpf,telefone,email,dt_nasc,endereco;
	
	
	public TelaAdicionar() {
		Componentes();
		Eventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setBounds(0,0,1080,720);
		
	}	
	
	public void Componentes() {	
		setLayout(null);
		Color verde = new Color(78, 127, 83);
		Color dourado = new Color(208, 138, 28);
		
		//LOGO TOKIO
		logo = new ImageIcon("imgs/logo.png");			
		lb1 = new JLabel (logo);
		lb1.setBounds(50, 30 ,224,58);
		lb1.setVisible(true);
		add(lb1);		
		
		//TITULO
		lb2 = new JLabel ("CADASTRO");
		lb2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 41) );
		lb2.setForeground(verde);
		lb2.setBounds(420,10,400,100);
		add(lb2);
		
		//Aba de cima
		pn1 = new JPanel();
		pn1.setBounds(1, 10, 1080 , 100);
		pn1.setBackground(Color.WHITE);
		add(pn1);
		
		//TextFields
		lb4 = new JLabel("Nome Completo:");
		lb4.setBounds(115,200,500,50);
	    lb4.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb4.setForeground(Color.decode("#1E5128"));
		add(lb4);
		
		
		lb3 = new JLabel("CPF:");
		lb3.setBounds(455,200,500,50);
	    lb3.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb3.setForeground(Color.decode("#1E5128"));
		add(lb3);
		
		
		lb5 = new JLabel("Telefone:");
		lb5.setBounds(695,200,500,50);
	    lb5.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb5.setForeground(Color.decode("#1E5128"));
		add(lb5);
		
		
		lb6 = new JLabel("Email:");
		lb6.setBounds(140,350,500,50);
	    lb6.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb6.setForeground(Color.decode("#1E5128"));
		add(lb6);
		
		
		lb7 = new JLabel("Data Nascimento:");
		lb7.setBounds(375,350,500,50);
	    lb7.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb7.setForeground(Color.decode("#1E5128"));
		add(lb7);
		
		
		lb8 = new JLabel("Endereço:");
		lb8.setBounds(695,350,500,50);
	    lb8.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb8.setForeground(Color.decode("#1E5128"));
		add(lb8);
		
		nome = new JTextField();
		nome.setBounds(260,210, 120, 30);
		nome.setFont(new Font("Arial", Font.BOLD, 16));
		nome.setForeground(Color.BLACK);
		add(nome);	
		
		cpf = new JTextField();
		cpf.setBounds(510,210, 120, 30);
		cpf.setFont(new Font("Arial", Font.BOLD, 16));
		cpf.setForeground(Color.BLACK);
		add(cpf);	
		
		telefone = new JTextField();
		telefone.setBounds(780,210, 120, 30);
		telefone.setFont(new Font("Arial", Font.BOLD, 16));
		telefone.setForeground(Color.BLACK);
		add(telefone);	
		
		email = new JTextField();
		email.setBounds(210,360, 120, 30);
		email.setFont(new Font("Arial", Font.BOLD, 16));
		email.setForeground(Color.BLACK);
		add(email);	
		
		dt_nasc = new JTextField();
		dt_nasc.setBounds(530,360, 120, 30);
		dt_nasc.setFont(new Font("Arial", Font.BOLD, 16));
		dt_nasc.setForeground(Color.BLACK);
		add(dt_nasc);	
		
		endereco = new JTextField();
		endereco.setBounds(780,360, 120, 30);
		endereco.setFont(new Font("Arial", Font.BOLD, 16));
		endereco.setForeground(Color.BLACK);
		add(endereco);	
		
		
		
		
		
		//Imagem de fundo
		fundo = new ImageIcon("imgs/fundo.jpg");			
		lb3 = new JLabel (fundo);
		lb3.setBounds(1, 1 ,1080,720);
		lb3.setVisible(true);
		add(lb3);
		
		
	}
	
	public void Eventos() {
	
		
	}
	
	
	public static void main(String[] args) {
		new TelaAdicionar();	
		
		
	}
	
	

}
