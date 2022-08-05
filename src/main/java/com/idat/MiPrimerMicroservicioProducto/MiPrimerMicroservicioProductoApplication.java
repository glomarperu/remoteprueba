package com.idat.MiPrimerMicroservicioProducto;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Configurable
@EnableAutoConfiguration
public class MiPrimerMicroservicioProductoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MiPrimerMicroservicioProductoApplication.class, args);
	}

}
