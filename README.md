# Boas Práticas e Controle de Versão

## Respostas da Atividade

1. **Qual era o principal problema do código original?**
O código possuía variáveis com nomes genéricos e sem significado (`n`, `a`, `b`, `c`), além de conter todas as instruções concentradas no método `main`, falta de indentação adequada e chaves de bloco mal posicionadas/com erro de sintaxe.

2. **Quais melhorias você realizou?**
* Renomeação de variáveis para nomes descritivos (`nomeAluno`, `nota1`, `nota2`, `media`).
* Modularização das responsabilidades em métodos estáticos (`calcularMedia`, `verificarSituacao` e `exibirResultado`).
* Correção da sintaxe dos blocos condicionais e alinhamento da indentação.

3. **Como a modularização facilitou a organização do código?**
A modularização isolou cada regra de negócio em seu próprio escopo. O método `main` passou a apenas orquestrar a execução, permitindo alterar a lógica de cálculo ou exibição sem impactar as demais partes.

4. **Como o Git ajudou a controlar as alterações realizadas no sistema?**
O Git possibilitou registrar o estado original em uma branch estável (`main`), desenvolver e isolar as refatorações na branch `melhoria-boas-praticas`, rastrear o histórico detalhado dos commits e integrar as mudanças via Pull Request de forma controlada.