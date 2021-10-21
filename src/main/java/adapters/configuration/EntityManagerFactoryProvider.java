package adapters.configuration;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceUnit;
import java.io.Serializable;

@Stateless
public class EntityManagerFactoryProvider implements Serializable {

    private EntityManagerFactory factory;

    public EntityManagerFactoryProvider() {
        if (factory == null) {
            factory = Persistence.createEntityManagerFactory("persistencePostgres");
        }
    }

    @Produces
    public EntityManager getEntityManager() {
        return factory.createEntityManager();
    }
}
