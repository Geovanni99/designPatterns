# Padrões de Design
Repositorio para demostração de Padrões de Design

1. Padrões Comportamentais
 
 ## Observer [Link](https://github.com/Geovanni99/designPatterns/tree/main/Observer)

  <ol>
 <li> <b>Objetivo</b>: Observer é um padrão de projeto de software que define uma dependência um-para-muitos entre objetos de modo que quando um objeto muda o estado, todos seus dependentes são notificados e atualizados automaticamente. Permite que objetos interessados sejam avisados da mudança de estado ou outros eventos ocorrendo num outro objeto.
 </li>
 
  <li> <b>Motivacao</b>: Um objeto que possua agregações deve permitir que seus elementos sejam acessados sem que a sua estrutura interna seja exposta. De uma maneira geral pode-se desejar que estes elementos sejam percorridos em várias ordens. Como garantir que objetos que dependem de outro objeto percebam as mudanças naquele objeto? Os observadores (observer) devem conhecer o objeto de interesse. O objeto de interesse (subject) deve notificar os observadores quando for atualizado. Os objetos devem interligar-se entre si de forma a que não se conheçam em tempo de compilação de forma a criar o acoplamento e desfazê-lo a qualquer momento em tempo de execução. Solucionar isso fornece uma implementação muito flexível de acoplamento de abstrações. 
 </li>
 
  <li> <b>Aplicabilidade</b>: O padrão Observer pode ser usado quando uma abstração tem dois aspectos, um dependente do outro. Encapsular tais aspectos em objetos separados permite que variem e sejam reusados separadamente. Quando uma mudança a um objeto requer mudanças a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos. Em outras palavras, sem criar um acoplamento forte entre os objetos. 
 </li>
 
  <li> <b>Estrutura: </b><br />
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/750px-Observer.svg.png" >
 </li>
 
  <li> <b>Participantes</b>
   Subject, Observer, ConcreteObserverA, ConcreteObserverB
  </li>
 </ol>
 
 ## Memento [link](https://github.com/Geovanni99/designPatterns/tree/main/Memento)
 
  <ol>
 <li> <b>Objetivo</b>: é um padrão de projeto de software documentado como um padrão comportamental. Ele permite armazenar o estado interno de um objeto em um determinando momento, para que seja possível retorná-lo a este estado, sem que isso cause problemas com o encapsulamento.[1]
Ele funciona de maneira que uma classe é responsável por salvar o estado do objeto desejado enquanto que uma outra classe fica responsável por armazenar todas essas copias (mementos). 
 </li>
 
  <li> <b>Motivacao</b>: Tornar um objeto (originador) responsável por A)salvar seu estado interno para um objeto (memento) e restaurando a um estado anterior de um objeto (memento) e B) Apenas o originador que criou um memento tem permissão para acessá-lo. Um cliente (zelador) pode solicitar um memento do originador (para salvar o estado interno do originador) e passar um memento de volta ao originador (para restaurar a um estado anterior).
Isso permite salvar e restaurar o estado interno de um originador sem violar seu encapsulamento. 
 </li>
 
  <li> <b>Aplicabilidade</b>: O padrão Memento e aplicado quando o estado interno de um objeto deve ser salvo externamente para que o objeto possa ser restaurado a este estado posteriormente. O encapsulamento do objeto não deve ser violado.O problema é que um objeto bem projetado é encapsulado de forma que sua representação (estrutura de dados) fica oculta dentro do objeto e não pode ser acessada de fora do objeto.

 </li>
 
  <li> <b>Estrutura: </b> <br />
  <img src="https://upload.wikimedia.org/wikipedia/commons/3/38/W3sDesign_Memento_Design_Pattern_UML.jpg" >
 </li>
 
  <li> <b>Participantes</b>
   Originator, CareTaker, Memento
  </li>
 </ol>
 
  
