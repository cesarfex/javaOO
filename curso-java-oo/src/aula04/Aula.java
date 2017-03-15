package aula04;

public class Aula {

	//variáveis de instância
	int x = 1;
	String y = "Olá";
	String z = "Mundo!";


	/*todo método criado deve ser definido um tipo de retorno
	no exemplo abaixo é criado método com retorno do tipo "void" que é um método de retorno vazio*/

	//método de instância não estático
	void soma (int a, int b){
		int soma = a + b;
		System.out.println("O resultado da soma é " + soma);
	}

	/*todo método criado deve ser definido um tipo de retorno
	no exemplo abaixo é criado método com retorno do tipo "return" que é um método de retorno do tipo int*/

	int subtracao (int a, int b) {
		return a - b;

	}

	// método principal com retorno "void"
	public static void main(String[] args){

		// instância da classe aula (criando objeto do tipo aula)
		Aula a = new Aula();
		int x2 = a.x +2; //variável local criada dentro do método

		System.out.println("Valor de x: " + a.x); //usando instância da classe para ter acesso ao valor da variável x
		System.out.println("Valor de x2: " + x2);
		System.out.println(a.y + " " + a.z); // resultado da concatenação de string

		int sub = a.subtracao(12, 343);
		System.out.println("O resultado da subtração: " + sub);

		a.soma (2, 5);
 	}
}
