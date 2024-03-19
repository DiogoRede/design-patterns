# Observer Pattern

O padrão Observer é um padrão de projeto comportamental que define uma dependência um-para-muitos entre objetos, de modo que quando um objeto (o "subject") muda de estado, todos os seus dependentes (os "observers") são notificados e atualizados automaticamente. Isso promove o desacoplamento entre os objetos, permitindo que eles permaneçam flexíveis e reutilizáveis.

## Vantagens
- `Desacoplamento Forte:` O padrão Observer permite que o subject e os observers operem independentemente um do outro, promovendo um baixo acoplamento entre eles.
- `Mudanças Dinâmicas:` Os observers podem ser adicionados ou removidos do subject de forma dinâmica, permitindo uma fácil extensibilidade do sistema.
- `Reutilização de Código:` Os observers podem ser reutilizados em diferentes contextos, já que são independentes do subject.
- `Separação de Responsabilidades:` O subject é responsável apenas por gerenciar a lista de observers e notificá-los sobre mudanças de estado, enquanto os observers são responsáveis por reagir a essas mudanças de estado de acordo com suas próprias lógicas.

## Desvantagens
- `Potencial para Vazamentos de Memória:` Se os observers não forem removidos corretamente do subject quando não forem mais necessários, pode ocorrer vazamento de memória.
- `Notificações Indesejadas:` Todos os observers registrados serão notificados sempre que ocorrer uma mudança de estado, mesmo que não estejam interessados nessa mudança.

## Quando usar?
O padrão Observer é útil em situações em que:
- Um objeto precisa notificar outros objetos sobre mudanças em seu estado e esses objetos podem ser de tipos diferentes ou desconhecidos antecipadamente.
- Há uma dependência um-para-muitos entre objetos, onde vários objetos precisam ser atualizados quando ocorrem mudanças em um objeto específico.
- É necessária uma separação clara entre a lógica de negócios e a lógica de visualização, permitindo que as partes do sistema permaneçam independentes.

## Referencias que tive:
- [Trabalhando com o Pattern Observer na Plataforma Java EE](https://www.devmedia.com.br/trabalhando-com-o-pattern-observer-na-plataforma-java-ee/33149)