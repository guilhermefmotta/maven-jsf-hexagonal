package adapters.outbound.persistence.account;

import application.domain.account.Account;
import application.ports.LoadAccountRepository;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.inject.Named;
import javax.persistence.EntityManager;

@Named
@Stateless
public class PgLoadAccountRepository  implements LoadAccountRepository {

    @Inject
    private EntityManager entityManager;

    @Override
    public Account findById(Long id) {
        adapters.outbound.persistence.account.Account account;
        try {
            entityManager.getTransaction().begin();
            account = entityManager.find(adapters.outbound.persistence.account.Account.class, id);
        } catch (RuntimeException e) {
            if (entityManager != null && entityManager.getTransaction().isActive())
                entityManager.getTransaction().rollback();
            throw e;
        } finally {
            entityManager.getTransaction().commit();
        }
        return null;
    }
}
