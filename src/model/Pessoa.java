package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Pessoa {

	private String nome;
	private LocalDate dataNascimento;
	private String profissao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(int dia, int mes, int ano) {
		this.dataNascimento = LocalDate.of(ano, mes, dia);
		if (getIdade() > 150) {
			this.dataNascimento = LocalDate.now();
		}
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}

	public int getIdade() {
		LocalDate dataAtual = LocalDate.now();
		int idade = (int) ChronoUnit.YEARS.between(dataNascimento, dataAtual);
		if (dataAtual.getMonthValue() < dataNascimento.getMonthValue()
				|| dataAtual.getMonthValue() == dataNascimento.getMonthValue()
						&& dataAtual.getDayOfMonth() < dataNascimento.getDayOfMonth()) {
			idade--;
		}
		return idade;
	}

}
