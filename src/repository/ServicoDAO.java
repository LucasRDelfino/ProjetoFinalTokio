package repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connectionFactory.ConnectionFactory;
import model.Cliente;
import model.Servico;

public class ServicoDAO {

	private PreparedStatement statement;
	private ResultSet resultSet;
	public Connection conexao;
	
	
	public ServicoDAO() {
		this.conexao = new ConnectionFactory().conectar();
}

	
	public List<Servico> selectServ() throws SQLException {
		List<Servico> servicos = new ArrayList<Servico>();
		String sql = "select * from T_AUTO_SERVICO";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();
		while (rs.next()) {
			Servico servico = new Servico();
			servico.setId(rs.getLong("cd_servico"));
			servico.setNomeServico(rs.getString("nm_servico"));
			servico.setDescricao("ds_servico");
			servicos.add(servico);
}
		
			rs.close();
			stmt.close();
			return servicos;
	}
	
	

	
	
}