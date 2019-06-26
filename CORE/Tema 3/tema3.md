OVERLOAD

Overload, significa "sobrecarga". A sobrecarga de métodos consiste em declarar vários métodos com o mesmo nome, em uma única classe ou em classes descendentes, porém eles devem ter assinaturas diferentes. A assinatura do método é o escopo do método identificado pelo seu retorno, pelo seu nome, bem como o recebimento ou não de seus parâmetros. Exemplo:

   public class Teste {

	public void toTest(){

	      System.out.println("Este método não possui parâmetros");

	}
	
	public void toTest(String mensagem) {

	      System.out.println(mensagem);
	}
   }

Os métodos pertencentes da classe Teste possuem o mesmo nome, porém eles serão identificados no momento de serem chamados, pela sua assinatura, ou seja a passagem de parâmetros ou não passagem de parâmetros.

OVERRIDE 

Override, significa "sobrescrita”. A sobrescrita só é possível em classes herdadas, porque este conceito significa o que o próprio nome já diz, ou seja, substituir um método da super classe na sub-classe sobrescrevendo o mesmo. 
A sintaxe “@Override” é uma diretiva de compilação, que orienta o compilador que as linhas abaixo de sua declaração contém um método igual da super classe que deverá ser substituído.
Exemplo:

   public class Teste {
	public void toTest() {
	      System.out.println("Este é o método da super classe");
	} 
   }

   public class NovoTeste extends Teste {
 	@Override
      	public void toTest() {
 	      System.out.println("Este é o método foi sobrescrito");
   	}
   }

Na sub-classe NovoTeste  o método toTest() da super classe está sendo substituido, isto porque, se eu não o sobrescrevesse, ele iria herdar o método toTest() da super classe, e neste caso ele começa a ter o método com o mesmo nome e mesma assinatura só que com implementação nova na sub-classe.

