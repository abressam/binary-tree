public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();

        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(5);
        arvoreBinaria.inserir(15);
        arvoreBinaria.inserir(3);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(12);
        arvoreBinaria.inserir(18);

        System.out.println("Árvore antes de deletar um nó:");
        arvoreBinaria.imprimirArvore();

        System.out.println(arvoreBinaria.buscaNo(12));
        System.out.println(arvoreBinaria.buscaNo(5));
        System.out.println(arvoreBinaria.buscaNo(98));

        arvoreBinaria.deletar(10);

        // Imprima a árvore após a deleção
        System.out.println("\nÁrvore após deletar um nó:");
        arvoreBinaria.imprimirArvore();

        System.out.println(arvoreBinaria.buscaNo(12));
        System.out.println(arvoreBinaria.buscaNo(5));
        System.out.println(arvoreBinaria.buscaNo(98));

    }
}