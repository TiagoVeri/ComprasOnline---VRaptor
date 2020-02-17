package br.com.caelum.goodbuy.infra;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSession implements ComponentFactory<Session>{

	private SessionFactory factory;
	private Session session;
	
	public CriadorDeSession(SessionFactory factory) {
		this.factory = factory;
		
	}
	
	@PostConstruct
	public void abre() {
		this.session = factory.openSession();
		System.out.println("CriadorSession chamado");
	
	}
	
	public Session getInstance() {
		System.out.println("CriadorSession chamado - get instance");
		return this.session;
	}

	@PreDestroy
	public void fecha() {
		this.session.close();
	}
}




