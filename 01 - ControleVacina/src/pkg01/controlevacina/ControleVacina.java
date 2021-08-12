package pkg01.controlevacina;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ControleVacina {
    public static void main(String[] args) {
        String nomeVacina;
        int dia, mes, ano;
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Digite o nome da vacina: ");
        nomeVacina = input.next().toLowerCase();
        
        System.out.println("Digite o dia: ");
        dia = input.nextInt();
        
        System.out.println("Digite o mês: ");
        mes = input.nextInt();

        if(nomeVacina.equals("coronavac")){
            dia += 14;
            if(dia > 30){
                dia -= 30;
                mes += 1;
            }
            System.out.println("Você terá que tomar no dia " + dia + "/" + mes);
        }else if(nomeVacina.contains("janssen")){
            System.out.println("Dose unica");
        }
    }
    
}