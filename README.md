# Clean Architecture

## Overview
1. **Entity** Layer - Baixa probabilidade de mudança
2. **Use Case** Layer
3. **Interface Adapters** Layer
4. **Frameworks/Driver/Libs** Layer - Alto probabilidade de mudança


* Domain Layer
* Application Layer
* Adaptters Layer 

# Regras de Dependência
As camadas mais externas dependem das camadas mais internas

As camadas mais internas referenciam as camadas mais externas atraves de interfaces

Começe das Camadas mais internas

## Entity Layer
Deve-se começar com a camada de Domínio 
- Regra de negócio da Empresa
    - São classe que só existem por causa das Regras do Negócio da Empresa
 `As entidades das Regras de negócio da Empresa existem independentemente da existência do software`

 Nota: As classes só podem depender de classes da mesma camada

- Exemplo de Domínio:
    - Escola:
        - Tipos:
            - Aluno | Professor | Classe | Curso
        - Regra de negócio da Empresa:
            - Regras de inscrição de uma Aluno em um Curso
            - Cronograma do Curso

## Use Case Layer
Regra de negócio da Aplicação
- Regra/Lógica que foi usada na automatização da tarefa anteriormente realizadas manuamente antes da existência do Software 
    - Tarefas feitas antes por pessoas passam a ser feitas pelo Software




Camada de Domínio 
                (Objetos do Domínio só dependem de Objetos do Domínio)
    Participante
        > Regras do Negócio
            > Um Participante terá:
                > Um nome
                > Um email
                > Uma pontuação
    Sorteio
        > Regras do Negócio
            > Adicionar um Participante ao Sorteio
                > Um Participante só poderá participar do Sorteio se atingir a pontuação mínima do Sorteio  
            > Sortear um Participante
                > Dado um coleção de Participantes cadastrados no Sorteio escolha um aleatoriamente
                > O Participante sorteado não poderá participar novamente deste Sorteado

Camada de Aplicação 
                    (Manipula os Objetos do Domínio)
                    (Objetos do Aplicação dependem de Objetos do Aplicação e de Objetos do Domínio)
    Criar um Sorteio
        > Regras da Applicação
            > Criar um Sorteio infornado a sua pontuação mínima
    Adicionar um Participante no Sorteio
         > Regras da Applicação
            > Busque por todos os Participantes cadastrados em uma 'Repostitório de Participantes'
            > Para cada Partipante retornado adicione-o ao Sorteio
    Escolhar X ganhadores do Sorteio
        > Regras da Applicação
            > Escolho X ganhadores para o dado Sorteio
    Declare um Repostitório de Participantes
        > Cria uma interface para um Repostitório de Participantes

Camada Interface Adapters
    > Repostitório de Participantes CSV 
        > Implementa a interface de Repostitório de Participantes
            > Busca os dados dos Participante de um arquivo CSV
                > Para cada registro crie um Participante usando os dados no formato csv
    > Repostitório de Participantes JSON
        > Implementa a interface de Repostitório de Participantes
            > Busca os dados dos Participante de um arquivo JSON
                > Para cada registro crie um Participante usando os dados no formato json

Nota: As Entidades só dependem delas mesmas        
Nota: Os Casos de Uso dependem das Entidades


Lógica de Domínio (Essa regras são aplicadas a todas as outras camadas)
    - Validação de Dados (Classes sem estado tendo a lpogica da vailidação)
        - Número máximo caracteres que o mome do usuário deve ter (Regra de Negócio)
        - Número máximo de itens na cesta de compras (Regra de Negócio)
        - Comentário de cliente não deve ter mais de 100 caracteres,
        - Comentário resposnta feitos por administrador pode ir até 1000 caracteres

Lógica de Apresentação (O que renderizar, como renderizar)
    - Cor/Tamanho/Formato do Texto
    - Quanto tempo ficará visível na Tela
    - Layout dos Componentes Visuais
    - Quais erros devem ser monstrados
        - O erro deve ser exibido como um pop-up/label/tooltip?