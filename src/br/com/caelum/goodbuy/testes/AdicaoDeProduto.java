package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.domain.Produto;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.infra.CriadorDeSessionFactory;

public class AdicaoDeProduto {

	public static void main(String[] args) {
		
		//Config usada para criar uma session e persistir dados com Hibernate
			
		//Cria��o de produtos
		Produto produto = criaProduto();
		
		SessionFactory factory = new CriadorDeSessionFactory().getInstance();

		Session session = new CriadorDeSession(factory).getInstance();

		ProdutoDao dao = new ProdutoDao(session);

	}


	private static Produto criaProduto() {
		Produto produto = new Produto();
		produto.setNome("Prateleira");
		produto.setDescricao("Para colocar livros");
		produto.setPreco(35.90);
		return produto;
	}



}
