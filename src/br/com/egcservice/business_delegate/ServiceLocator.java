package br.com.egcservice.business_delegate;

/**
 * Created by elson on 12/06/2016.
 */
public class ServiceLocator {
    public BancoService getBancoService(String servico) {
        if (servico.equals("saque"))
            return new SaqueService();
        else if (servico.equals("extrato"))
            return new ExtratoService();
        else if (servico.equals("deposito"))
            return new DepositoService();

        return null;
    }
}
