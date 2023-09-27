public class No {
    private int valor;
    private No direta;
    private No esquerda;

    public No(int valor) {
        this.valor = valor;
        this.direta = null;
        this.esquerda = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public No getDireta() {
        return direta;
    }

    public void setDireta(No direta) {
        this.direta = direta;
    }

    public No getEsquerda() {
        return esquerda;
    }

    public void setEsquerda(No esquerda) {
        this.esquerda = esquerda;
    }
}
