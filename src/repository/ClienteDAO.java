package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
	
	public List<Cliente> select() throws SQLException {
		List<Cliente> clientes = new ArrayList<Cliente>();
		String sql = "select * from T_AUTO_CLIENTE";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Cliente cliente = new Cliente();
			cliente.setId(rs.getLong("cd_cliente"));
			cliente.setNome(rs.getString("nm_cliente"));
			cliente.setEmail(rs.getString("ds_email"));
			cliente. setTelefone(rs.getLong("nr_telefone"));
			cliente.setDatanasc(rs.getDate("dt_nascimento"));
			cliente.setEndereco(rs.getString("ds_endereco"));
			cliente. setCpf(rs.getLong("nr_cpf"));
			clientes.add(cliente);
}
		
			rs.close();
			stmt.close();
			return clientes;
	}
	
	
	
}
