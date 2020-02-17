package br.com.caelum.goodbuy.controller;

import java.util.List;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.domain.Produto;
import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;

@Resource
public class ProdutosController {
	
	private final ProdutoDao dao;
	private final Result result;
	
	public ProdutosController(ProdutoDao dao, Result result) {
		this.result = result;
		this.dao = dao;
	}

	public List<Produto> lista(){
		return dao.listaTudo();
	}
	
	public void formulario() {
		
	}
	
	public void adiciona(Produto produto) {
		dao.salva(produto);
		result.redirectTo(this).lista();
	}
	
	public Produto edita(Long id) {
		return dao.carrega(id);
	}
	
	public void altera(Produto produto) {
		dao.atualiza(produto);
		result.redirectTo(this).lista();
	}
	
	public void remove(Long id) {
		Produto produto = dao.carrega(id);
		dao.remove(produto);
		result.redirectTo(this).lista();
	}
}
