package br.com.etecconexaobr.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.com.etecconexaobr.model.Carro;

public class CarroDAO {
	
	private Connection con;

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}
	
	public CarroDAO() {
		
	}
	
	public CarroDAO(Connection con) {
		setCon(con);
	}
	
	public String inserir(Carro carro) {
		String sql = "insert into Carro (montadora, modelo) values (?,?)";
		try {
			PreparedStatement cr = getCon().prepareStatement(sql);
			cr.setString(1, carro.getNomeMontadora());
			cr.setString(2, carro.getModeloCarro());
			if (cr.executeUpdate() > 0) {
				return "Inserido com sucesso";
			} else {
				return "Erro ao inserir";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deletarComWhere(Carro carro) {
		String sql = "delete from Carro where montadora = ?";
		try {
			PreparedStatement cr = getCon().prepareStatement(sql);
			cr.setString(1, carro.getNomeMontadora());
		
			if (cr.executeUpdate() > 0) {
				return "Delatado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
	public String deletarSemWhere(Carro carro) {
		String sql = "delete from Carro";
		try {
			PreparedStatement cr = getCon().prepareStatement(sql);
		
			if (cr.executeUpdate() > 0) {
				return "Delatado com sucesso";
			} else {
				return "Erro ao deletar";
			}
		} catch (SQLException e) {
			return e.getMessage();
		}
	}
	
}
