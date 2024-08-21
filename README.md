# 👨‍💻 Projeto de Simulação de Processo Seletivo em Java

Este projeto é uma simulação simples de um processo seletivo desenvolvido na linguagem Java, utilizando a versão 22 do Java. O código simula a interação com candidatos, verificando se conseguem ser contatados e se suas expectativas salariais são compatíveis com as oferecidas pela vaga.

Este projeto foi desenvolvido no curso ministrado pelo expert Gleyson Sampaio na trilha de Java Básico na plataforma [DIO](https://www.dio.me/).


## 💻 Tecnologia utilizada no projeto:
<div>
   <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white">
</div>


## 📂 Estrutura do Projeto

O projeto contém o seguinte arquivo:

- **ProcessoSeletivo.java**: Arquivo principal que contém a lógica para simulação do processo seletivo, incluindo contato com candidatos, análise salarial e seleção.


## 💻 Funcionamento

### ProcessoSeletivo.java

O arquivo `ProcessoSeletivo.java` realiza as seguintes etapas:

1. **Processo Seletivo**: O programa imprime uma mensagem indicando o início do processo seletivo e define um array de candidatos.

2. **Entrando em Contato**: Para cada candidato, o programa tenta entrar em contato até três vezes, usando o método `entrandoEmContato`. A tentativa de contato é simulada pela função `atender`, que retorna um valor booleano aleatório.

3. **Seleção de Candidatos**: O método `selecaoCandidatos` realiza a seleção de candidatos com base em um valor de salário pretendido, que é gerado aleatoriamente. Apenas os candidatos que solicitam um valor dentro do limite do salário base são selecionados.

4. **Análise Salarial**: O método `analisarCandidato` compara o salário pretendido com o salário base, decidindo se o candidato deve ser contatado, receber uma contra proposta, ou ser mantido em espera.

5. **Impressão dos Candidatos Selecionados**: O método `imprimirSelecionados` exibe a lista de candidatos selecionados, mostrando o índice e nome de cada um.


## 👨‍🔧 Como Executar

1. Abra o projeto na IDE Eclipse.

2. Execute o arquivo `ProcessoSeletivo.java`.

3. O programa irá automaticamente simular o processo seletivo, tentando entrar em contato com cada candidato, analisando suas expectativas salariais e exibindo o resultado de cada etapa.

## 👨‍🏫 Exemplo de Uso

Durante a execução, o programa exibe mensagens indicando:

- Tentativas de contato com cada candidato.
- Resultado da tentativa de contato.
- Salário pretendido por cada candidato e se ele foi selecionado para a vaga.

Exemplo de saída para um candidato:
```sh
   Processo Seletivo
   Entrando em contato com Marcos...
   O(A) candidato(a) Marcos solicitou este valor de salário: R$ 1950.0
   O(A) candidato(a) Marcos foi selecionado(a) para a vaga.
```


## ☕ Versão do Java

Este projeto utiliza a versão 22 do Java.

## 📝 Requisitos

- **Java 22** ou superior.
- **IDE Eclipse** (opcional, mas recomendada para fácil navegação e execução).

## 👨‍💻 Expert

<p>
    <img 
      align=left 
      margin=10 
      width=80 
      src="https://avatars.githubusercontent.com/u/44624583?v=4"
    />
    <p>&nbsp&nbsp&nbspMarcos Winther<br>
    &nbsp&nbsp&nbsp
    <a href="https://github.com/MarcosWinther">
    GitHub</a>&nbsp;|&nbsp;
    <a href="https://www.linkedin.com/in/marcoswinthersilva/">LinkedIn</a>
    </p>
</p>
<br/><br/>

---

⌨️ com 💜 por [Marcos Winther](https://github.com/MarcosWinther)
