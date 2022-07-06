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
import repository.DadosDAO;
import model.Cliente;
import model.Dados;
import repository.ClienteDAO;

public class TelaCorretorUpdateDados extends JFrame {
	private JPanel pn1;
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
	private JButton voltar,atualizar;
	private ImageIcon logo,logo2,fundo,teste;
	private JTextField cliente,servico,categoria;
	String sql = "SELECT * FROM limateriais";
	private int rs2;
	private PreparedStatement st;
	private ResultSet rs;
	ClienteDAO dao;
	
	
	public TelaCorretorUpdateDados() {
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
		lb2 = new JLabel ("ATUALIZAR DADOS CLIENTE");
		lb2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 41) );
		lb2.setForeground(verde);
		lb2.setBounds(420,10,800,100);
		add(lb2);
		
		//Aba de cima
		pn1 = new JPanel();
		pn1.setBounds(1, 10, 1080 , 100);
		pn1.setBackground(Color.WHITE);
		add(pn1);
		
		//TextFields
		lb4 = new JLabel("Digite o código do cliente:"  );
		lb4.setBounds(100,200,500,50);
	    lb4.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb4.setForeground(Color.decode("#1E5128"));
		add(lb4);
		
		
		lb3 = new JLabel("Novo Serviço(Código):");
		lb3.setBounds(120,290,500,50);
		lb3.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb3.setForeground(Color.decode("#1E5128"));
	    add(lb3);
		
		
		lb5 = new JLabel("Novo Categoria(Código):");
		lb5.setBounds(550,290,500,50);
	    lb5.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 15) );
	    lb5.setForeground(Color.decode("#1E5128"));
		add(lb5);
		
	
				
		cliente = new JTextField();
		cliente .setBounds(315,210, 120, 30);
		cliente .setFont(new Font("Arial", Font.BOLD, 16));
		cliente .setForeground(Color.BLACK);
		add(cliente);	
		
		servico = new JTextField();
		servico.setBounds(310,300, 120, 30);
		servico.setFont(new Font("Arial", Font.BOLD, 16));
		servico.setForeground(Color.BLACK);
		add(servico);	
		
		categoria = new JTextField();
		categoria.setBounds(750,300, 120, 30);
		categoria.setFont(new Font("Arial", Font.BOLD, 16));
		categoria.setForeground(Color.BLACK);
		add(categoria);	
				
			
		atualizar = new JButton("Atualizar");
		atualizar.setBounds(460, 500, 150, 55);
		atualizar.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(atualizar);
		atualizar.setBackground(verde);
		atualizar.setForeground(Color.white);
		
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
		atualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				DadosDAO dao = new DadosDAO();		
                Dados bruno = new Dados(); 
                              
       
            	bruno.setCliente(Long.parseLong(cliente.getText()));
               	bruno.setServico(Long.parseLong(servico.getText()));
            	bruno.setCategoria(Long.parseLong(categoria.getText()));
              	
             	try {
					dao.update(bruno);
					JOptionPane.showMessageDialog(null,"Conta Atualizada");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
					JOptionPane.showMessageDialog(null,"Erro em algum campo");
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
		new TelaCorretorUpdateDados();	
		
		
	}
	
	

}
