package br.com.caelum.vraptor.blank.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.blank.domain.Produto;

public class AdicaoDeProduto {

	public static void main(String[] args) {
		
		//Config usada para criar uma session e persistir dados com Hibernate
		AnnotationConfiguration configuration = new AnnotationConfiguration();
		configuration.configure();
		
		SessionFactory factory = configuration.buildSessionFactory();
		Session session = factory.openSession();
		//
		
		Produto produto = new Produto();
		produto.setNome("Prateleira");
		produto.setDescricao("Para colocar livros");
		produto.setPreco(35.90);
		
		Produto produto2 = new Produto();
		produto.setNome("Lixeira");
		produto.setDescricao("3L");
		produto.setPreco(40.0);
		
		Produto produto3 = new Produto();
		produto.setNome("Pneu");
		produto.setDescricao("Novos pneus");
		produto.setPreco(149.90);
		
		Produto produto4 = new Produto();
		produto.setNome("Bola");
		produto.setDescricao("Futebol");
		produto.setPreco(25.0);
		
		//Salva dados
		Transaction tx = session.beginTransaction();
		session.save(produto);
		session.save(produto2);
		session.save(produto3);
		session.save(produto4);
		tx.commit();
	}

}
