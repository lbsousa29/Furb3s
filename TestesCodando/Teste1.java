package TestesCodando;

public class Teste1 {
   private int[] info;
   private int tamanho;
   private int limite;
   private int inicio;

    public void FilaVetor(int limite){
        this.info = new int[limite];
        this.limite = limite;
        this.tamanho = 0;
        this.inicio = 0;
    }

    public void inserir(int valor){
        if (tamanho == limite) {
            System.out.println("A fila está cheia)");
        } else {
            info[(inicio + tamanho) % limite] = valor;
            tamanho++;
        }
    }

    

}
