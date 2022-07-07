package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import connectionFactory.ConnectionFactory;
import model.Cliente;
import model.Dados;

public class DadosDAO {
	private PreparedStatement statement;
	private ResultSet resultSet;
	public Connection conexao;
	
	
	public DadosDAO() {
		this.conexao = new ConnectionFactory().conectar();
	}
	
	public void update(Dados dado) throws SQLException {
		String sql = "update t_auto_dado set cd_servico=?,cd_categoria=? where cd_cliente=?";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setLong(1, dado.getServico());
		stmt.setLong(2, dado.getCategoria());
		stmt.setLong(3, dado.getCliente());
		
		stmt.execute();
		stmt.close();
	}
	
}	
