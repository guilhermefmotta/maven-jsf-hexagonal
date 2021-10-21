package adapters.inbound.presentation.bean;


import application.domain.account.Account;
import application.ports.LoadAccountRepository;

import java.io.Serializable;

import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "accountBean")
@ViewScoped
public class AccountBean implements Serializable {

    @Inject
    private LoadAccountRepository loadAccountRepository;


    private String nome;

    public Account findById(Long id) {
        return loadAccountRepository.findById(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        findById(new Long(nome));
        this.nome = nome;
    }

    public String call() {
        System.out.println("call");
        return "index";
    }
}
