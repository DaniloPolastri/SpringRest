package com.danilo.food.di.service;

import org.springframework.stereotype.Component;

import com.danilo.food.di.modelo.Cliente;
import com.danilo.food.di.notificacao.NotificadorEmail;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.Ativo();
		
		notificador.notificar(cliente, "Seu cadastro esta ativo no sistema!");
	}
}
