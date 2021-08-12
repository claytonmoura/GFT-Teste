package pkg03.modelo;
import java.util.ArrayList;
import java.util.List;

public class Modelo {
	String nome, trabalho;
	double altura, peso;
	int idade;

	public Modelo() {
	}

	public Modelo(String nome, String trabalho, double altura, double peso, int idade) {
		super();
		this.nome = nome;
		this.altura = altura;
		this.peso = peso;
		this.idade = idade;
		this.trabalho = trabalho;
	}

	public void mostrarDados() {

		System.out.println("Nome: " + this.getNome());

		if (!this.getTrabalho().equals("Malhação")) {

			System.out.println("Modelo só pode gravar em Malhação");

			if (this.getTrabalho().equals("Modelo")) {
				System.out.println("Trabalho: " + this.getTrabalho());
			}
		} else {
			System.out.println("Trabalho: " + this.getTrabalho());
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getTrabalho() {
		return trabalho;
	}

	public void setTrabalho(String trabalho) {
		this.trabalho = trabalho;
	}

	@Override
	public String toString() {
		return "Modelo [nome=" + nome + ", trabalho=" + trabalho + ", altura=" + altura + ", peso=" + peso + ", idade="
				+ idade + "]";
	}

}
