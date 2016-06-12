package br.com.egcservice.business_delegate;

/**
 * Created by elson on 12/06/2016.
 */
public class BusinessDelegate {
    private ServiceLocator serviceLocator = new ServiceLocator();
    private BancoService bancoService;
    private String servico;

    public void setServico(String servico) {
        this.servico = servico;
    }

    public void realizarServico() {
        bancoService = serviceLocator.getBancoService(servico);
        bancoService.realizarOperacao();
    }
}
