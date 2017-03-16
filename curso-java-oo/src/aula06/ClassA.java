package aula06;

import aula05.ClassB;

public class ClassA {

	//  criação de quatro atributos cada um com o seu tipo de visibilidade
	private String privado; // símbolo "-"
	protected String protegido; // símbolo "#"
	public String publico; // símbolo "+"
	String pacote; //atributo default símbolo "~"

	// criando assinatura do método
		public static void main(String[] args) {

			ClassA a = new ClassA();
			a.pacote = "pacote a ";
			a.protegido = "protegido a"; // tem duas regras a regra de pacote e a regra de herança
			a.publico = "publico a";
			a.privado = "privado a"; // o atributo privado da ClassA está visível, pois, pertence a essa classe


			ClassB b = new ClassB();
			b.publico = "publico b";


		}

}
