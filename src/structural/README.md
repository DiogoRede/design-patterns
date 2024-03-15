# Decorator
O Decorator é um padrão de projeto estrutural que permite adicionar comportamento a objetos individuais de forma dinâmica e transparente, sem afetar outros objetos da mesma classe.

## Vantagens
- `Flexibilidade na Adição de Funcionalidades:` Permite adicionar novas funcionalidades a objetos existentes de forma dinâmica, sem alterar sua estrutura básica.

- `Facilidade de Extensão:` Possibilita a criação de uma grande variedade de combinações de funcionalidades através da composição de decorators.

- `Maior Legibilidade do Código:` Facilita a compreensão do código ao separar as responsabilidades relacionadas à funcionalidade principal do objeto.

- `Encapsulamento:` Cada decorator encapsula uma única funcionalidade adicional, promovendo um código modular e de fácil manutenção.

## Desvantagens
- `Complexidade Adicional:` O uso excessivo de decorators pode resultar em uma hierarquia de classes complexa e difícil de gerenciar.

- `Potencial para Overhead:` A composição de vários decorators pode levar a um aumento no número de objetos criados, o que pode impactar o desempenho em sistemas de alto tráfego.

## Quando Usar?
Adição Dinâmica de Funcionalidades: Use o Decorator quando precisar adicionar funcionalidades a objetos de forma dinâmica e transparente, sem a necessidade de alterar sua estrutura.

Variações Compostas de Funcionalidades: Use quando desejar criar várias variações de um objeto com diferentes combinações de funcionalidades.

Separação de Responsabilidades: Use para separar responsabilidades relacionadas a funcionalidades adicionais do objeto principal, promovendo um código mais limpo e modular.

## Inspiração: [FreeCodeCamp](https://www.freecodecamp.org/portuguese/news/os-3-tipos-de-padroes-de-projetos-que-todo-desenvolvedor-deveria-conhecer-com-exemplos-de-codigo-de-cada-um/)