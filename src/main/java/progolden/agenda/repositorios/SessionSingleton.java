package progolden.agenda.repositorios;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class SessionSingleton {
	
	private static SessionFactory factory;
	
	public static SessionFactory getFactory() {
		try {
			if (factory == null) {
				new SessionSingleton().setUp();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return factory;
	}

	protected void setUp() throws Exception {

		StandardServiceRegistry registry = null;
		try {
		 registry = 
				new StandardServiceRegistryBuilder()
				.configure()
				.build();
		
			factory = new MetadataSources( registry )
					.buildMetadata()
					.buildSessionFactory();
		}
		catch (Exception e) {
			StandardServiceRegistryBuilder.destroy( registry );
		}
	}
}
