package com.rubrica.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rubrica.entita.Rubrica;
import com.rubrica.entita.Voce;

public class RubricaMain {
	//prova
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		Rubrica r = (Rubrica) context.getBean("rubrica");
		
		Voce v = r.restituisciVoce("Marco");
		//List<Voce> voci = r.restituisciVoce("Donald");
		
		System.out.println(v.getNome() +" "+v.getCognome() +" "+v.getTelefono());
	}
}
