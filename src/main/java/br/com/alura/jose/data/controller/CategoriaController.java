package br.com.alura.jose.data.controller;

import java.sql.Connection;
import java.util.List;

import br.com.alura.jose.data.dao.CategoriaDAO;
import br.com.alura.jose.data.factory.ConnectionFactory;
import br.com.alura.jose.data.modelo.Categoria;

public class CategoriaController {

	private CategoriaDAO cDao;

	public CategoriaController(){
		Connection connection = 
			new ConnectionFactory().recuperarConexao();
		this.cDao = new CategoriaDAO(connection);
	}
	public List<Categoria> listar() {
		return cDao.listar();
	}
}
