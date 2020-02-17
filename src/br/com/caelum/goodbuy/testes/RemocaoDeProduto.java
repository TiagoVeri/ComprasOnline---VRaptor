package br.com.caelum.goodbuy.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.domain.Produto;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.infra.CriadorDeSessionFactory;

public class RemocaoDeProduto {

	public static void main(String[] args) {
		
		SessionFactory factory = new CriadorDeSessionFactory().getInstance();

		Session session = new CriadorDeSession(factory).getInstance();

		ProdutoDao dao = new ProdutoDao(session);

		dao.deletaProduto(2L);

	}

}
