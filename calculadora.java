
/* Exercício da aula 21/10/23 - Calculadora em java
   Fazer operações de soma, subtração, divisão e multiplicação, */
 
import java.util.Scanner;

public class calculadora {

public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);

    Double  valorUm;
    Double  valorDois;
    String  operacao;

    System.out.println("Digite o primeiro numero: ");
    valorUm = scanner.nextDouble();

    System.out.println("Digite a operação ( +, -, /, *): ");
    operacao = scanner.next();
    
    System.out.println("Digite o segundo numero: ");
    valorDois = scanner.nextDouble();

    System.out.println("Resultado: " + fazerCalculo(valorUm , valorDois , operacao));

}
public static Double fazerCalculo(Double valorUm, Double valorDois, String operacao){
    Double respostaCalculo = 0.0;

    switch (operacao){
        case "+":
             respostaCalculo = valorUm + valorDois;
            break;
        case "-":
            respostaCalculo = valorUm - valorDois;
            break;
        case "/":
            respostaCalculo = valorUm / valorDois;
            break;
        case "*":
            respostaCalculo = valorUm * valorDois;  
            break;
        default:
        System.out.println("<=> A operacao esta incorreta  <=>");
    
        
    }
    return respostaCalculo;
}
}