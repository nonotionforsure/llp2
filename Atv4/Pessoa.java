import java.util.Scanner;
import java.io.*;


public class Pessoa{ 
    private String nom;
    private int nas;
    private int alt; 
    private int idade; 

    
    
    public void setnas(int ano) {
        this.nas = ano;
    }

    public int getnas() {
        return nas;
    }

    public int getAlt() {
        return alt;
    }
    public String getNome() {
        return nom;
    }

    public void setNome(String n) {
        this.nom = n;
    }


    public void setAlt(int a) {
        this.alt = a;
    }

    public void Idade(){
        int i = this.nas;
        this.idade = 2021-i;
    }

    public void ListarDados(){
        System.out.println("Nome: " + this.nom);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Altura: " + this.alt + " cm");
    }


    public static void main(String args[]) throws IOException {
        Pessoa obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        obj.nom = leitura.readLine();
        String l = leitura.readLine();
        obj.nas = Integer.parseInt(l);
        String j = leitura.readLine();
        obj.alts = Integer.parseInt(j);

        
        obj.ListarDados(); 
        obj.Idade(); 
        
        leitura.close();
        ler.close();
    }
}