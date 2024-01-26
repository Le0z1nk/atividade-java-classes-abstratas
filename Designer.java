package br.com.vainaweb.javabackend.abstrata;

import java.util.Scanner;

public class Designer extends Colaborador {

	public Designer(String nome, String cpf, double salario, String modeloContratacao, String senioridade,
			String tecnologias) {
		super(nome, cpf, salario, modeloContratacao, senioridade, tecnologias);

	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.4);

	}

	@Override
	public void aumentarSenioridade() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Deseja aumentar a senioridade do designer?(s-sim, n-não)");
		Character resposta = sc.next().toLowerCase().charAt(0);
		if (resposta.equals('s')) {
			setSenioridade("Pleno");
		} else if (resposta.equals('n')) {
			System.out.println("Senioridade não foi mudada");
		} else {
			System.out.println("resposta inválida!");
		}
		

	}

}
