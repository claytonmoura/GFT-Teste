package pkg03.modelo;
import java.util.Scanner;
/**
 *
 * @author Clayton
 */
public class Main {
   public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String trabalho;

		Modelo m1 = new Modelo();
		Modelo m2 = new Modelo();
		Ator a1 = new Ator();
		Ator a2 = new Ator();
		
		//Modelo
		m1.setNome("Luiz Antonio");
		m1.setIdade(23);
		m1.setAltura(1.80);
		m1.setPeso(60.5);
		m1.setTrabalho("Malhação");
		
		m2.setNome("Luiz Antonio");
		m2.setIdade(23);
		m2.setAltura(1.80);
		m2.setPeso(60.5);
		m2.setTrabalho("Caminhos da india");
		
		a1.setNome("Barbara Miller");
		a1.setAltura(1.85);
		a1.setIdade(19);
		a1.setPeso(55.2);
		a1.setNivelAtor(3);
		a1.setTrabalho("Novela");
		
		a2.setNome("Barbara Miller");
		a2.setAltura(1.85);
		a2.setIdade(19);
		a2.setPeso(55.2);
		a2.setNivelAtor(3);
		a2.setTrabalho("Modelo");
		
		m1.mostrarDados();
		m2.mostrarDados();
		a1.mostrarDados();
		a2.mostrarDados();
	}

}
