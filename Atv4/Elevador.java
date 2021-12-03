public class Elevador {
    int andar, pessoasAtual, andarMax, cap;

    public void inicio(int c, int t) {
        this.andar = 0;
        this.pessoasAtual = 0;
        this.andarMax = t;
        this.capc = c;
    }

    public void entrada() {
        if (pessoasAtual < capc) {
            pessoasAtual = pessoasAtual + 1;
        } else {
            System.out.println("O elevador está cheio !!");
        }
    }

    public void saida() {
        if (pessoasAtual > 0) {
            pessoasAtual = pessoasAtual - 1;
        } else {
            System.out.println("O elevador está vazio !!");
        }
    }

    public void sobe() {
        if (andar < andarMax) {
            andar = andar + 1;
        } else {
            System.out.println("Está no andar maximo");
        }
    }

    public void desce() {
        if (andar > 0) {
            andar = andar - 1;
        } else {
            System.out.println("Está no andar terreo");
        }
    }

    public int getAndar() {
        return andar;
    }

    public int getMax() {
        return andarMax;
    }

    public int getCAtual() {
        return pessoasAtual;
    }

    public int getCap() {
        return cap;
    }

    public void setCapac(int x) {
        this.capc = x;
    }

    public void setTotal(int x) {
        this.andar = x;
    }

    public void setCAtual(int x) {
        this.pessoasAtual = x;
    }

    public void setAndar(int x) {
        this.andar = x;
    }

}