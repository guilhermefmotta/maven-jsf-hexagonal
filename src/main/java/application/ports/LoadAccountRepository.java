package application.ports;

import application.domain.account.Account;

public interface LoadAccountRepository {

    Account findById(Long id);
}
