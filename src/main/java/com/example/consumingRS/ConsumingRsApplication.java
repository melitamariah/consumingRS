package com.example.consumingRS;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

//the "controller" class
@SpringBootApplication
public class ConsumingRsApplication {

	private static final Logger log = LoggerFactory.getLogger(ConsumingRsApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(ConsumingRsApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate(RestTemplateBuilder builder) {
		return builder.build();
	}

	@Bean
	public CommandLineRunner run(RestTemplate restTemplate) {

		return args -> {
			AnotherModel quote = restTemplate.getForObject("https://api.nytimes.com/svc/topstories/v2/arts.json?api-key=\n" +
					"tVzEFAlm8AbuTzujXsaGNWA1q3UXfGF2", AnotherModel.class);
			log.info(quote.toString());
		};
	}

}