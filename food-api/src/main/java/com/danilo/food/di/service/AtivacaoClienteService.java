package com.danilo.food.di.service;

import com.danilo.food.di.modelo.Cliente;
import com.danilo.food.di.notificacao.Notificador;


public class AtivacaoClienteService {

	private Notificador notificador;

	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;

		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.Ativo();

		notificador.notificar(cliente, "Seu cadastro esta ativo no sistema!");
	}
}
