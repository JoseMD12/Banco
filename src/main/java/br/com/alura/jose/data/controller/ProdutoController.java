package br.com.alura.jose.data.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jose.data.dao.ProdutoDAO;
import br.com.alura.jose.data.factory.ConnectionFactory;
import br.com.alura.jose.data.modelo.Produto;

public class ProdutoController {

	private ProdutoDAO pDao;

	public ProdutoController(){
		Connection connection =
			new ConnectionFactory().recuperarConexao();
		this.pDao = new ProdutoDAO(connection);
	}

	public void deletar(Integer id) {
		pDao.deletar(id);
	}

	public void salvar(Produto produto) {
		if(produto.getCategoriaId() != null){
			pDao.salvarComCategoria(produto);
		} else {
			pDao.salvar(produto);
		}
		
	}

	public List<Produto> listar() {
		return pDao.listar();
	}

	public void alterar(String nome, String descricao, Integer id) {
		pDao.alterar(nome, descricao, id);
	}
}
