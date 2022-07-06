package views;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.Scrollable;
import javax.swing.table.DefaultTableModel;

import connectionFactory.ConnectionFactory;
import repository.ClienteDAO;
import model.Cliente;
import repository.ClienteDAO;

public class TelaCorretorDelete extends JFrame {
	private JPanel pn1;
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
	private JButton voltar,deletar;
	private ImageIcon logo,logo2,fundo,teste;
	private JTextField id;
	String sql = "SELECT * FROM limateriais";
	private int rs2;
	private PreparedStatement st;
	private ResultSet rs;
	ClienteDAO dao;
	
	
	public TelaCorretorDelete() {
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
		lb2 = new JLabel ("DELETAR CLIENTE");
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
		lb4 = new JLabel("Digite o código do cliente:");
		lb4.setBounds(185,300,500,50);
	    lb4.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb4.setForeground(Color.decode("#1E5128"));
		add(lb4);
		
		
		
		id = new JTextField();
		id.setBounds(460,312, 150, 30);
		id.setFont(new Font("Arial", Font.BOLD, 16));
		id.setForeground(Color.BLACK);
		add(id);	
		
			
			
		deletar = new JButton("Deletar");
		deletar.setBounds(460, 500, 150, 55);
		deletar.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(deletar);
		deletar.setBackground(verde);
		deletar.setForeground(Color.white);
		
		voltar = new JButton("Voltar");
		voltar.setBounds(120, 600, 150, 55);
		voltar.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(voltar);
		voltar.setBackground(verde);
		voltar.setForeground(Color.white);	
		
		
		//Imagem de fundo
		fundo = new ImageIcon("imgs/fundo.jpg");			
		lb3 = new JLabel (fundo);
		lb3.setBounds(1, 1 ,1080,720);
		lb3.setVisible(true);
		add(lb3);
		
		
	}
	
	public void Eventos() {
		deletar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				ClienteDAO dao = new ClienteDAO();		
                  
            
              
             	try {
					dao.delete(Long.parseLong(id.getText()));
					JOptionPane.showMessageDialog(null,"Conta Deletada");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"Erro no cadastro");
				}
                              
			}
			});
			voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				 new TelaCorretor().setVisible(true);				
				  setVisible(false);
				 
			
				}
			 
		
			
		
		});
	
		
	}
	
	
	public static void main(String[] args) {
		new TelaCorretorDelete();	
		
		
	}
	
	

}
