package com.danilo.food.di.notificacao;

import org.springframework.stereotype.Component;

import com.danilo.food.di.modelo.Cliente;

@Component
public class NotificadorEmail {

	
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s atraves do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}

}
