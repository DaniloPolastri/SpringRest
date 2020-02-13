package com.danilo.food;

import org.springframework.context.annotation.Bean;
import com.danilo.food.di.notificacao.NotificadorEmail;
import com.danilo.food.di.service.AtivacaoClienteService;

//@Configuration
public class AlgaConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notifcador = new NotificadorEmail("smt.danilomail.com.br");
		notifcador.setCaixaAlta(true);

		return notifcador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}

}
