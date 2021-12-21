import java.io.*;
import java.util.Scanner;

public class Pessoa{ 
    private String nome;
    private String pai;
    private String mae;

    public Pessoa(String x, String m, String p){ 
        this.nome = x;
        this.pai = pa;
        this.mae = ma; 
    }

    public Pessoa(String x){
        this.nome = x;
    }

    //
    public String getNome() {
        return this.nome;
    }
    public void setNome(String x) {
        this.nome = x;
    }

    //
    public String getPai() {
        return this.pai;
    }
    public void setPai(String pa) {
        this.pai = pa;
    }

    //
    public String getMae() {
        return this.mae;
    }
    public void setMae(String ma) {
        this.mae = ma;
    }


    public void Irmaos(Pessoa a) {
		if(this.pai == a.pai || this.mae == a.mae){
			System.out.println("São irmãos!");
		} else {
			System.out.println("Não são irmãos!");
		}
	}

    public void Antecessor(Pessoa a) {
		if(a.nome == this.pai || a.nome == this.mae) {
			System.out.println("Essas pessoas são parentes");
		} else {
			System.out.println("Não são parentes!");
		}
	}
	
    public static void main(String args[]) throws IOException {
        Pessoa obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));


        String a = leitura.readLine();
        String b = leitura.readLine();

        leitura.close();
        ler.close();


    }

}