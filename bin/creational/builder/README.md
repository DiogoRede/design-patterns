# Builder Pattern
O Builder Pattern é um padrão de projeto criacional que é usado para construir objetos complexos passo a passo. Ele separa a construção de um objeto complexo de sua representação, permitindo que o mesmo processo de construção possa criar diferentes representações do objeto. O Builder Pattern é útil quando você precisa construir objetos com muitos parâmetros opcionais ou quando deseja ocultar a complexidade da criação de objetos do cliente.

## Vantagens
- `Controle de Construção:` O Builder Pattern fornece um controle preciso sobre o processo de construção de objetos, permitindo a definição de diferentes etapas de construção.

- `Flexibilidade:` Ele permite a criação de diferentes tipos de objetos usando o mesmo processo de construção, oferecendo uma maneira flexível de criar objetos complexos.

- `Separação de Responsabilidades:` O Builder separa a construção de um objeto de sua representação, promovendo uma melhor organização do código e uma maior facilidade de manutenção.

## Desvantagens
- `Complexidade Adicional:` O uso do Builder Pattern pode adicionar complexidade ao código, especialmente em casos onde a lógica de construção é complexa ou onde existem muitos parâmetros opcionais.

- `Código Repetitivo:` Em algumas implementações, pode ser necessário escrever muito código repetitivo para definir os diferentes passos de construção.

## Quando usar?
Ele é útil quando se deseja evitar construtores com uma longa lista de parâmetros, criar objetos imutáveis ou fornecer uma maneira fluente e fácil de configurar diferentes aspectos de um objeto.