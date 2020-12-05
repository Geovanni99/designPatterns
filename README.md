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
 
  <li> <b>Estrutura: </b>
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/750px-Observer.svg.png" >
 </li>
 
  <li> <b>Participantes</b>
   
  </li>
 </ol>
 
 ## Memento [link]()
 
  <ol>
 <li> <b>Objetivo</b>: é um padrão de projeto de software documentado no Catálogo Gang of Four, sendo considerado como um padrão comportamental. Ele permite armazenar o estado interno de um objeto em um determinando momento, para que seja possível retorná-lo a este estado, sem que isso cause problemas com o encapsulamento.[1]
Ele funciona de maneira que uma classe é responsável por salvar o estado do objeto desejado enquanto que uma outra classe fica responsável por armazenar todas essas copias (mementos). 
 </li>
 
  <li> <b>Motivacao</b>: Um objeto que possua agregações deve permitir que seus elementos sejam acessados sem que a sua estrutura interna seja exposta. De uma maneira geral pode-se desejar que estes elementos sejam percorridos em várias ordens. Como garantir que objetos que dependem de outro objeto percebam as mudanças naquele objeto? Os observadores (observer) devem conhecer o objeto de interesse. O objeto de interesse (subject) deve notificar os observadores quando for atualizado. Os objetos devem interligar-se entre si de forma a que não se conheçam em tempo de compilação de forma a criar o acoplamento e desfazê-lo a qualquer momento em tempo de execução. Solucionar isso fornece uma implementação muito flexível de acoplamento de abstrações. 
 </li>
 
  <li> <b>Aplicabilidade</b>: O padrão Observer pode ser usado quando uma abstração tem dois aspectos, um dependente do outro. Encapsular tais aspectos em objetos separados permite que variem e sejam reusados separadamente. Quando uma mudança a um objeto requer mudanças a outros e você não sabe quantos outros objetos devem mudar ou quando um objeto deve ser capaz de avisar outros sem fazer suposições sobre quem são os objetos. Em outras palavras, sem criar um acoplamento forte entre os objetos. 
 </li>
 
  <li> <b>Estrutura: </b>
  <img src="https://upload.wikimedia.org/wikipedia/commons/thumb/8/8d/Observer.svg/750px-Observer.svg.png" >
 </li>
 
  <li> <b>Participantes</b>
   
  </li>
 </ol>
 
 ## Strategy
  
