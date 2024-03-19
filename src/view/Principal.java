package view;

import java.time.LocalDate;
import java.util.Scanner;

import model.Pessoa;

public class Principal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Pessoa p1 = new Pessoa();

		p1.setNome("Wallace");
		p1.setDataNascimento(15, 01, 2000);
		p1.setProfissao("Estudante");

		String nome = p1.getNome();
		String profissao = p1.getProfissao();
		int idade = p1.getIdade();
		LocalDate dataNascimento = p1.getDataNascimento();
		System.out.println("Nome: " + nome);
		System.out.println("Profissão: " + profissao);
		System.out.println("Idade: " + idade);
		System.out.println("Data de nascimento: " + dataNascimento);

		Pessoa p2 = new Pessoa();

		p2.setNome("Dinossauro");
		p2.setDataNascimento(01, 01, 1000);
		p2.setProfissao("Artista de museu");

		nome = p2.getNome();
		profissao = p2.getProfissao();
		idade = p2.getIdade();
		dataNascimento = p2.getDataNascimento();
		
		System.out.println("Nome: " + nome);
		System.out.println("Profissão: " + profissao);
		System.out.println("Idade: " + idade);
		System.out.println("Data de nascimento: " + dataNascimento);

		sc.close();
	}
}
