package com.example.wsdlcliente.config;

import com.example.wsdlcliente.clients.PaisClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class PaisConfiguration {

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.wsdlcliente.wsdl");
        return marshaller;
    }

    @Bean
    public PaisClient countryClient(Jaxb2Marshaller marshaller) {
        PaisClient client = new PaisClient();
        client.setDefaultUri("http://localhost:8080/ws");
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }

}
