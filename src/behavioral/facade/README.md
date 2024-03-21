# Facade Pattern

O padrão Facade é um padrão de projeto estrutural que fornece uma interface unificada para um conjunto de interfaces em um subsistema mais complexo. Ele visa ocultar a complexidade do subsistema e fornecer uma interface simplificada para o cliente interagir com ele.

## Vantagens
- `Simplicidade de Uso:` O Facade fornece uma interface simples e unificada que oculta a complexidade do subsistema, tornando mais fácil para o cliente interagir com ele.
- `Desacoplamento:` O Facade promove um baixo acoplamento entre o cliente e o subsistema, pois o cliente não precisa conhecer os detalhes internos do subsistema.
- `Encapsulamento:` O Facade encapsula a complexidade do subsistema, permitindo que ele seja modificado sem afetar o cliente.
- `Promove Boas Práticas de Design:` O uso do Facade pode promover um design claro e modular, facilitando a manutenção e extensão do código.

## Desvantagens
- `Restrição à Flexibilidade:` O Facade pode limitar a flexibilidade do cliente em acessar os componentes individuais do subsistema, pois ele só pode interagir por meio da interface fornecida pelo Facade.
- `Aumento do Acoplamento:` Se o Facade se tornar muito complexo e abranger muitos aspectos do subsistema, pode levar a um aumento do acoplamento entre o Facade e os componentes do subsistema.

## Quando usar?
O padrão Facade é útil em situações em que:
- Você deseja fornecer uma interface simples e unificada para um subsistema complexo.
- O cliente precisa interagir com múltiplos componentes do subsistema de forma transparente.
- Você deseja encapsular a complexidade do subsistema e promover um baixo acoplamento entre o cliente e os componentes do subsistema.