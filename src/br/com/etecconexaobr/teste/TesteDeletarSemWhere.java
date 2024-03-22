package br.com.etecconexaobr.teste;

import java.sql.Connection;

import br.com.etecconexaobr.conexao.Conexao;
import br.com.etecconexaobr.dao.CarroDAO;
import br.com.etecconexaobr.model.Carro;

public class TesteDeletarSemWhere {

	public static void main(String[] args) {
		
		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);
		
		carro.setNomeMontadora("Ford");

		System.out.println(carrodao.deletarSemWhere(carro));
		
		Conexao.fecharConexao(con);

	}

}
