package com.example.pa2_u1_p4_af;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Pa2U1P4AlApplication implements CommandLineRunner{

	@Autowired //le digo que le inyecte
	private Profesor profe2;

	public static void main(String[] args) {
		SpringApplication.run(Pa2U1P4AlApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hola mundo");

		Profesor profe = new Profesor();
		profe.setNombre("Andres");
		profe.setApellido("Lugmaña");
		profe.setCedula("1724210685");
		profe.setFecha(LocalDateTime.now());

		System.out.println(profe);
		System.out.println(profe.getApellido());

	

		System.out.println(profe2);
		profe2.setApellido("Chuqui");
		System.out.println(profe2.getApellido());

		Profesor profe3;
		profe3 = profe;
		System.out.println(profe3);

		profe.setApellido("Achig");

		System.out.println(profe3);

		MatriculaCalculo mat = new MatriculaCalculo();

		mat.realizarMatricula("1");
		

	}

}
