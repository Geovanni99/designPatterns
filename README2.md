# Padrões de Design
Repositorio para demostração de Padrões de Design

1. Padrões Criacionais
 
 ## Factory Method [Link](https://github.com/Geovanni99/designPatterns/tree/main/Observer)

  <ol>
 <li> <b>Objetivo</b>: Factory Method é um padrão de projeto de software (design pattern, em inglês) que permite às classes delegar para subclasses decidirem, isso é feito através da criação de objetos que chamam o método fabrica especificado numa interface e implementado por um classe filha ou implementado numa classe abstrata e opcionalmente sobrescrito por classes derivadas.
 </li>
 
  <li> <b>Motivacao</b>: . 
 </li>
 
  <li> <b>Aplicabilidade</b>: As situações de uso delas são:
 Quando a classe não antecipa a classe do objeto que quer criar;
 Uma classe quer suas subclasses para especificar os objetos que cria;
 Quando você não quer que o usuário tenha que saber de cada subclasse e;
 Encapsular a criação de objetos.
  <li> <b>Estrutura: </b><br />
  <img src="https://miro.medium.com/max/985/1*Fvyhz4KX0zSJB1ldvbnk3A.jpeg" >
 </li>
 
  <li> <b>Participantes</b>
   1.Client
   2.Creator
   3.IProduct
   4.ProductA
   5.ProductB
  </li>
 </ol>
 
 ## Abstract Factory
 
  <ol>
 <li> <b>Objetivo</b>: Ela tem como objetivo do padrão Abstract Factory é fornecer uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
 </li>
 
  <li> <b>Motivacao</b>: Um objeto que possua agregações deve permitir que seus elementos sejam acessados sem que a sua estrutura interna seja exposta. De uma maneira geral pode-se desejar que estes elementos sejam percorridos em várias ordens. Como garantir que objetos que dependem de outro objeto percebam as mudanças naquele objeto? Os observadores (observer) devem conhecer o objeto de interesse. O objeto de interesse (subject) deve notificar os observadores quando for atualizado. Os objetos devem interligar-se entre si de forma a que não se conheçam em tempo de compilação de forma a criar o acoplamento e desfazê-lo a qualquer momento em tempo de execução. Solucionar isso fornece uma implementação muito flexível de acoplamento de abstrações. 
 </li>
 
  <li> <b>Aplicabilidade</b>: O padrão Memento e aplicado quando o estado interno de um objeto deve ser salvo externamente para que o objeto possa ser restaurado a este estado posteriormente. O encapsulamento do objeto não deve ser violado.O problema é que um objeto bem projetado é encapsulado de forma que sua representação (estrutura de dados) fica oculta dentro do objeto e não pode ser acessada de fora do objeto.

 </li>
 
  <li> <b>Estrutura: </b>
  <img src="https://miro.medium.com/max/1268/0*p3XqL1afoWBhXEVO.jpg" >
 </li>
 
  <li> <b>Participantes</b>
   
  </li>
 </ol>
   
