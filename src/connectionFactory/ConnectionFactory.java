package connectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {
	
	private String schema = "jdbc:oracle:thin:@oracle.fiap.com.br:1521:ORCL";
	private String user = "TM_LUCAS_DILFINO";
	private String password = "050705";
	
	public Connection conectar () {
		try {
			return DriverManager.getConnection(schema,user,password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}

