package aula05;

import aula06.ClassD;

public class ClassB {

	//  criação de quatro atributos cada um com o seu tipo de visibilidade
	private String privado; // símbolo "-"
	protected String protegido; // símbolo "#"
	public String publico; // símbolo "+"
	String pacote; //atributo default símbolo "~"


	public static void main(String[] args) {

		ClassD d = new ClassD(); // ClassD(tipo default) está em outro pacote aula06, por isso não é possível visualizar
	}
}
