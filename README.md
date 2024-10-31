# Pesquisa de Opinião sobre Atendimento - TudoWeb

Este projeto é um programa em Java desenvolvido para a empresa de marketing TudoWeb, com o objetivo de realizar uma pesquisa de opinião com seus clientes sobre o grau de satisfação no atendimento recebido. A pesquisa coleta a opinião de 50 clientes e fornece uma contagem do número de avaliações "EXCELENTE" e "RUIM".

## Funcionalidades

O programa realiza as seguintes operações:
1. **Coleta de dados**: Para cada entrevistado, o programa solicita o nome, a idade e a opinião sobre o atendimento, com as seguintes opções:
   - **1** - EXCELENTE
   - **2** - BOM
   - **3** - RUIM
2. **Contabilização das respostas**: O programa conta o total de respostas "EXCELENTE" e "RUIM".
3. **Exibição dos resultados**: Após as respostas dos 50 entrevistados, o programa exibe o total de respostas para "EXCELENTE" e "RUIM".

## Exemplo de Execução

```shell
Entrevistado 1
Digite o nome: Maria
Digite a idade: 30
Qual sua opiniao sobre o atendimento? (1-EXCELENTE, 2-BOM, 3-RUIM): 1

Entrevistado 2
Digite o nome: João
Digite a idade: 45
Qual sua opiniao sobre o atendimento? (1-EXCELENTE, 2-BOM, 3-RUIM): 3

...

Resultados da Pesquisa:
Quantidade de respostas 'EXCELENTE': 15
Quantidade de respostas 'RUIM': 8
```

## Estrutura do Projeto

O projeto é composto por um único arquivo Java:

- **PesquisaAtendimento.java**: Este arquivo contém a lógica de coleta de dados, estrutura de repetição `FOR` para realizar a pesquisa com 50 entrevistados e lógica condicional para contabilizar as respostas.

## Como Executar

1. Certifique-se de que o [Java JDK](https://www.oracle.com/java/technologies/javase-downloads.html) está instalado em seu ambiente.
2. Clone este repositório:

   ```shell
   git clone https://github.com/seu_usuario/PesquisaAtendimento.git
   ```

3. Navegue até o diretório do projeto:

   ```shell
   cd PesquisaAtendimento
   ```

4. Compile o arquivo Java:

   ```shell
   javac PesquisaAtendimento.java
   ```

5. Execute o programa:

   ```shell
   java PesquisaAtendimento
   ```

## Estrutura do Código

O código utiliza a estrutura de repetição `FOR` para realizar a pesquisa com um número fixo de entrevistados (50), e a estrutura condicional `if` para verificar as respostas e atualizar as contagens. Cada etapa do processo é comentada para facilitar a compreensão.

## Critérios de Avaliação

Este projeto atende aos seguintes critérios:
- **Estrutura organizada**: uso de estrutura de repetição e condicional para processar respostas e exibir resultados.
- **Aplicação dos conceitos de controle de fluxo**: `FOR` e `if` foram utilizados para coletar dados e categorizar respostas.
- **Clareza e simplicidade**: permite fácil entendimento e modificação do código.

## Autor

Desenvolvido por [@beatrisAS](https://github.com/beatrisAS).
