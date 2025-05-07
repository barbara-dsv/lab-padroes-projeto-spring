package one.digitalinnovation.gof.service;

import one.digitalinnovation.gof.model.Cliente;

public interface NotificacaoService {
    void notificar(Cliente cliente, String mensagem);

}
