public class Pilha {
    private int[] elementos;
    private int topo;
    private int capacidade;

    public Pilha(int capacidade) {
        this.capacidade = capacidade;
        this.elementos = new int[capacidade];
        this.topo = -1;
    }

    public void push(int valor) {
        if (topo == capacidade - 1) {
            throw new IllegalStateException("Pilha cheia!");
        }
        elementos[++topo] = valor;
    }

    public int pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        return elementos[topo--];
    }

    public int top() {
        if (isEmpty()) {
            throw new IllegalStateException("Pilha vazia!");
        }
        return elementos[topo];
    }

    public boolean isEmpty() {
        return topo == -1;
    }

    public int size() {
        return topo + 1;
    }

    public static void main(String[] args) {
        Pilha pilha = new Pilha(5);
        pilha.push(10);
        pilha.push(20);
        System.out.println("Topo da pilha: " + pilha.top()); // 20
        System.out.println("Tamanho: " + pilha.size()); // 2
        System.out.println("Removendo: " + pilha.pop()); // 20
        System.out.println("Pilha vazia? " + pilha.isEmpty()); // false
    }
}
