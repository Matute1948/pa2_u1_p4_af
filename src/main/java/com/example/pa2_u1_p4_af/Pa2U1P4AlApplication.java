package com.example.pa2_u1_p4_af;

import java.beans.Transient;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.pa2_u1_p4_af.banco.repository.modelo.Cuenta;
import com.example.pa2_u1_p4_af.banco.serrvice.CuentaService;
import com.example.pa2_u1_p4_af.banco.serrvice.TransferenciaService;
import com.example.pa2_u1_p4_af.repository.modelo.Estudiante;
import com.example.pa2_u1_p4_af.serrvice.EstudianteServices;

@SpringBootApplication
public class Pa2U1P4AlApplication implements CommandLineRunner{
	@Autowired
	private CuentaService cuentaService;

	@Autowired
	private TransferenciaService transferenciaService;
	
	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Cuenta cuenta1 = new Cuenta();
		cuenta1.setCedulaPropietario("1234");
		cuenta1.setFechaApertura(LocalDateTime.now());
		cuenta1.setNumero("5678");
		cuenta1.setSaldo(new BigDecimal(200));
		cuenta1.setTipo("A");

		this.cuentaService.guardar(cuenta1);
		this.cuentaService.buscarPorNumero("5678");

		Cuenta cuenta2 = new Cuenta();
		cuenta2.setCedulaPropietario("8987");
		cuenta2.setFechaApertura(LocalDateTime.now());
		cuenta2.setNumero("7890");
		cuenta2.setSaldo(new BigDecimal(100));
		cuenta2.setTipo("A");

		this.cuentaService.guardar(cuenta2);

		this.transferenciaService.realizar("5678", "7890", new BigDecimal(10));

		System.out.println("Saldo Origen");
		
		System.out.println(this.cuentaService.buscarPorNumero("5678").getSaldo());
		System.out.println("Saldo Destino");
		System.out.println(this.cuentaService.buscarPorNumero("7890").getSaldo());

	}

}
