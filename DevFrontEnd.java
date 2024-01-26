package br.com.vainaweb.javabackend.abstrata;

import java.util.Scanner;

public class DevFrontEnd extends Colaborador {

	public DevFrontEnd(String nome, String cpf, double salario, String modeloContratacao, String senioridade,
			String tecnologias) {
		super(nome, cpf, salario, modeloContratacao, senioridade, tecnologias);

	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.9);

	}

	@Override
	public void aumentarSenioridade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja aumentar a senioridade do dev Front-End?(s-sim, n-não)");
		Character resposta = sc.nextLine().toLowerCase().charAt(0);
		if (resposta.equals('s')) {
			setSenioridade("Pleno");
		} else if (resposta.equals('n')) {
			System.out.println("Senioridade não foi mudada");
		} else {
			System.out.println("resposta inválida!");
		}
		

	}

}
