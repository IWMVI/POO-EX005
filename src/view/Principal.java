package view;

import java.time.LocalDate;

import model.Pessoa;

public class Principal {
	public static void main(String[] args) {
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
	}
}
