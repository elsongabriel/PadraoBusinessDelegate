package br.com.egcservice.business_delegate;

/**
 * Created by elson on 12/06/2016.
 */
public class Cliente {
    BusinessDelegate businessDelegate;

    public Cliente(BusinessDelegate bd) {
        this.businessDelegate = bd;
    }

    public void realizarOperacao() {
        businessDelegate.realizarServico();
    }
}
