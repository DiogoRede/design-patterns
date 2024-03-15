# Factory Method
O Factory Method é uma ótima escolha quando você precisa de uma maneira flexível e extensível de criar objetos, especialmente em situações onde a criação de objetos é dinâmica e baseada em lógica específica em tempo de execução.

## Vantagens
- `Abstração da Criação de Objetos:` O Factory Method encapsula a lógica de criação de objetos em uma classe separada, promovendo uma maior abstração e desacoplamento entre o código cliente e as classes concretas.

- `Flexibilidade na Criação de Objetos:` Permite a fácil extensão do código para suportar novos tipos de objetos sem modificar o código cliente existente.

- `Encapsulamento do Código de Criação:` Mantém o código de criação de objetos centralizado em uma única classe (ou hierarquia de classes), facilitando a manutenção e evolução do sistema.

- `Promove o Princípio Aberto/Fechado:` O Factory Method segue o princípio do design de software conhecido como "Aberto para Extensão, Fechado para Modificação".

## Desvantagens
- `Complexidade Adicional:` A introdução de uma hierarquia de classes de fábrica pode adicionar complexidade ao código.

- `Aumento do Número de Classes:` A implementação do Factory Method pode resultar em um aumento no número de classes no sistema.

- `Escolha do Tipo de Fábrica:` Em alguns casos, pode ser necessário decidir qual tipo de fábrica usar em tempo de execução, o que pode introduzir complexidade adicional.

## Quando usar?
Use o Factory Method quando a criação de objetos precisa ser dinâmica e baseada em alguma lógica ou configuração específica em tempo de execução.

Use o Factory Method quando estiver aplicando o padrão de projeto criacional, especialmente em situações onde há uma família de produtos relacionados e você deseja encapsular sua criação.

Use quando desejar fornecer uma maneira flexível e extensível de criar objetos, facilitando a introdução de novos tipos de produtos no sistema.