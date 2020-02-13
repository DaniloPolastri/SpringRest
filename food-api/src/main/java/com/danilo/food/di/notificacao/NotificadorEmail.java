package com.danilo.food.di.notificacao;

import com.danilo.food.di.modelo.Cliente;


public class NotificadorEmail implements Notificador {
	private boolean caixaAlta;
	private String hostServidorSmtp;

	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		System.out.println("NotificadorEmail");
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {

		if (this.caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}

		System.out.printf("Notificando %s atraves do e-mail %s usando SMTP %s: %s\n", cliente.getNome(),
				cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}

}
