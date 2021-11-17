public class Quest2{

    public static void main(String[] args){
        try {
            int[] x = new int[10];
            for(int i=0; i<x.length; i++){
                x[i] = i;
            }

            for(int i=0; i<=x.length; i++){
                System.out.println(x[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("A posicao que o for esta tentando acessar nao existe");
        }
        
    }
}
