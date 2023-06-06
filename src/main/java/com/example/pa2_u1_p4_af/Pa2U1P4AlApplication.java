package com.example.pa2_u1_p4_af;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pa2_u1_p4_af.banco.repository.modelo.Cajero;
import com.example.pa2_u1_p4_af.banco.repository.modelo.Presidente;
import com.example.pa2_u1_p4_af.banco.repository.modelo.Transferencia;
import com.example.pa2_u1_p4_af.banco.serrvice.CargaSistemaService;

import com.example.pa2_u1_p4_af.banco.serrvice.TransferenciaService;

@SpringBootApplication
public class Pa2U1P4AlApplication implements CommandLineRunner{
	
	@Autowired
	private Cajero cajero;
	@Autowired
	private Cajero cajero1;
	@Autowired
	private Presidente presidente;
	@Autowired
	private Presidente presidente1;
	@Autowired
	private CargaSistemaService cargaSistemaService;
	@Autowired
	private TransferenciaService transferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola");
	
		this.cajero.setNombre("Andres");
		this.cajero.setApellido("Lugmaña");
		this.cajero.setSalario(new BigDecimal(1000));

		this.cajero1.setApellido("Pineda");
		System.out.println(this.cajero);
		System.out.println(this.cajero1.getApellido());

		this.presidente.setApellido("Porras");
		this.presidente.setNombre("Andres");
		this.presidente.setCedula("123");
		this.presidente1.setApellido("Taco");

		System.out.println(this.presidente);
		System.out.println(this.presidente1);

		System.out.println("******Segunda parte del taller*******");
		this.cargaSistemaService.cargar();
		Transferencia trans = new Transferencia();
		trans.setCuentaDestino(null);
		trans.setCuentaOrigen(null);
		trans.setFecha(LocalDateTime.now());
		trans.setMonto(new BigDecimal(100));
		trans.setNumero("12345");
		this.transferenciaService.guardar(trans);
		
	}
}
