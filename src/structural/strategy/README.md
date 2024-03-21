# Strategy Pattern

O padrão Strategy é um padrão de projeto comportamental que permite definir uma família de algoritmos, encapsular cada um deles e torná-los intercambiáveis. Isso permite que o algoritmo varie independentemente dos clientes que o utilizam.

## Vantagens
- `Flexibilidade:` O padrão Strategy permite que os algoritmos sejam facilmente substituídos ou adicionados sem afetar o cliente.
- `Desacoplamento:` O padrão Strategy promove um baixo acoplamento entre o contexto e as estratégias, permitindo que eles operem independentemente uns dos outros.
- `Reutilização de código:` Como as estratégias são encapsuladas em classes separadas, elas podem ser reutilizadas em diferentes contextos.
- `Facilidade de manutenção:` O padrão Strategy facilita a manutenção do código, pois cada estratégia é responsável por uma única responsabilidade.

## Desvantagens
- `Complexidade:` A implementação do padrão Strategy pode aumentar a complexidade do código devido à introdução de várias classes e interfaces.
- `Necessidade de escolha:` O cliente deve escolher a estratégia apropriada, o que pode aumentar a complexidade da lógica de seleção.

## Quando usar?
O padrão Strategy é útil em situações em que:
- Você precisa selecionar um algoritmo de uma família de algoritmos em tempo de execução.
- Existem diferentes variações de um algoritmo e você deseja encapsular essas variações em classes separadas.
- Diferentes contextos precisam usar diferentes variantes de um algoritmo.