package com.example.demo;

import java.util.Arrays;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.wsdl.CountriesPort_CountriesPortSoap12_Client;
import com.example.demo.wsdl.Country;

@SpringBootApplication
public class WsdlClientApplication implements CommandLineRunner {

	private static final Logger LOG = LoggerFactory.getLogger(WsdlClientApplication.class);
	private CountriesPort_CountriesPortSoap12_Client client = new CountriesPort_CountriesPortSoap12_Client();
	
	public static void main(String[] args) {
		SpringApplication.run(WsdlClientApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		String[] countries = {"Spain", "Poland", "United Kingdom"};
		Arrays.asList(countries).stream().forEach(countryName -> {
			Country country = client.getCountry(countryName);
			LOG.info("La capital de " + countryName + " es " + country.getCapital() + " y su población es de " + country.getPopulation() + " habitantes");
		});
	}
}
