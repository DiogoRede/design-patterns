# Singleton
O Singleton é um padrão de projeto criacional que permite garantir que uma classe tenha apenas uma instância, enquanto fornece um ponto de acesso global para essa instância.

## Vantagens
- `Economia de Recursos:` Evita a criação repetida de instâncias da mesma classe, economizando recursos do sistema.

- `Controle de Acesso Único:` Garante que apenas uma instância da classe seja criada e fornece um ponto global de acesso a essa instância.

- `Globalmente Acessível:` Facilita o acesso à instância única de qualquer parte da aplicação.

- `Facilidade de Manutenção:` Promove um design claro e simples, facilitando a manutenção e compreensão do código.

## Desvantagens
- `Dificuldade de Teste:` Pode ser difícil testar unidades isoladamente devido ao acoplamento com a instância única.

- `Acoplamento Forte:` O Singleton pode introduzir um acoplamento forte entre as partes da aplicação, dificultando a flexibilidade e manutenção do código.

- `Ponto de Falha Única:` Uma falha na instância única pode afetar todo o sistema.

- `Responsabilidade Única:` Pode violar o princípio de responsabilidade única, tornando a classe Singleton responsável por mais do que apenas controlar sua própria instância.

## Quando usar?
Quando você tem um conjunto de configurações globais que devem ser acessadas por várias partes da aplicação, como configurações de banco de dados, configurações de conexão de rede, etc.

Em aplicativos que interagem com recursos externos, como bancos de dados ou serviços da web, onde é desejável ter uma única conexão para otimizar o uso de recursos.

Para manter um estado global, como a sessão do usuário em um aplicativo da web, onde é importante que todas as partes do sistema acessem o mesmo estado.