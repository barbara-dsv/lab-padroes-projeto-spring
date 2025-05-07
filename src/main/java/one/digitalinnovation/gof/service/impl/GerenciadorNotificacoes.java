package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.NotificacaoService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Map;

public class GerenciadorNotificacoes {
    @Autowired
    private Map<String, NotificacaoService> notificacoes;

    public void notificarCliente(Cliente cliente, String mensagem, String tipoNotificacao){
        String serviceName = tipoNotificacao.toLowerCase() + "NotificacaoService";

        NotificacaoService servico = notificacoes.get(serviceName);

        if(servico != null){
            servico.notificar(cliente, mensagem);
        } else {
            throw new IllegalArgumentException("TIpo de notificação não suportado");
        }

    }
}
