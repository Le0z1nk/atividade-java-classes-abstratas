package br.com.vainaweb.javabackend.abstrata;

public class App {
	public static void main(String[] args) {
		DevBackEnd backEnd = new DevBackEnd("Isael", "111.222.333-44", 10000.00, "CLT", "Pleno", "Java, C++, Python");
		DevFrontEnd frontEnd = new DevFrontEnd("Paulo", "758.679.111-45", 10000.00, "PJ", "Junior", "Javacript, CSS, React");
		Designer designer = new Designer("Caroline", "000.879.543-22", 15000.00, "CLT", "Junior", "Figma, Photoshop");
		TechLeader techLeader = new TechLeader("João Pedro Belo", "333.888.459-33", 20000.00, "PJ", "", "Trello, devOps");
		System.out.println("-------------------Antes---------------");
		System.out.println(backEnd.visualizar());
		System.out.println(frontEnd.visualizar());
		System.out.println(designer.visualizar());
		System.out.println(techLeader.visualizar());
	    backEnd.desvincularColaborador();
		frontEnd.desvincularColaborador();
		designer.desvincularColaborador();
		techLeader.desvincularColaborador();
	    backEnd.aumentarSenioridade();
	    frontEnd.aumentarSenioridade();
		designer.aumentarSenioridade();
		System.out.println("-------------------Depois---------------");
		backEnd.aumentarSalario();
		frontEnd.aumentarSalario();
		designer.aumentarSalario();
		techLeader.aumentarSalario();
		System.out.println(backEnd.visualizar());
		System.out.println(frontEnd.visualizar());
		System.out.println(designer.visualizar());
		System.out.println(techLeader.visualizar());

	}
}
