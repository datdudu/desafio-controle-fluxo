## Desafio Controle de Fluxo

Desafio se consiste em criar um programa que leia dois números, faça a subtração da segunda leitura pela primeira e itere sobre este resultado, imprimindo número por número da iteração feita. É necessário também tratar a excessão gerada.

## Solução

Criada a classe Contador que é o coração da aplicação, tendo o método *Contar*, recebendo os dois parâmetros.

O método citado acima, primeiramente, valida se o primeiro parâmetro é maior ou igual ao segundo, caso seja, uma exceção do tipo *ParametrosInvalidosException* é lançada. Caso não seja, é feita a subtração do segundo parâmetro pelo primeiro e depois é feito um *for* iterando sobre o resultado da subtração, imprimindo cada iteração feita.

Foi criada uma classe para lidar com a exceção. A *ParametrosInvalidosException* retorna uma mensagem padrão, mas também tem um método que pode ser passado uma mensagem personalizada a ela, indicando o caso de erro.

No método *main* é feito a leitura dos parâmetros e a execução deles dentro de um bloco *try-catch* para tratar a exceção criada.




