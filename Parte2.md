Objetivo

Desenvolver no aluno a habilidade de organizar o projeto em pacotes, de usar de forma conveniente os modificadores de acesso e de aplicar a filosofia de encapsulamento. Esta parte do projeto cobre as aulas de encapsulamento, pacotes e modificadores de acesso.

Entrega: 20/04/2016

Especificação

1. Implementar as classes RepositorioCliente e RepositorioRestaurante. Essas duas classes serão responsáveis por encapsular operações sobre os vetores de Cliente e Restaurante. A classe RepositorioCliente deverá seguir a seguinte estrutura:

a. Conter um atributo array do tipo Cliente. Ex: private Cliente[] clientes;

b. Conter os seguintes métodos:

i. public void adicionar(Cliente cliente), que adiciona um cliente ao array do repositório;

ii. public void remover(int id), que remove um cliente de acordo com sua posição no array;

iii. public void alterarSenha(int id, String novaSenha), que altera o valor do atributo senha de um cliente na posição passada como parâmetro;

iv. public void alterarNome(int id, String novoNome), que altera o valor do atributo nome de um cliente na posiçao passada como parâmetro.

c. Siga a mesma lógica para a criação da classe Repositório de Restaurantes. Atente para o fato de que os nomes dos atributos e métodos tem que ser modificados para que se adaptem à classe a qual eles pertencem.

2. Observar os atributos comuns das classes Cliente, Gerente e Restaurante e implementar uma Classe Usuario, que conterá todos estes. Essas três classes deverão passar a herdar esses atributos da classe Usuário;

3. Adicionar modificadores em todos os atributos e Implementar os GETTERS e SETTERS respectivos em todas as classes.

4. Mudanças na Classe Cliente:

a. Criar constante inteira MAX_ITENS_CARRINHO com um valor de 150 que irá representar a quantidade máxima de itens suportada pelo carrinho;

b. Implementar o método VOID adicionarNoCarrinho(ItemCardapio item), que adiciona um item no carrinho, esse método deve, realizar uma verificação antes da inserção de um novo item, visando respeitar a quantidade máxima de itens suportada pelo carrinho;

c. Implementar o método VOID removerDoCarrinho(int id), que remove um item de acordo com a posição passada como parâmetro. Vale lembrar que, antes mesmo de remover um item do carrinho, este método deve verificar se o mesmo não está vazio;

d. Implementar o método VOID efetuarPedido(), que transforma a estrutura do carrinho em uma estrutura que representa um pedido. Essa estrutura será representada por uma String com a seguinte lógica: StringPedido = "idCliente;idRestaurante;Status;item1;item2;...;itemN". Onde cada item é representado com a seguinte lógica: Item = "idItem/nomeItem/precoItem".

e. Alterar o tipo do atributo Restaurante[] favoritos para o long[] favoritos;

5. Definir o ENUM STATUS com os seguintes valores padrão: DEFAULT, REALIZADO, PREPARANDO, ENVIADO, ENTREGUE; É importante observar que, enquanto o status não sofre alteração de qualquer natureza, este deverá por padrão ter o status como sendo DEFAULT;

6. Mudanças na Classe Pedido:

a. Adicionar os atributos long idCliente e long idPedido. Estes deverão ser os identificadores de seus respectivos objetos no repositório desta classe.

6. Mudanças na Classe Restaurante:

a. Criar uma constante inteira MAX_PRATOS com um valor de 150 que representa o máximo de itens que cada cardápio pode conter;

b. Implementar o método listarPedidos(), que imprime os ID’s dos itens no array pedidosEspera[]. Verificar se o pedido está vazio;

c. Implementar o método VOID adicionarPrato(ItemCardapio item), que adiciona um item no cardápio respeitando a quantidade máxima;

d. Implementar o método VOID removerPrato(int id), que remove um item do cardápio de acordo com a posição passada como parâmetro;

7. Mudanças na Classe Gerente:

a. Substituir os atributos Cliente[] clientes e Restaurante[] restaurantes por um RepositorioCliente e um RepositorioRestaurante;

b. Implementar o método public VOID adicionarCliente(Cliente cliente), que adiciona um cliente no repositório de Clientes;

c. Implementar o método public VOID adicionarRestaurante(Restaurante restaurante), que adiciona um restaurante ao repositório de Restaurantes;

d. Implementar o método public VOID adicionarPrato(int idRestaurante, ItemCardapio item), que adiciona um ItemCardapio a um determinado restaurante do repositório;

e. Implementar o método public VOID removerPrato(int idRestaurante, int idPrato), que remove um ItemCardapio a um determinado restaurante do repositório;

f. Implementar o método public VOID removerCliente(int idCliente), que remove um cliente do repositório de Clientes;

g. Implementar o método public VOID removerRestaurante(int idRestaurante), que remove um restaurante do repositório de Restaurantes;

h. Implementar o método public VOID listarClientes(), que imprime no console todos os clientes do repositório (id+nome);

i. Implementar o método public VOID listarRestaurantes(), que imprime no console todos os restaurantes do repositório(id+nome);

8. A estrutura de pacotes do projeto será a apresentada abaixo. Implementar a mesma criando os pacotes na estrutura do projeto e alterando as classes de forma que as mesmas tenham a cláusula “package”.

a. Pacote “entidades”: Usuario, Cliente, Gerente, Restaurante, Pedido, ItemCardapio e Status;

b. Pacote “repositorios”: RepositorioCliente e RepositorioRestaurante;

c. Pacote “testes”: Todas as classes de testes;

9. Implementar testes para as novas funcionalidades adicionadas;
