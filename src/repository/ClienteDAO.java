package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connectionFactory.ConnectionFactory;
import model.Cliente;

public class ClienteDAO {
	private Connection conexao;
	
	
	public ClienteDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(Cliente cliente) throws SQLException {
		String sql = "insert into T_AUTO_CLIENTE (cd_cliente,nm_cliente,nr_cpf,nr_telefone,ds_email,dt_nascimento,ds_endereco) values (?,?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		stmt.setLong(1,cliente.getId());
		stmt.setString(2,cliente.getNome());
		stmt.setLong(3,cliente.getCpf());
		stmt.setLong(4,cliente.getTelefone());
		stmt.setString(5,cliente.getEmail());
		stmt.setDate(6,cliente.getDatanasc());
		stmt.setString(7,cliente.getEndereco());
		
		stmt.execute();
		stmt.close();
		
		
		
	}
	
	
}
