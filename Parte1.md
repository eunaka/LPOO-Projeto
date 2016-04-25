Objetivo

Desenvolver no aluno a habilidade de implementar classes, atributos e métodos em uma linguagem OO. Esta parte do projeto cobre primordialmente as aulas de “Java estruturado”, classes, objetos, atributos, métodos, construtores e a parte de arrays e strings.

Entrega: 31/03 por email para o monitor e estagiário docente que acompanhar o projeto

Especificação

1. Implementar a classe ItemCardapio que representa um prato disponível no cardádio do restaurante. Essa classe deverá possuir os seguintes atributos e métodos:

-id: long;

-nome: String;

-preço: double;

2. Implementar a classe Pedido, que representa um pedido de um cliente a um restaurante. Essa

classe deverá possuir os seguintes atributos e métodos:

-status: Enum;

-itens: ItemCardapio[];

-idRestaurante: long;

-VerificarStatus();

3. Implementar a classe Restaurante que representa um restaurante cadastrado no sistema.

Essa classe deverá possuir os seguintes atributos e métodos:

-login: String;

-senha: String;

-nome: String;

-id : long;

-pedidosEspera: Pedido[];

-cardapio: ItemCardapio[];

-listarPedidos();

-cancelarPedido();

-confirmarEnvio();

-adicionarPrato(restauranteId);

-removerPrato(restauranteId);

4. Implementar a classe Cliente que representa um cliente cadastrado no sistema. Essa classe deverá possuir os seguintes atributos e métodos:

-login: String;

-senha: String;

-nome: String;

-id: long;

-favoritos: Restaurante[];

-carrinho: ItemCardapio[];

adicionarNoCarrinho(restId, pedido);

efetuarPedido();

cancelarPedido();

5. Implementar a classe Gerente que representa o administrador do sistema. Essa classe

deverá possuir os seguintes atributos e métodos:

-login: String;

-senha: String;

-nome: String;

-id: long;

-restaurantes: Restaurante[];

-clientes: Cliente[];

AdicionarCliente();

AdicionarRestaurante();

adicionarPrato(restauranteId);

removerPrato(restauranteId);

RemoverCliente();

RemoverRestaurante();

ListarClientes();

ListarRestaurantes();

6. Desenvolver programas de testes para todas as classes implementadas;

7. Todas as classes devem possuir construtores. O aluno deverá observar quais atributos podem ser inicializados nesses construtores.
