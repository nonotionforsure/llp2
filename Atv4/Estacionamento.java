import java.io.*;
import java.util.Scanner;

public class Estacionamento{ 
    private String placa;
    private String modelo;
    private int chegada; 
    private int saida; 
    private double valor;

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String x) {
        this.placa = x;
    }

    //
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String x) {
        this.modelo = x;
    }

    //
    public int getChegada() {
        return chegada;
    }
    public void setChegada(int x) {
        this.chegada = x;
    }

    //
    public int getSaida() {
        return saida;
    }
    public void setSaida(int x) {
        this.saida = x;
    }

    public void Inicializa(){
        this.placa = "";
        this.modelo = "";
        this.chegada = 0;
        this.saida = 0;
    }

    public void Pagamento(){
        int a = this.chegada;
        int b = this.saida; 
        this.valor = (saida - chegada)*1.5;
    }

    public void ListarDados(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Entrada: " + this.chegada + " horas");
        System.out.println("Saida: " + this.saida + " horas");
        System.out.println("Valor do estacionamento: " + this.valor + " reais");
    }


    public static void main(String args[]) throws IOException {
        Estacionamento obj = new Estacionamento();

        Scanner ler = new Scanner(System.in);
        String endereco = ler.nextLine();
        BufferedReader leitura = new BufferedReader(new FileReader(endereco));

        obj.Inicializa();

        obj.placa = leitura.readLine(); 
        obj.modelo = leitura.readLine(); 

        String n = leitura.readLine();
        obj.chegada = Integer.parseInt(n);
        String m = leitura.readLine();
        obj.saida = Integer.parseInt(m);

        obj.Pagamento();
        obj.ListarDados();
        leitura.close();
        ler.close();
    }
}