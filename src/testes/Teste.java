package testes;


import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Cliente;
import repository.ClienteDAO;
import repository.ServicoDAO;

public class Teste {
	public static void main(String[] args) {
	ServicoDAO dao = new ServicoDAO();
	Cliente bruno = new Cliente();
	
	Calendar hoje = Calendar.getInstance();
	Date data = new Date(hoje.getTimeInMillis());
	
	
	bruno.setNome("Bruno Aquino");
	bruno.setEmail("brunoaquino@gmail.com");
	bruno.setTelefone(5511913131311L);
	bruno.setCpf(52641212811L);
//	bruno.setDatanasc(data);
	bruno.setEndereco("Avenida Yervant");
	
	
	
	try {
		dao.selectServ();
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
}
}