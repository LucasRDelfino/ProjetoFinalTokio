package views;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.URL;
import javax.sound.sampled.*;
import java.io.*;



public class TelaCorretor extends JFrame{
	private JPanel pn1;
	private JLabel lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8,lb9,lb10;
	private JButton bt1,bt2,bt3,bt4,bt5,bt6;
	private ImageIcon logo,logo2,fundo,teste;
	

	public TelaCorretor() {
		Componentes();
		Eventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
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
		lb4 = new JLabel ("Clique no serviço desejado : ");
		lb4.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 31) );
		lb4.setBounds(15, 20 ,550 , 250);
		lb4.setForeground(verde);
		add(lb4);
		
		lb5 = new JLabel ("1 - Descobrir CPF do cliente");
		lb5.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
		lb5.setBounds(30, 410 ,540 , 250);
		lb5.setForeground(verde);
		add(lb5);	
		
		lb6 = new JLabel ("2 - Descobrir serviço do cliente");
		lb6.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
		lb6.setBounds(30, 460 ,540 , 250);
		lb6.setForeground(verde);
		add(lb6);	
		
		lb7 = new JLabel ("3 - Descobrir categoria do cliente");
		lb7.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
		lb7.setBounds(30, 510 ,540 , 250);
		lb7.setForeground(verde);
		add(lb7);	
		
		lb8 = new JLabel ("4 - Descobrir endereço do cliente");
		lb8.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
		lb8.setBounds(550, 410 ,540 , 250);
		lb8.setForeground(verde);
		add(lb8);	
		
		lb9 = new JLabel ("5 - Descobrir categoria do cliente");
		lb9.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
		lb9.setBounds(550 , 460 ,540 , 250);
		lb9.setForeground(verde);
		add(lb9);	
	
		lb10 = new JLabel ("6 - Descobrir ID do cliente");
		lb10.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 22) );
		lb10.setBounds(550, 510 ,540 , 250);
		lb10.setForeground(verde);
		add(lb10);	
		
		
		
		//botões
		bt1 = new JButton("1 - CPF");
		bt1.setBounds(150, 220, 150, 75);
		bt1.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt1);
		bt1.setBackground(verde);
		bt1.setForeground(Color.white);
		
		bt2 = new JButton("2 - SERVIÇO");
		bt2.setBounds(450, 220, 150, 75);
		bt2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt2);
		bt2.setBackground(verde);
		bt2.setForeground(Color.white);
		
		bt3 = new JButton("3 - CATEGORIAS");
		bt3.setBounds(750, 220, 150, 75);
		bt3.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt3);
		bt3.setBackground(verde);
		bt3.setForeground(Color.white);
		
		bt4 = new JButton("4 - Endereço");
		bt4.setBounds(150, 370, 150, 75);
		bt4.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt4);
		bt4.setBackground(verde);
		bt4.setForeground(Color.white);
		
		bt5 = new JButton("5 - Cat/Serviço");
		bt5.setBounds(450, 370, 150, 75);
		bt5.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt5);
		bt5.setBackground(verde);
		bt5.setForeground(Color.white);
		
		bt6 = new JButton("6 - Id Cliente");
		bt6.setBounds(750, 370, 150, 75);
		bt6.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 13) );
		add(bt6);
		bt6.setBackground(verde);
		bt6.setForeground(Color.white);
		
		
		
				
		//Imagem de fundo
		fundo = new ImageIcon("imgs/fundo.jpg");			
		lb3 = new JLabel (fundo);
		lb3.setBounds(1, 1 ,1080,500);
		lb3.setVisible(true);
		add(lb3);	
		
	}

	public void Eventos() {
		bt1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				  new TelaSelectCliente().setVisible(true);				
				  setVisible(false);
				 
			
				
			}
		});
		
		bt2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				  new TelaServico().setVisible(true);				
				  setVisible(false);
				 
			
				
			}
		});
		bt3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				 //Muda de Tela
				  new TelaCategorias().setVisible(true);				
				  setVisible(false);
				 
			
				
			}
		});
		
		
	}


	public static void main(String[] args) {
		new TelaCorretor();	
		
		
	}


}