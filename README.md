# Estruturas de Dados em Java

Este projeto contém implementações de três estruturas de dados fundamentais: Pilha, Fila e Lista Encadeada. Cada estrutura foi implementada do zero sem utilizar as classes nativas do Java. Além disso, apresentamos a análise da complexidade assintótica de tempo para os métodos principais.

## 1. Pilha (Stack)
A Pilha segue o princípio **LIFO** (Last In, First Out), ou seja, o último elemento inserido é o primeiro a ser removido.

### Métodos Implementados
- `push(int valor)`: Adiciona um inteiro ao topo da pilha.
- `pop()`: Remove e retorna o inteiro no topo da pilha.
- `top()`: Retorna o inteiro no topo da pilha sem removê-lo.
- `isEmpty()`: Retorna `true` se a pilha estiver vazia, caso contrário, retorna `false`.
- `size()`: Retorna o número de elementos na pilha.

### Complexidade Assintótica
- **push()**: O(1) - Inserção ocorre diretamente no topo.
- **pop()**: O(1) - Remoção ocorre diretamente no topo.

---

## 2. Fila (Queue)
A Fila segue o princípio **FIFO** (First In, First Out), ou seja, o primeiro elemento inserido é o primeiro a ser removido.

### Métodos Implementados
- `enqueue(int valor)`: Adiciona um inteiro ao final da fila.
- `dequeue()`: Remove e retorna o primeiro inteiro da fila.
- `rear()`: Retorna o inteiro no final da fila.
- `front()`: Retorna o inteiro no início da fila.
- `size()`: Retorna o número de elementos na fila.
- `isEmpty()`: Retorna `true` se a fila estiver vazia, caso contrário, retorna `false`.

### Complexidade Assintótica
- **enqueue()**: O(1) - Inserção ocorre no final.
- **dequeue()**: O(1) - Remoção ocorre no início.
- **rear()**: O(1) - Acessa o último elemento diretamente.
- **front()**: O(1) - Acessa o primeiro elemento diretamente.

---

## 3. Lista Encadeada (Linked List)
A Lista Encadeada é uma estrutura de dados onde os elementos (nós) são armazenados em sequência, com cada nó apontando para o próximo.

### Métodos Implementados
- `push(Node node)`: Adiciona um nó ao final da lista.
- `pop()`: Remove e retorna o último nó da lista.
- `insert(int index, Node node)`: Adiciona um nó em uma posição específica.
- `remove(int index)`: Remove um nó de uma posição específica.
- `elementAt(int index)`: Retorna o nó de um índice específico.
- `size()`: Retorna o tamanho da lista.
- `printList()`: Exibe a lista no console.

### Complexidade Assintótica
- **push()**: O(n) - Percorre a lista até o final para inserir.
- **pop()**: O(n) - Percorre até o penúltimo nó para remover o último.
- **insert()**: O(n) - Percorre até a posição desejada antes de inserir.
- **remove()**: O(n) - Percorre até a posição desejada antes de remover.
- **elementAt()**: O(n) - Percorre até a posição desejada antes de retornar o elemento.

---

### Explicação para implementação de um mapa hash do zero

- **Função Hash**: A função `hash(int key)` calcula o índice usando o módulo do valor da chave com o tamanho do mapa. Isso garante que a chave será mapeada para um índice entre 0 e 9, o que é adequado para o tamanho fixo de 10 elementos.

- **Método `put(int key, int value)`**: Este método tenta inserir a chave e o valor na posição calculada pela função hash. Se a posição já estiver ocupada (colisão), ele sobrescreve o valor. Isso é feito de forma simples, mas poderia ser aprimorado com técnicas de resolução de colisões como encadeamento ou sondagem.

- **Método `delete(int key)`**: Aqui, a chave é buscada no índice gerado pela função hash e, se encontrada, a posição é marcada como vazia (através da atribuição de `-1` para a chave e `0` para o valor).

- **Método `get(int key)`**: Retorna o valor associado à chave. Caso a chave não seja encontrada, retorna `-1`.

- **Método `clear()`**: Remove todos os elementos, restaurando os valores dos arrays para seu estado inicial.

- **Método `print()`**: Para visualizar o estado atual do mapa, mostrando as chaves e seus respectivos valores.

### Justificativa da Função Hash

A função `key % SIZE` foi escolhida por ser simples e eficaz em distribuições comuns de números inteiros. Em situações mais complexas, outras funções de hash, como a multiplicação ou hash de divisão, podem ser utilizadas, mas essa abordagem é adequada para este exemplo simples, dada a tabela de tamanho fixo de 10 elementos.

Essa implementação é básica e pode ser expandida para lidar com colisões de forma mais sofisticada, caso necessário.


## Conclusão
Cada estrutura de dados foi implementada de forma eficiente para seus respectivos casos de uso. A Pilha e a Fila possuem operações de inserção e remoção de tempo constante O(1), enquanto a Lista Encadeada pode ter operações mais custosas devido à necessidade de percorrer os nós.

