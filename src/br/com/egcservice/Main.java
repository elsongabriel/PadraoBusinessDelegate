package br.com.egcservice;

import br.com.egcservice.business_delegate.BusinessDelegate;
import br.com.egcservice.business_delegate.Cliente;

public class Main {

    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        businessDelegate.setServico("extrato");

        Cliente cliente = new Cliente(businessDelegate);
        cliente.realizarOperacao();

        businessDelegate.setServico("saque");
        cliente.realizarOperacao();

        businessDelegate.setServico("deposito");
        cliente.realizarOperacao();
    }
}
