package progolden.agenda.testes;

import org.junit.Test;


import progolden.agenda.repositorios.SessionSingleton;

import org.junit.Ignore;
import static org.junit.Assert.assertEquals;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateTeste {
   
   @Test
   public void HibernateConfig() {	      
	   SessionSingleton.getFactory().openSession();
    
   }
}