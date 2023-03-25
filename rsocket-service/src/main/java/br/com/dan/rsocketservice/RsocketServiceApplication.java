package br.com.dan.rsocketservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.stereotype.Controller;

import reactor.core.publisher.Flux;

@SpringBootApplication
public class RsocketServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RsocketServiceApplication.class, args);
	}

}

@Controller
class CustomerController {

	@MessageMapping("counter.{to}")
	Flux<Integer> byId(@DestinationVariable Integer to) {
		return Flux.range(0, to);
	}
	
}

record Customer(Integer id, String name){}