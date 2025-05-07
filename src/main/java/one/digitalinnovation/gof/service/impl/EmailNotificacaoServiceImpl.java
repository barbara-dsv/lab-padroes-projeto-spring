package one.digitalinnovation.gof.service.impl;

import one.digitalinnovation.gof.model.Cliente;
import one.digitalinnovation.gof.service.NotificacaoService;

public class EmailNotificacaoServiceImpl implements NotificacaoService {
    @Override
    public void notificar(Cliente cliente, String mensagem) {
        // Em um caso real, aqui seria a implementação do envio de email
        System.out.println("Enviando e-mail para " + cliente.getNome() + " no endereço " +
                cliente.getNome().toLowerCase().replace(" ", ".")+
                "@teste.com: " + mensagem);
    }
}
