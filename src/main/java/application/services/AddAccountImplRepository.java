package application.services;

import application.domain.account.Account;
import application.ports.AddAccountRepository;


public class AddAccountImplRepository implements AddAccountRepository {

    private final AddAccountRepository addAccountRepository;

    public AddAccountImplRepository(AddAccountRepository addAccountRepository) {
        this.addAccountRepository = addAccountRepository;
    }

    @Override
    public Account add(Account account) {
        return addAccountRepository.add(account);
    }
}
