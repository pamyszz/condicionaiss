package condicionais;
import java.util.Scanner;

public class calculoimc {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  
        System.out.print("Digite seu peso em kg: ");
        float peso = scanner.nextFloat();
        
        System.out.print("Digite sua altura em metros: ");
        float altura = scanner.nextFloat();
     
        float imc = peso / (altura * altura);
        
        System.out.printf("Seu IMC é: %.2f%n", imc);
        System.out.println("Classificação: " + classificarIMC(imc));
        
        scanner.close();
    }
    
    public static String classificarIMC(float imc) {
        if (imc < 18.5) {
            return "Abaixo do peso";
        } else if (imc >= 18.5 && imc <= 24.9) {
            return "Peso ideal (parabéns)";
        } else if (imc >= 25.0 && imc <= 29.9) {
            return "Levemente acima do peso";
        } else if (imc >= 30.0 && imc <= 34.9) {
            return "Obesidade grau I";
        } else if (imc >= 35.0 && imc <= 39.9) {
            return "Obesidade grau II (severa)";
        } else {
            return "Obesidade III (mórbida)";
        }
    }
}


