# Princípios SOLID 🧱

O SOLID é um conjunto de princípios de design de software que visam criar código robusto, flexível e de fácil manutenção. Esses princípios ajudam a melhorar a estrutura e a qualidade do código, promovendo a coesão, o baixo acoplamento e a extensibilidade.


## ✨ 1. SRP - Princípio da Responsabilidade Única ✨
Uma classe deve ter apenas uma única responsabilidade. Isso melhora a coesão e facilita a manutenção do código.


No projeto em questão, o SRP foi aplicado ao refatorar a classe Livro em duas classes distintas: RegistroLivro e ExibidorInformacoesLivro. A classe RegistroLivro é responsável exclusivamente pelo registro dos livros, enquanto a classe ExibidorInformacoesLivro lida com a exibição das informações de um livro. Essa separação de responsabilidades melhora a coesão do código e facilita a manutenção e a extensibilidade no futuro.


Exercicio original: https://github.com/thaisbbreder-zup/RevisaoPOO/tree/master/src/Ex_02_Biblioteca

## ✨ 2. OCP - Princípio Aberto-Fechado ✨
As entidades de software devem estar abertas para extensão, mas fechadas para modificação. O comportamento de uma classe deve ser estendido sem alterar seu código existente.


No exemplo fornecido, a classe FolhaDePagamento demonstra o OCP ao receber uma lista de objetos do tipo Remuneravel, que é uma interface. Isso permite que novas classes sejam criadas e implementem a interface Remuneravel para serem processadas pela FolhaDePagamento. Dessa forma, é possível adicionar novos tipos de funcionários à lista sem modificar a classe FolhaDePagamento ou outras classes existentes.

## ✨ 3. LSP - Princípio da Substituição de Liskov ✨
Objetos de uma classe derivada devem poder ser substituídos por objetos de sua classe base sem quebrar a integridade do programa. Classes derivadas devem manter o comportamento esperado.

No contexto do código fornecido, as classes MotorCar e ElectricCar substituem corretamente a interface Car, mantendo o comportamento esperado para o método accelerate(). Isso significa que podemos tratar objetos das classes MotorCar e ElectricCar como objetos do tipo Car, sem causar problemas na funcionalidade do programa.

## ✨ 4. ISP - Princípio da Segregação de Interfaces ✨
Uma classe não deve ser forçada a depender de interfaces que não utiliza por completo. Interfaces devem ser coesas e responsáveis por uma única funcionalidade.


No exemplo apresentado, o ISP é demonstrado ao dividir a interface Imprimivel em duas interfaces distintas: Imprimivel e Digitalizavel. Anteriormente, a classe Scanner era forçada a implementar o método imprimir(), mesmo que essa funcionalidade não fosse relevante para um scanner. Ao separar a interface em duas, cada classe implementa apenas a interface que é relevante para ela, evitando a implementação de métodos não utilizados. Isso torna as interfaces mais coesas e segue o Princípio da Segregação de Interfaces.

## ✨ 5. DIP - Princípio da Inversão de Dependência ✨
Módulos de alto nível não devem depender de módulos de baixo nível, ambos devem depender de abstrações. Detalhes devem depender de abstrações. Isso promove baixo acoplamento e facilidade na extensão e manutenção do código. 


No exemplo dado, a classe Carro depende da abstração Engine, representada pela interface Engine. As implementações concretas MotorGasolina e MotorDiesel implementam a interface Engine, fornecendo a funcionalidade específica para ligar e desligar o motor. Dessa forma, a classe Carro pode ser facilmente modificada para funcionar com qualquer tipo de motor que implemente a interface Engine, sem a necessidade de modificar a própria classe Carro. Isso mantém o baixo acoplamento e facilita a manutenção e a extensibilidade do código, seguindo o Princípio da Inversão de Dependência.
