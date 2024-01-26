package br.com.vainaweb.javabackend.abstrata;

public class TechLeader extends Colaborador {

	public TechLeader(String nome, String cpf, double salario, String modeloContratacao, String senioridade,
			String tecnologias) {
		super(nome, cpf, salario, modeloContratacao, senioridade, tecnologias);

	}

	@Override
	public void aumentarSalario() {
		setSalario(getSalario() * 1.7);

	}

	@Override
	public void aumentarSenioridade() {

	}

}
