public class ListaEstatica {
    private int[] info;
    private int tamanho;

    public ListaEstatica() {
        info = new int[10];
        tamanho = 0;
    }

    private void redimensionar() {
        int[] novaInfo = new int[info.length * 2];
        for (int i = 0; i < info.length; i++) {
            novaInfo[i] = info[i];
        }
        info = novaInfo;
    }

    public void inserir(int valor) {
        if (tamanho == info.length)
            ;
        redimensionar();
        info[tamanho] = valor;
        tamanho++;
    }

    public void exibir() {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(info[i]);
        }
    }

    public int buscar(int valor) {
        for (int i = 0; i < tamanho; i++) {
            if (info[i] == valor) {
                return i;
            }
        }
        return -1;
    }

    public void retirar(int valor) {
        int posicao = buscar(valor);
        if (posicao != -1) {
            for (int i = posicao; i < tamanho - 1; i++) {
                info[i] = info[i + 1];
            }
            tamanho--;
        }
    }

    public void liberar() {
        info = new int[10];
        tamanho = 0;
    }

    public int obterElemento(int posicao) {
        if (posicao >= 0 && posicao < tamanho) {
            return info[posicao];

        }
        throw new IndexOutOfBoundsException("Posição inválida: " + posicao);
    }

    public boolean estaVazia() {
        return tamanho == 0;

    }

    public int getTamanho() {
        return tamanho;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < tamanho; i++) {
            sb.append(info[i]);
            if (i < tamanho - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

}
