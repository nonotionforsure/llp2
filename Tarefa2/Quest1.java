import java.util.Scanner;

class Quest1{
    public static void main(String[] args) {
        
    
        int v[] = new int[10]; 
        int i; 
    
        try {
            for (i=0; i<10; i++) {
                System.out.printf("Informe a posicao");
                Scanner input = new Scanner(System.in);
                String p1 = input.next();
                int p = Integer.parseInt(p1);
                System.out.printf("Informe o valor");
                String n1 = input.next();
                int n = Integer.parseInt(n1); 
                v[p] = n;
            
             }
        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.printf("Posicao inexistente");
        }
        catch ( NumberFormatException e) {

            System.out.printf("Digito invalido");
        }
       

    }
}
