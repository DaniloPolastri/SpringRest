package com.danilo.food;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.danilo.food.di.notificacao.Notificador;
import com.danilo.food.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}

}
