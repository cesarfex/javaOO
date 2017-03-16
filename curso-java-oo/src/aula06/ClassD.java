package aula06;

/*modificador de acesso é a mesma coisa que visibilidade
classe da assinatura do arquivo que é a primeira classe criada só pode ter ela como com visibilidade "default" ou "public" , ou seja,
não pode possuir a visibilidade "private" ou "proteted"*/

class ClassD { // classe default ou classe de pacote, somente será acessível se estiver dentro do mesmo pacote

	public void metodoD(){

		// dentro da classe de assinatura ou primeira classe podemos criar outras classes chamadas de "classes internas"

		// classes internas criada dentro da classe de assinatura
		private class A{}

		public class B{}

		protected class C{}

		class D{}


}
