package br.com.egcservice.business_delegate;

/**
 * Created by elson on 12/06/2016.
 */
public class DepositoService implements BancoService {

    @Override
    public void realizarOperacao() {
        System.out.println("Cliente realizando depósito..");
    }
}
