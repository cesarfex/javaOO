package aula05;

public class Aula {

	public static void main(String[]args){

	/*existem diferenças entre tipos primitivos e tipos de objetos
	 * int versus Integer
	 * char versus Character
	 * byte versus Byte
	 * boolean versus Boolean
	 * long versus Long
	 * float versus Float
	 * double versus Double
	 * short versus Short
	 * */

		int a = 1;

		// formas diferentes de declarar valor para o objeto do tipo Integer
		Integer a1 = 2;
		Integer a2 = new Integer(4); // a1. ou a2. exibirão os métodos do objetos instanciados

		int a3 = new int(5); //não é possível criar instância de um tipo primitivo, somente será permitido para o tipo objeto


		// formas diferents de atribuições de variavéis
		byte b = 5; // tipo primitivo
		Byte b1 = new Byte(b); // tipo objeto atribuinte o tipo primitivo byte
		Byte b2 = new Byte("60");
		Byte b3 = 40;


		// conversão automática "autoboxing" que transforma valor primitivo para objeto a partir da vesão 5 do Java
		int c = 4;
		Internet c1 = c;
		int c2 = c1;

		// valores máximos e mínimos é permitido atribuir sempre o maior para o menor e não o contrário
		/*existem diferenças entre tipos primitivos e tipos de objetos
		 * 1ºbyte
		 * 2ºshort
		 * 3ºint
		 * 4ºlong
		 * 5ºfloat
		 * 6ºdouble
		 * */
		int d = b;
		short d1 = d; // não é possível converter int para short
		int d2 = d1; //note que do int(maior) para short(menor) é possível

		// na soma entre a(int) + b(long) o resultao será sempre o maior tipo entre os valores sendo somados, no caso um long

	}

}
