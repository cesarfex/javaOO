package aula06;

import aula05.ClassB;

public class Aula extends ClassB{

	// criando assinatura do método
	public static void main(String[] args) {

		ClassA a = new ClassA(); // mesmo pacote aula06
		a.pacote = "pacote a ";
		a.protegido = "protegido a"; // tem duas regras a regra de pacote e a regra de herança, nesse caso a regra é visualizado por estar no mesmo pacote
		a.publico = "publico a";

		// o atributo privado da ClassA não está visível, somente dentro da ClassA

		ClassB b = new ClassB(); //[outro pacote aula05 só visualiza os atributos públicos] o fato de ter instanciado a ClassB não significa que há herança
		b.publico = "publico b";

		Aula aula = new Aula(); //[Aula do pacote aula06] - para usar herança tem que ser criado instancia de Aula
		aula.publico = "publico de ClassB";
		aula.protegido = "protegido de ClassB por herança"; // apesar de estar em pacotes diferentes, por herança têm-se acesso aos atributos protegidos

		// pacote somente é visível se estiver dentro do mesmo pacote
		/* o atributo privado não entra regra de herança e sim regras de visibilidade
		 o atributo privado da ClassB não está visível, somente dentro da ClassB*/

		ClassD d = new ClassD();
		d.metodoD();

	}

}
