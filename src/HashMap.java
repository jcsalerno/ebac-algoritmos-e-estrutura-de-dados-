public class HashMap {
    private int[] keys;  // Vetor de chaves
    private int[] values;  // Vetor de valores

    // Tamanho fixo de 10 elementos
    private static final int SIZE = 10;

    public HashMap() {
        keys = new int[SIZE];
        values = new int[SIZE];
        for (int i = 0; i < SIZE; i++) {
            keys[i] = -1;  // Inicializando com -1 (indicando vazio)
        }
    }

    // Função hash simples
    private int hash(int key) {
        return key % SIZE;
    }

    // Adiciona a chave e o valor no mapa
    public void put(int key, int value) {
        int index = hash(key);
        if (keys[index] == -1) {  // Se a posição está vazia
            keys[index] = key;
            values[index] = value;
        } else {  // Se a posição já está ocupada, trata-se de uma colisão
            // Resolução simples: Vamos sobrescrever o valor
            keys[index] = key;
            values[index] = value;
        }
    }

    // Remove o valor associado à chave fornecida
    public void delete(int key) {
        int index = hash(key);
        if (keys[index] != -1 && keys[index] == key) {
            keys[index] = -1;  // Marca a posição como vazia
            values[index] = 0;  // Limpa o valor associado
        } else {
            System.out.println("Chave não encontrada!");
        }
    }

    // Retorna o valor associado à chave fornecida
    public int get(int key) {
        int index = hash(key);
        if (keys[index] != -1 && keys[index] == key) {
            return values[index];
        } else {
            System.out.println("Chave não encontrada!");
            return -1;  // Retorna -1 se a chave não for encontrada
        }
    }

    // Remove todos os elementos do mapa
    public void clear() {
        for (int i = 0; i < SIZE; i++) {
            keys[i] = -1;
            values[i] = 0;
        }
    }

    // Método para mostrar o estado atual do mapa
    public void print() {
        for (int i = 0; i < SIZE; i++) {
            if (keys[i] != -1) {
                System.out.println("Chave: " + keys[i] + ", Valor: " + values[i]);
            }
        }
    }

    public static void main(String[] args) {
        HashMap map = new HashMap();
        map.put(1, 100);
        map.put(2, 200);
        map.put(12, 1200);  // Isso vai gerar uma colisão no índice 2
        map.print();  // Deve mostrar as chaves e valores armazenados

        System.out.println("Valor para chave 1: " + map.get(1));
        map.delete(1);
        map.print();  // Deve mostrar o mapa sem a chave 1

        map.clear();
        map.print();  // Deve estar vazio
    }
}
