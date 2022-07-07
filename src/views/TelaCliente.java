package views;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;



public class TelaCliente extends JFrame{
	private JPanel pn1;
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10;
	private JButton bt1,bt2,bt3,bt4,bt5,bt6,voltar;
	private ImageIcon logo,logo2,fundo,teste;
	

	public TelaCliente() {
		Componentes();
		Eventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);
		setLocationRelativeTo(null);
		setBounds(0,0,1080,720);
		
		
		
		
		
		
	}	
	
	public void Componentes() {	
   		//COR DE FUNDO
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
		lb2 = new JLabel ("Painel do Cliente");
		lb2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 41) );
		lb2.setForeground(verde);
		lb2.setBounds(420,10,400,100);
		add(lb2);
		
		//Aba de cima
		pn1 = new JPanel();
		pn1.setBounds(1, 10, 1080 , 100);
		pn1.setBackground(Color.WHITE);
		add(pn1);
		
		//Frase		
		lb4 = new JLabel ("Clique em qual serviço deseja usar : ");
		lb4.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 31) );
		lb4.setBounds(15, 50 ,750 , 250);
		lb4.setForeground(verde);
		add(lb4);
	
		
		//botões
		bt1 = new JButton("1 - CADASTRO");
		bt1.setBounds(250, 320, 160, 75);
		bt1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt1);
		bt1.setBackground(verde);
		bt1.setForeground(Color.white);
		
		bt2 = new JButton("2 - ATUALIZAR");
		bt2.setBounds(550, 320, 160, 75);
		bt2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt2);
		bt2.setBackground(verde);
		bt2.setForeground(Color.white);
		
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
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				  new TelaAdicionar().setVisible(true);				
				  setVisible(false);
				 
			
				
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				 new TelaUpdateDadosCliente().setVisible(true);				
				  setVisible(false);
				 
			
				}
				 
			
				
			
		});
		voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				 new TelaInicial().setVisible(true);				
				  setVisible(false);
				 
			
				}
				 
			
				
			
		});
	
		
	}


	public static void main(String[] args) {
		new TelaCliente();	
		
		
	}


}