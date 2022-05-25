package br.com.entra21.orientacaoaobjetos.principal;

import java.util.Scanner;

import br.com.entra21.orientacaoaobjetos.principal.aula01.classes.Aluno;
import br.com.entra21.orientacaoaobjetos.principal.aula01.classes.Professor;
import br.com.entra21.orientacaoaobjetos.principal.aula02.heranca.Diretor;
import br.com.entra21.orientacaoaobjetos.principal.aula02.heranca.Funcionario;


public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		byte opcao;

		do {
			System.out.println("Escolha uma opção");
			System.out.println("0 - Sair");
			System.out.println("1 - Aprender classes");
			System.out.println("2 - Aprender herança");

			opcao = input.nextByte();

			switch (opcao) {
			case 0:
				System.out.println("Saindo");
				break;
			case 1:
				aprenderClassesObjetos();
				break;
			case 2:
				aprenderHeranca();
				break;
			default:
				System.out.println("Escolha uma opção válida");
				break;
			}
		} while (opcao != 0);

	}

	public static void aprenderClassesObjetos() {
		
	
		

		Professor professorJava = new Professor();
		professorJava.setNome("Oliota");
		Professor professoraIngles = new Professor("Isabelle", (byte) 30);

		System.out.println("Nome dela = " + professoraIngles.getNome());

		professoraIngles.setNome("Isabelle 2");

		Aluno alunoTeste = new Aluno();
		// alunoTeste.nome = "Stephanie";

		Aluno outroAluno = new Aluno();
		outroAluno = null;
		outroAluno = new Aluno();

		Aluno alunoNovato = new Aluno();

		Aluno alunoObjeto;

		alunoObjeto = new Aluno();

		alunoObjeto.idade = 18;

		alunoTeste.nome = "Stephanie";
		alunoTeste.idade = 28;

		outroAluno.nome = "Henrique";
		outroAluno.idade = 5;

		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();
		alunoTeste.responderChamada();

		/*
		 * System.out.println("Qual o nome do aluno novato?"); alunoNovato.nome =
		 * input.next();
		 * 
		 * System.out.println("Qual a idade do " + alunoNovato.nome + "?");
		 * alunoNovato.idade = input.nextByte();
		 * 
		 * System.out.println("Bem vindo " + alunoNovato.nome);
		 */

	}

	public static void aprenderHeranca() {
		
		Funcionario funcinario1 = new Funcionario() ;
		funcinario1.setIdade((byte) 22);
		funcinario1.setNome("Bruno");
		funcinario1.setCargoAtual("Analista");
		funcinario1.setSalario(1500.00f);
		
		System.out.println("Oi, meu nome é " + funcinario1.getNome() + " e minha idade é " + funcinario1.getIdade() + " e ganho" + funcinario1.getSalario());
		Funcionario funcionario2 = new Funcionario("Bruno", (byte) 22, "Cpf 312134", "programador jr", 2500.50f);
		
		

		Diretor diretor1 = new Diretor();
		diretor1.realizarApresentacao();
		Diretor diretor2 = new Diretor();
		diretor2.realizarApresentacao();
		Diretor diretor3 = new Diretor("Paulo", (byte) 80, "Cpf 077355680-04", (byte)10);
		diretor3.realizarApresentacao();
		diretor3.setNome("Paulo");
	}

}
