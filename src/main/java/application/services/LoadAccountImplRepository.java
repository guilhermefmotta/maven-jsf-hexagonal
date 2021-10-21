package application.services;

import application.domain.account.Account;
import application.ports.LoadAccountRepository;

public class LoadAccountImplRepository implements LoadAccountRepository {

    private final LoadAccountRepository loadAccountRepository;

    public LoadAccountImplRepository(LoadAccountRepository loadAccountRepository) {
        this.loadAccountRepository = loadAccountRepository;
    }

    @Override
    public Account findById(Long id) {
        return loadAccountRepository.findById(id);
    }
}
