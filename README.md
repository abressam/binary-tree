<h1 align="center">
 🌳 Árvore Binária 🌳 <br>PJBL 2<br>Grupo 4<br>
</h1>

# 🚀 Sobre o projeto

<p align="justify">
    Esse projeto foi desenvolvido com o objetivo de criar uma árvore binária de busca.
</p>

# 📝 Como o projeto funciona?

<p align="justify">
    O código está divido em três partes, seguindo as boas práticas da programação orientada a objetos. Então, está dividido entre as classes Main, Árvore Binária e Nó.
</p>

## Classe Nó

<p align="justify">
    A classe nó possuirá três atributos: valor, direita e esquerda, e o seu construtor.
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/624c9c87-68a5-4e48-89a0-022b0431bfd8)


<p align="justify">
    Além disso, também é necessário possuir oss getters and setters.
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/312ca46c-a8a7-49a6-a5ed-c6689ad9b0c2)


## Classe Árvore Binária

<p align="justify">
    Essa classe possui toda a lógica da árvore binária como as funções de inserir, deletar e buscar elementos.
</p>

### Inserir

<p align="justify">
    Essa é uma função que utiliza recursividade para saber se um nó deve ser incluido na direita ou na esquerda, em relação ao nó raiz ou ao nó pai vinculada. Seguindo a regra, um elemento é adicionado a direita quando é maior do que o valor de referência ou adionado a esquerda quando é menor, comparado com o valor de referência.
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/361e33b8-af42-4c1d-9072-5bcd9d5a6141)

<p align="justify">
    Como no exemplo abaixo, o 10 foi o primeiro valor adicionado, logo ele representa a raiz. Em seguida temos o valor 5 que representa o valor da esquerda e o valor 15 que representa o valor da direita.
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/c7e06788-aac4-46f7-bb34-45086c1878b3)

### Buscar

<p align="justify">
    A função de busca irá percorrer a árvore procurando o valor inserido, ele levará como primeira comparação se o valor digitado é maior, menor ou igual a raiz. Caso o valor seja maior ele seguira procurando pela a direita e caso seja menor irá procurar pela esquerda. O programa fará esse processo até encontrar o valor desejado, e caso encontre retronará true, caso contrário retornará false.
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/8cec3baf-0860-44d3-aa10-84274c99fb46)

<p align="justify">
    No exemplo abaixo o código encontrou os valores 12 e 10, mas não encontrou o valor 98.
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/0ff6bbe6-07f1-4c38-a77c-402825b02165)

### Deletar

<p align="justify">
    A função de deletar funcionará de forma semelhante as anteriores, ainda é necessário percorrer a árvore, indo para a direita ou pela esquerda em busca do elemento a ser deletado. Caso o nó deletado não possuia nós filhos, ele é apenas removido; caso o nó possua apenas um filho, é necessário substituí-lo pelo seu filho; caso o nó possua dois filhos, é necessário identificar o nó sucessor (nó da direita) para que ele seja substaituído e mantenha o nó que estava na esquerda como seu filho. 
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/e748feef-bd31-4079-9540-46a0edfa43a2)

![image](https://github.com/abressam/binary-tree/assets/71531467/cfa54e9b-7cc6-49c0-9f68-9f0d387856f7)


## Classe Main

<p align="justify">
    A classe main apenas cria uma instancia da árvore binária para que seja possível utilizar as funções criadas e imprime o resultado final.
</p>

![image](https://github.com/abressam/binary-tree/assets/71531467/b0a6b5c9-57aa-4a4e-8b16-2590b19e1053)

