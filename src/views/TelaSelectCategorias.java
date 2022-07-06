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
import javax.swing.Scrollable;
import javax.swing.table.DefaultTableModel;

import connectionFactory.ConnectionFactory;
import repository.ClienteDAO;
import repository.ServicoDAO;

public class TelaSelectCategorias extends JFrame {
	Connection c;
	private JPanel pn1;
	private JLabel lb1,lb2,lb3;
	private JButton voltar;
	private ImageIcon logo,logo2,fundo,teste;
	private JScrollPane scrollTable;
	private JTable table;
	private PreparedStatement st;
	private ResultSet rs;
	ServicoDAO dao;
	String sql = "select * from T_AUTO_CATEGORIA";
	
	public TelaSelectCategorias() {
		Componentes();
		Eventos();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(false);
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
		lb2 = new JLabel ("Tabela Serviços");
		lb2.setFont( new Font("Lucida Bright Demibold", Font.BOLD, 41) );
		lb2.setForeground(verde);
		lb2.setBounds(420,10,400,100);
		add(lb2);
		
		//Aba de cima
		pn1 = new JPanel();
		pn1.setBounds(1, 10, 1080 , 100);
		pn1.setBackground(Color.WHITE);
		add(pn1);
		
		scrollTable = new JScrollPane();
		scrollTable.setBounds(130, 200, 815, 383);
		add(scrollTable);
		scrollTable.setBackground(Color.green);
		
		
		//Imagem de fundo
		fundo = new ImageIcon("imgs/fundo.jpg");			
		lb3 = new JLabel (fundo);
		lb3.setBounds(1, 1 ,1080,720);
		lb3.setVisible(true);
		add(lb3);
		
		c = new ConnectionFactory().conectar();
		executarTabela(sql);
	}
	
	public void Eventos() {
	
		
	}
	
	public void executarTabela(String sql) {
        try {
           
            st = c.prepareStatement(sql);
            rs= st.executeQuery();
            DefaultTableModel tableModel = new DefaultTableModel(new String[] { "Id", "Nome","Descrição" }, 0) {
                public boolean isCellEditable(int row, int col) {
                    return false;
                }
            };
            int qtdeColunas = rs.getMetaData().getColumnCount();
            for (int indice = 1; indice <= qtdeColunas; indice++) {
//                tableModel.addColumn(resultado.getMetaData().getColumnName(indice));
            }
            table = new JTable(tableModel);
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();

            while (rs.next()) {
                try {
                    String[] dados = new String[qtdeColunas];
                    for (int i = 1; i <= qtdeColunas; i++) {
                        dados[i - 1] = rs.getString(i);
                    }
                    dtm.addRow(dados);
                    System.out.print("");
                } catch (SQLException erro) {
                    System.out.println(erro);
                }
                scrollTable.setViewportView(table);
            }

            rs.close();
            st.close();
        } catch (SQLException erro) {
            System.out.println(erro);
        }
    }

	

	public static void main(String[] args) {
		new TelaSelectCategorias();	
		
		
	}
	
	

}

