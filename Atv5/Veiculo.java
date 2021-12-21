import java.io.*;
import java.util.Scanner;

public class Veiculo {
	private String marca;
	private int rodas;
	private String modelo;
	private int velocidadeAtual = 0;
	
	public Veiculo(int v, int rod, String m, String marc) { 
	    this.velocidadeAtual = v;
	    this.rodas = rod;
	    this.modelo = m;
	    this.marca = marc;
	}
	
	public void aceleracao(int v) {
		this.velocidadeAtual += v;
	}
	
	public void frear(int v) {
		this.velocidadeAtual -= v;
	}
	
	public int GetvelocidadeAtual() {
		return(this.velocidadeAtual);
	}
	public void SetvelocidadeAtual(int v) {
		this.velocidadeAtual = v;
	}

	//
	public int GetRodas() {
		return(this.rodas);
	}
	public void SetRodas(int rod) {
		this.rodas = rod;
	}

	//
	public String GetMarca() {
		return(this.marca);
	}
	public void SetMarca(String m) {
		this.marca = m;
	}

	//
	public String GetModelo() {
		return(this.modelo);
	}
	public void SetModelo(String m) {
		this.modelo = m;
	}

	public void imprimirInformacoes() {
		System.out.println(this.velocidadeAtual);
		System.out.println(this.rodas);
		System.out.println(this.modelo);
		System.out.println(this.marca);
	}


    public static void main(String args[]) throws IOException {
        Questao2 obj = new Pessoa();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        String a = leitura.readLine(); 
        String b = leitura.readLine(); 
		String c = leitura.readLine(); 
        String d = leitura.readLine();
		obj.rodas = Integer.parseInt(c);
		obj.velocidadeAtual = Integer.parseInt(d);

        leitura.close();
        ler.close();


    }
}