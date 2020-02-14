package br.com.caelum.goodbuy.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import br.com.caelum.goodbuy.domain.Produto;
import br.com.caelum.goodbuy.infra.CriadorDeSession;

public class ProdutoDao {
	
	private final Session session;
	
	
	public ProdutoDao() {
		this.session = CriadorDeSession.getSession();
	}

	
	public void salva(Produto produto) {

		Transaction tx = session.beginTransaction();
		session.save(produto);
		tx.commit();
	}

	public void atualizaProduto(Long id) {
		
		Produto produto = retornaProduto(id);
		Transaction tx = session.beginTransaction();
		produto.setPreco(42.50);
		session.update(produto);

		tx.commit();
	}
	
	public void deletaProduto(Long id) {
		Produto produto = retornaProduto(id);
		
		Transaction tx = session.beginTransaction();
		session.delete(produto);
		tx.commit();
	}
	
	public Produto retornaProduto(Long id) {
		
		Produto produtoAchado = (Produto) session.load(Produto.class, id);
		
		return produtoAchado;
	}
}
