package br.com.entra21.orientacaoaobjetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacaoaobjetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacaoaobjetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacaoaobjetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacaoaobjetos.principal.aula02.heranca.Funcionario;
import br.com.entra21.orientacaoaobjetos.principal.aula03.polimorfismo.Atleta;
import br.com.entra21.orientacaoaobjetos.principal.aula03.polimorfismo.Nadador;
import br.com.entra21.orientacaoaobjetos.principal.aula03.polimorfismo.Velocista;

public class Main {

	// o objeto da classe Scanner esta na variavel de entrada, ent�o � um obj
	// porem o System.in � uma chamada static pq
	// para acessar o in do System nao precisei dar new
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte option;
		do {
			System.out.println(" Escolha uma op��o");
			System.out.println("0- Sair ");
			System.out.println("1- Classes");
			System.out.println("2- Heran�a");

			option = input.nextByte();

			switch (option) {

			case 0:
				System.out.println("Saindo...");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprendendoHeranca();
				break;
			default:
				break;

			}

		} while (option != 0);

	}

	public static void aprenderClassesObjetos() {
		Funcionario funcionario1 = new Funcionario();

		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		System.out.println("Nome dela = " + professoraIngles.getNome());

		professoraIngles.setNome("Isabelle 2");

		System.out.println("agora o nome  dela = " + professoraIngles.getNome());
		System.out.println("A idade dela � " + professoraIngles.getIdade());

		System.out.println("Os professoes trabalham na " + Professor.instituicao);

		Aluno alunoTeste = new Aluno();

		Aluno outroAluno = new Aluno();

		Aluno alunoNovato = new Aluno();

		Aluno alunoObjeto;

		alunoObjeto = new Aluno();

		alunoObjeto.idade = 18;

		alunoTeste.nome = "Rubem";
		alunoTeste.idade = 33;

		outroAluno.idade = 18;
		outroAluno.nome = "Visitante";
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		/*
		 * System.out.println("Qual o nome do aluno novato?");
		 * alunoNovato.nome=entrada.next();
		 * 
		 * System.out.println("Qual a idade do "+alunoNovato.nome+"?");
		 * alunoNovato.idade=entrada.nextByte();
		 * 
		 * System.out.println("Bem vindo "+alunoNovato.nome);
		 */

	}

	public static void aprendendoHeranca() {

	}

	public static void learningPolimorfismo() {
		Atleta messi = new Atleta();
		messi.comemorarWin();
		messi.learnigWithLoss();

		Nadador cleidomar = new Nadador("Cleidomar", (byte) 38, 15, 14, "mar", "sunga");
		cleidomar.comemorarWin();
		cleidomar.learnigWithLoss();
		cleidomar.setName("Cleidomar Rovson");
	}

	public static void aprenderClassesPolimorfismo() {

		// padr�o de polimorfismo para comportamentos(m�todos) � herdar.

		// segunda forma do polimorfismo � fazer completamente os
		// comportamentos(m�todos) do meu jeito.

		// terceira forma do polimorfismo � aproveitar a minha heran�a e fazer um
		// diferencial.

		Atleta cr7 = new Atleta();

		cr7.setName("Cristiano Ronaldo");
		cr7.comemorarWin();

		System.out.println("----------------------------");

		Nadador michaelPhelps = new Nadador();

		michaelPhelps.setName("Michael Phelps");

		Nadador sergioMichael = new Nadador("S�rgio Michael", (byte) 39, 23, 40, "Pisc�na", "Sunga e Touca");

		sergioMichael.comemorarWin(); // procura primeiro na minha classe Nadador, se n�o tiver busca na heran�a.

		michaelPhelps.comemorarWin();

		System.out.println("----------------------------");

		Velocista usainBolt = new Velocista();

		usainBolt.setName("Usain Bolt");

		usainBolt.comemorarWin();

		System.out.println("----------------------------");

	}

}