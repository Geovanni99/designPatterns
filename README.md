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
 
 ## Strategy [link](https://github.com/Geovanni99/designPatterns/tree/main/Strategy)
 
  <ol>
 <li> <b>Objetivo</b>:E um padrão de design documentado no Catálogo GOF (Gang of Four), sendo categorizado como um padrão comportamental de desenvolvimento de software.  De modo que delega as responsabilidades adquiridas pelas entidades, atribuindo, portanto, o comportamento. Assim a comunicação entre os objetos é aprimorada, pois há a distribuição das responsabilidades. O objetivo é representar uma operação a ser realizada sobre os elementos de uma estrutura de objetos.[1] O padrão Strategy permite definir novas operações sem alterar as classes dos elementos sobre os quais opera. Segundo o catálogo GOF o padrão tem como meta: "Definir uma família de algoritmos, encapsular cada uma delas e torná-las intercambiáveis. Strategy permite que o algoritmo varie independentemente dos clientes que o utilizam
 </li>
 
  <li> <b>Motivacao</b>: O maior incentivo para uso do padrão é a melhoria da manutenção do código o qual é frequentemente usado durante o desenvolvimento de uma aplicação. Para tanto, há a necessidade de definir um conjunto de classes para que possam ser alteradas em tempo de execução. Assim os objetos trabalham de forma independente para os possíveis clientes realizarem operações diferentes, sem a dependência de implementação do comportamento de outra classe. 
 </li>
 
  <li> <b>Aplicabilidade</b>: O padrão é aplicado em situações em que muitas classes se relacionam e diferem apenas no modo de atuação, com isso o Strategy irá configurar a classe que tenha um dentre muitos comportamentos fornecidos. Também pode ser usado quando há a necessidade da variação de um algoritmo, ou seja, pode-se implementar diferentes códigos que chegam no mesmo objetivo, mas que possuem em determinadas situações mais vantagens do que os demais. Outra situação oportuna para o uso do padrão é em uma aplicação na qual se tem um cliente e este não pode ficar exposto a estrutura de dados do algoritmo. Além disso, quando uma classe tem muitos comportamentos e usam vários comandos condicionais, o desempenho do algoritmo poderá ficar insatisfatório, pois há a possibilidade de existir uma quantidade grande de condições, podendo deixar o código mais lento. Com o padrão pode-se retirar as condições, criando novas classes com estas estratégias, portanto melhorando desempenho.  

 </li>
 
  <li> <b>Estrutura: </b> <br />
  <img src="https://robsoncastilho.files.wordpress.com/2011/04/strategy.gif?w=426&zoom=2" >
 </li>
 
  <li> <b>Participantes</b>
   Contexto, Strategy, Strategy Implementations
  </li>
 </ol>
 
  
