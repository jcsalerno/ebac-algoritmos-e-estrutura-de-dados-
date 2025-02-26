class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ListaEncadeada {
    private Node head;
    private int tamanho;

    public ListaEncadeada() {
        this.head = null;
        this.tamanho = 0;
    }

    public void push(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        tamanho++;
    }

    public Node pop() {
        if (head == null) {
            throw new IllegalStateException("Lista vazia!");
        }
        if (head.next == null) {
            Node temp = head;
            head = null;
            tamanho--;
            return temp;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        Node lastNode = temp.next;
        temp.next = null;
        tamanho--;
        return lastNode;
    }

    public void insert(int index, Node node) {
        if (index < 0 || index > tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        if (index == 0) {
            node.next = head;
            head = node;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        tamanho++;
    }

    public void remove(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            temp.next = temp.next.next;
        }
        tamanho--;
    }

    public Node elementAt(int index) {
        if (index < 0 || index >= tamanho) {
            throw new IndexOutOfBoundsException("Índice inválido!");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int size() {
        return tamanho;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();
        lista.push(new Node(10));
        lista.push(new Node(20));
        lista.push(new Node(30));
        lista.printList(); // 10 -> 20 -> 30 -> null

        lista.insert(1, new Node(15));
        lista.printList(); // 10 -> 15 -> 20 -> 30 -> null

        System.out.println("Removendo último: " + lista.pop().data);
        lista.printList(); // 10 -> 15 -> 20 -> null

        System.out.println("Elemento no índice 1: " + lista.elementAt(1).data); // 15

        lista.remove(1);
        lista.printList(); // 10 -> 20 -> null
    }
}
