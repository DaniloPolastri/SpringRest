package com.danilo.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.danilo.food.di.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notifcador = new NotificadorEmail("smt.danilomail.com.br");
		notifcador.setCaixaAlta(true);

		return notifcador;
	}
}
