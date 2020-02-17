package br.com.caelum.goodbuy.infra;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.vraptor.ioc.Component;
import br.com.caelum.vraptor.ioc.ComponentFactory;

@Component
public class CriadorDeSession implements ComponentFactory<Session>{

	private SessionFactory factory;
	
	public CriadorDeSession(SessionFactory factory) {
		this.factory = factory;
		
	}
	public Session getInstance() {
		return null;
	}

}




