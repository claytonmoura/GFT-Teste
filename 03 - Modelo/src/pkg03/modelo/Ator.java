package pkg03.modelo;
public class Ator extends Modelo {

	int nivelAtor;
	
	public Ator() {}
	
	public Ator(int nivelAtor) {
		super();
		this.nivelAtor = nivelAtor;
	}

	public void mostrarDados() {

		System.out.println("Nome: " + this.getNome());

		if (!this.getTrabalho().equals("Novela")) {
			System.out.println("Ator só pode gravar em Novela");
		} else {
			System.out.println("Trabalho: " + this.getTrabalho());
		}
	}

	public int getNivelAtor() {
		return nivelAtor;
	}

	public void setNivelAtor(int nivelAtor) {
		this.nivelAtor = nivelAtor;
	}

	@Override
	public String toString() {
		return "Ator [nivelAtor=" + nivelAtor + ", nome=" + nome + ", trabalho=" + trabalho + ", altura=" + altura
				+ ", peso=" + peso + ", idade=" + idade + "]";
	}

	
}
