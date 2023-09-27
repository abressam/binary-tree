public class ArvoreBinaria {
    private No raiz;

    // Criar árvore binária vazia
    public ArvoreBinaria() {}

    public int getValorRaiz() {
        if (raiz != null) {
            return raiz.getValor();
        } else {
            return -1; // Por exemplo, retornando -1 em caso de árvore vazia
        }
    }

    public void imprimirArvore() {
        System.out.println(raiz.getValor()); // Imprime o valor da raiz sem "└──"
        imprimirRecursividade(raiz.getEsquerda(), " ");
        imprimirRecursividade(raiz.getDireta(), " ");
    }

    private void imprimirRecursividade(No no, String prefixo) {
        if (no != null) {
            System.out.println(prefixo + "└── " + no.getValor());
            imprimirRecursividade(no.getEsquerda(), prefixo + "    ");
            imprimirRecursividade(no.getDireta(), prefixo + "    ");
        }
    }

    private No inserirRecursividade(No no_atual, int valor) {
        if (no_atual == null) {
            return new No(valor);
        }

        if (valor < no_atual.getValor()) {
            no_atual.setEsquerda(inserirRecursividade(no_atual.getEsquerda(), valor));
        } else if (valor > no_atual.getValor()) {
            no_atual.setDireta(inserirRecursividade(no_atual.getDireta(), valor));
        } else {
            no_atual.setDireta(inserirRecursividade(no_atual.getDireta(), valor));
        }

        return no_atual;
    }

    public void inserir(int valor) {
        raiz = inserirRecursividade(raiz, valor);
    }

    public boolean buscaNo(int valor) {
        return buscarNoRecursividade(raiz, valor);
    }

    private boolean buscarNoRecursividade(No no_atual, int valor) {
        if (no_atual == null) {
            return false;
        }

        if (valor == no_atual.getValor()) {
            return true;
        } else if (valor < no_atual.getValor()) {
            return buscarNoRecursividade(no_atual.getEsquerda(), valor);
        } else {
            return buscarNoRecursividade(no_atual.getDireta(), valor);
        }
    }

    public int deletar(int valor) {
        raiz = deletarRecursivamente(raiz, valor);
        return valor;
    }

    private No deletarRecursivamente(No no, int valor) {
        if (no == null) {
            System.out.println("Valor " + valor + " não encontrado na árvore");
            return no;
        }

        if (valor < no.getValor()) {
            no.setEsquerda(deletarRecursivamente(no.getEsquerda(), valor));
        }
        else if (valor > no.getValor()) {
            no.setDireta(deletarRecursivamente(no.getDireta(), valor));
        }
        else {
            // Caso 1: Nó folha ou com apenas um filho
            if (no.getEsquerda() == null) {
                return no.getDireta();
            } else if (no.getDireta() == null) {
                return no.getEsquerda();
            }

            // Caso 2: Nó com dois filhos
            no.setValor(encontrarMenorValor(no.getDireta()));
            no.setDireta(deletarRecursivamente(no.getDireta(), no.getValor()));
        }
        return no;
    }

    private int encontrarMenorValor(No no) {
        int menorValor = no.getValor();
        while (no.getEsquerda() != null) {
            menorValor = no.getEsquerda().getValor();
            no = no.getEsquerda();
        }
        return menorValor;
    }

}