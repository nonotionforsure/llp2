import java.util.Scanner;
import java. util.Stack;
import java. util.Random;

public class Calculadora{


	public static void main(String [] args){
		System.out.println("Digite um valor ");
		Stack<Integer> pilha = new Stack<Integer>(); //declaração pilha 

        while(true){
            Scanner input = new Scanner(System.in); 
		    String num = input.next(); 

            switch(num) {
                case "-":
                    int sub = (Integer) pilha.pop(); //pegar ultimo elemento 
                    sub = sub - pilha.pop(); //realizar operação
                    pilha.push(sub); //guardar resultado no topo 

                    System.out.println("Resultado: "); 
                    System.out.println(pilha); 
                    break;

                case "+":
                    int soma = (Integer) pilha.pop();
                    soma = soma + pilha.pop();
                    pilha.push(soma);

                    System.out.println("Resultado: ");  
                    System.out.println(pilha);
                    break;

                case "/":
                    int div = (Integer) pilha.pop();
                    div = div/pilha.pop();
                    pilha.push(div); 

                    System.out.println("Resultado: ");
                    System.out.println(pilha);
                    break;

                case "*":
                    int mult = (Integer) pilha.pop();
                    mult = mult * pilha.pop();
                    pilha.push(mult);

                    System.out.println("Resultado: "); 
                    System.out.println(pilha);
                    break;
            
                default:
                    int ele = Integer.parseInt(num); //converter entrada para inteiro 
                    pilha.push(ele);
                    break;
            }
        }
    }
}