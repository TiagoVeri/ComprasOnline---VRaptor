package br.com.caelum.vraptor.blank.testes;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.blank.dao.ProdutoDao;
import br.com.caelum.vraptor.blank.domain.Produto;

public class RemocaoDeProduto {

	public static void main(String[] args) {
		
	new ProdutoDao().deletaProduto(2L);
		

	}

}
