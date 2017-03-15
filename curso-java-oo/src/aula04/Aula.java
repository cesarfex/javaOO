package aula04;

public class Aula {

	//variáveis de instância
	int x = 1;
	String y = "Olá";
	String z = "Mundo!";

	// método principal com retorno "void"

	public static void main(String[] args){

		// instância da classe aula (criando objeto do tipo aula)
		Aula a = new Aula();
		int x2 = a.x +2; //variável local criada dentro do método

		System.out.println("Valor de x: " + a.x); //usando instância da classe para ter acesso ao valor da variável x
		System.out.println("Valor de x2: " + x2);
		System.out.println(a.y + " " + a.z);

 	}
}
