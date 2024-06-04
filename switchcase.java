package condicionais;
import java.util.Scanner;
public class switchcase {
	
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número correspondente ao dia da semana (1-7): ");
     
        int numero_dia = scanner.nextInt();
        String nome_dia;
        switch(numero_dia) {
            case 1: 
                nome_dia = "Domingo";break;
            case 2: 
                nome_dia = "Segunda-Feira";break;
            case 3: 
                nome_dia = "Terça-Feira";break;
            case 4: 
                nome_dia = "Quarta-Feira";break;
            case 5: 
                nome_dia = "Quinta-Feira"; break;
            case 6: 
                nome_dia = "Sexta-Feira";break;
            case 7: 
                nome_dia = "Sábado";break;
            default: 
                nome_dia = "dia inválido";break;
        }
        
        System.out.println("O nome do dia é: " + nome_dia);
        scanner.close();
    }
}