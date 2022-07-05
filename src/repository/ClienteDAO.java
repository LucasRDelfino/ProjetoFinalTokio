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
	
	private PreparedStatement statement;
	private ResultSet resultSet;
	public Connection conexao;
	
	
	public ClienteDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void insert(Cliente cliente) throws SQLException {
		String sql = "insert into T_AUTO_CLIENTE (nm_cliente,nr_cpf,nr_telefone,"
				+ "ds_email,ds_nascimento,ds_endereco) values (?,?,?,?,?,?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		
		stmt.setString(1,cliente.getNome());
		stmt.setLong(2,cliente.getCpf());
		stmt.setLong(3,cliente.getTelefone());
		stmt.setString(4,cliente.getEmail());
		stmt.setDate(5,cliente.getDatanasc());
		stmt.setString(6,cliente.getEndereco());
		
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
