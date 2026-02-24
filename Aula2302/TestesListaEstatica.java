public class TestesListaEstatica {
    public static void main(String[] args) {
        ListaEstatica lista1 = new ListaEstatica();
        lista1.inserir(5);
        lista1.inserir(10);
        lista1.inserir(15);
        lista1.inserir(20);
        
        // caso 1
        System.out.println(lista1.toString());
        // caso 2
        System.out.println("Tamanho da lista1: " + lista1.getTamanho());
        // caso 3
        System.out.println("A posição do elemento 15 é " + lista1.buscar(15));
        // caso 4
        System.out.println("A posição do elemento 30 é: " + lista1.buscar(30));
        // caso 5
        lista1.retirar(10);
        System.out.println(lista1.toString());
        System.out.println("O tamanho é: " + lista1.getTamanho());
        // caso 6
        ListaEstatica lista2 = new ListaEstatica();
        lista2.inserir(1);
        lista2.inserir(2);
        lista2.inserir(3);
        lista2.inserir(4);
        lista2.inserir(5);
        lista2.inserir(6);
        lista2.inserir(7);
        lista2.inserir(8);
        lista2.inserir(9);
        lista2.inserir(10);
        lista2.inserir(11);
        lista2.inserir(12);
        lista2.inserir(13);
        lista2.inserir(14);
        lista2.inserir(15);
        System.out.println("Lista2: " + lista2.toString());
        System.out.println("Tamanho da lista2: " + lista2.getTamanho());
        // caso 7
        ListaEstatica lista3 = new ListaEstatica();
        lista3.inserir(5);
        lista3.inserir(10);
        lista3.inserir(15);
        lista3.inserir(20);
        System.out.println("O elemento na posição 3 é: " + lista3.obterElemento(3));
        // caso 8
        try {
            System.out.println(lista3.obterElemento(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        // caso 9
        ListaEstatica lista4 = new ListaEstatica();
        lista4.inserir(5);
        lista4.inserir(10);
        lista4.inserir(15);
        lista4.inserir(20);
        lista4.liberar();
        System.out.println("Lista4: " + lista4.estaVazia());

    }
}
