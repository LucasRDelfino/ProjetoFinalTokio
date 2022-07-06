package testes;


import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import model.Cliente;
import repository.ClienteDAO;

public class Teste {
	public static void main(String[] args) {
	ClienteDAO dao = new ClienteDAO();
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
		dao.insert(bruno);
			
	} catch (SQLException e) {
		e.printStackTrace();
	}
	
	
}
}