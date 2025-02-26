public class Fifo {
    private int[] elementos;
    private int frente;
    private int tras;
    private int capacidade;
    private int tamanho;

    public Fifo(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.frente = 0;
        this.tras = -1;
        this.tamanho = 0;
    }

    public void enqueue(int valor) {
        if (tamanho == capacidade) {
            throw new IllegalStateException("Fila cheia!");
        }
        tras = (tras + 1) % capacidade;
        elementos[tras] = valor;
        tamanho++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!");
        }
        int valor = elementos[frente];
        frente = (frente + 1) % capacidade;
        tamanho--;
        return valor;
    }

    public int front() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!");
        }
        return elementos[frente];
    }

    public int rear() {
        if (isEmpty()) {
            throw new IllegalStateException("Fila vazia!");
        }
        return elementos[tras];
    }

    public boolean isEmpty() {
        return tamanho == 0;
    }

    public int size() {
        return tamanho;
    }

    public static void main(String[] args) {
        Fifo fifo = new Fifo(5);
        fifo.enqueue(10);
        fifo.enqueue(20);
        System.out.println("Frente da fila: " + fifo.front()); // 10
        System.out.println("Fim da fila: " + fifo.rear()); // 20
        System.out.println("Tamanho: " + fifo.size()); // 2
        System.out.println("Removendo: " + fifo.dequeue()); // 10
        System.out.println("Fila vazia? " + fifo.isEmpty()); // false
    }
}
