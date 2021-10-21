package application.ports;

import application.domain.account.Account;

public interface AddAccountRepository {

    Account add(Account account);
}