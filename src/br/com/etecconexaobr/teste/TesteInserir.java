package br.com.etecconexaobr.teste;

import java.sql.Connection;

import br.com.etecconexaobr.conexao.Conexao;
import br.com.etecconexaobr.dao.CarroDAO;
import br.com.etecconexaobr.model.Carro;

public class TesteInserir {

	public static void main(String[] args) {

		Connection con = Conexao.abrirConexao();
		
		Carro carro = new Carro();
		CarroDAO carrodao = new CarroDAO(con);
		
		carro.setNomeMontadora("Ford");
		carro.setModeloCarro("Foccus");

		System.out.println(carrodao.inserir(carro));
		
		Conexao.fecharConexao(con);

	}

}
