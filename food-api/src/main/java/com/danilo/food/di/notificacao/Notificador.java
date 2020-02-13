package com.danilo.food.di.notificacao;

import com.danilo.food.di.modelo.Cliente;

public interface Notificador {
	void notificar(Cliente cliente, String mensagem);
}