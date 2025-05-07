package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.NotificacaoService;

public class SmsNotificacaoServiceImpl implements NotificacaoService {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        // Em um caso real, aqui seria a implementação do envio de email
        System.out.println("Enviando SMS para " + cliente.getNome() +
                " no número (99) 99999-9999: " + mensagem);
    }
}
