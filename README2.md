# Padrões de Design
Repositorio para demostração de Padrões de Software

1. Padrões Criacionais
 
 ## Factory Method [Link](https://github.com/Geovanni99/designPatterns/tree/main/Observer)

  <ol>
 <li> <b>Objetivo</b>: Factory Method é um padrão de projeto de software (design pattern, em inglês) que permite às classes delegar para subclasses decidirem, isso é feito através da criação de objetos que chamam o método fabrica especificado numa interface e implementado por um classe filha ou implementado numa classe abstrata e opcionalmente sobrescrito por classes derivadas.
 </li>
 
  <li> <b>Motivacao</b>:A vantagem do Factory Method é que este padrão pode retornar uma mesma instância múltiplas vezes, ou pode retornar a subclasse invés de um objeto daquele tipo exato e frequentemente , designs começam pelo Factory Method (menos complicado, mais customizável, subclasses proliferam) e evoluem para Abstract Fatory,Prototype ou Builder (mais flexível, mais complexo) enquanto o desenvolvedor descobre onde a flexibilidade é mais necessária. 
 </li>
 
  <li> <b>Aplicabilidade</b>: As situações de uso dela são:
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
 
 ## Abstract Factory [Link](https://github.com/Geovanni99/designPatterns/tree/main/Observer)
 
  <ol>
 <li> <b>Objetivo</b>: Ela tem como objetivo do padrão Abstract Factory é fornecer uma interface para criar famílias de objetos relacionados ou dependentes sem especificar suas classes concretas.
 </li>
 
  <li> <b>Motivação</b>: Para facilitar a alteração da aparência e do comportamento futuramente, defina uma classe abstrata GUIFactory que declara uma interface para cirar cada tipo de widget básico.
 </li>
 
  <li> <b>Aplicabilidade</b>: A fábrica determina o tipo concreto do objeto a ser criado, e é nela que o objeto é realmente criado. No entanto, a fábrica só retorna um ponteiro abstrato para o objeto concreto criado.
O código do cliente não tem conhecimento algum do tipo concreto. Objetos concretos são, de fato criados pela fábrica, mas o código do cliente acessa tais objetos só através da sua interface abstrata.
A adição de novos tipos concretos é feita modificando o código do cliente para usar uma fábrica diferente, uma modificação que é tipicamente uma linha em um arquivo. A nova fábrica, em seguida, cria objetos de um tipo de concreto diferente, mas ainda retorna um ponteiro do mesmo tipo abstrato como antes. Isto é significativamente mais fácil do que modificar o código de cliente para instanciar um novo tipo. Se todos os objetos de fábrica são armazenados globalmente em um objeto Singleton, e todo o código do cliente passa pelo Singleton para acessar a fábrica adequada para a criação do objeto, então alterar as fábricas se torna tão fácil como mudar o objeto Singleton.
 </li>
 
  <li> <b>Estrutura: </b> <img src="https://miro.medium.com/max/1268/0*p3XqL1afoWBhXEVO.jpg" >
 </li>
 
  <li> <b>Participantes</b>
   1.Client
   2.Creator
   3.IProduct
   4.ProductA
   5.ProductB
  </li>
 </ol>
   
