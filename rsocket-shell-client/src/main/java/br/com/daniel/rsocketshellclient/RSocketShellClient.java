package br.com.daniel.rsocketshellclient;

import org.springframework.messaging.rsocket.RSocketRequester;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@ShellComponent
public class RSocketShellClient {

    private final RSocketRequester rSocketRequester;

    RSocketShellClient(RSocketRequester.Builder builder) {
        this.rSocketRequester = builder.tcp("localhost", 9090);
    }

    @ShellMethod("Send one request")
    public void requestResponse() {
        log.info("\nSending one request...");
        this.rSocketRequester.route("counter.{to}", 100)
                .retrieveFlux(Integer.class)
                .subscribe((value) -> log.info("Receiving value {}", value));
    }

}
