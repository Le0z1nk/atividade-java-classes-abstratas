package br.com.vainaweb.javabackend.abstrata;

import java.util.Scanner;

public abstract class Colaborador {
	private String nome;
	private String cpf;
	private double salario;
	private String modeloContratacao;
	private String tecnologias;
	private boolean isAtivo = true;
	private String senioridade;

	public Colaborador(String nome, String cpf, double salario, String modeloContratacao, String senioridade,
			String tecnologias) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
		this.modeloContratacao = modeloContratacao;
		this.senioridade = senioridade;
		this.tecnologias = tecnologias;
	}


	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}


	public String getTecnologias() {
		return tecnologias;
	}

	public void setTecnologias(String tecnologias) {
		this.tecnologias = tecnologias;
	}

	public String getSenioridade() {
		return senioridade;
	}

	public void setSenioridade(String senioridade) {
		this.senioridade = senioridade;
	}

	public String visualizar() {
		return "[ Nome: " + this.nome + ", Cpf: " + this.cpf + "]" + "\nTem o salário: R$" + this.salario
				+ "\nModelo de Contratação: " + this.modeloContratacao + "\nSenioridade: " + this.senioridade
				+ "\nTecnologias: " + this.tecnologias + "\nEstá ativo ? " + this.isAtivo;
	}

	public void desvincularColaborador() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tem certeza que deseja desvincular " + this.nome + "?(s-sim, n-não)");
		Character resposta = sc.next().toLowerCase().charAt(0);
		if (resposta.equals('s')) {
			this.isAtivo = false;
			this.salario = 0.00;
			System.out.println(this.nome + "está demitido!");
		} else if (resposta.equals('n')) {
			System.out.println("Colaborador não foi desvinculado");
		} else {
			System.out.println("resposta inválida!");
		}
	
	}

	public abstract void aumentarSalario();

	public abstract void aumentarSenioridade();

}
