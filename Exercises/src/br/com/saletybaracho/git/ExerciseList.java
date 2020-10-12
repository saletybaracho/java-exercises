/**
 * 
 */
package br.com.saletybaracho.git;

/**Classe principal para executar os exerc�cios de Java de acordo com os valores passados como par�metro. <br /> <br />
 * 
 * Exemplos: <br /> <br />
 * 
 * &nbsp;&nbsp;&nbsp; Input: 1 - Output: Exerc�cio 1 - Votos em rela��o ao n�mero de eleitores de acordo com a tabela do primeiro exerc�cio. <br />
 * &nbsp;&nbsp;&nbsp; Input: 2 - Output: Exerc�cio 2 - Ordena o vetor [5, 3, 2, 4, 7, 1, 0, 6] com o algoritmo Bubble Sort. <br />
 * &nbsp;&nbsp;&nbsp; Input: 3 &lt;number&gt; - Output: Exerc�cio 3 - Calcula o fatorial de &lt;number&gt;. <br />
 * &nbsp;&nbsp;&nbsp; Input: 4 &lt;number&gt; - Output: Exerc�cio 4 - Calcula a soma dos m�ltiplos de 3 e 5 que s�o menores que &lt;number&gt;. <br />
 * 
 * @author Salety Baracho
 */
public class ExerciseList {	
	
	/**
	 * Atributo est�tico para executar o exerc�cio: votos em rela��o ao n�mero de eleitores.
	 * @see Election
	 */
	static Election firstElection = null;
	
	/**
	 * Atributo est�tico para executar o exerc�cio: algoritmo de ordena��o Bubble Sort.
	 * @see BubbleSort
	 */	
	static BubbleSort originalVector = null;
	
	/**
	 * Atributo est�tico para executar o exerc�cio Factorial e Soma dos multiplos de 3 ou 5
	 * @see Number
	 */	
	static Number value = null;	

	/**
	 * @param args apenas numero do exerc�cio para o casos dos exerc�cios 1 e 2; n�mero do exerc�cio seguido da entradas para o caso dos exerc�cios 3 e 4. <br /><br />
	 * 
	 * Exemplos: <br />
	 * 
	 * &nbsp;&nbsp;&nbsp; entrada: 1 - Votos em rela��o ao n�mero de eleitores de acordo com a tabela do primeiro exerc�cio. <br />
	 * &nbsp;&nbsp;&nbsp; entrada: 2 - Ordena o vetor [5, 3, 2, 4, 7, 1, 0, 6] com o algoritmo Bubble Sort. <br />
	 * &nbsp;&nbsp;&nbsp; entradas: 3 &lt;number&gt; - Calcula o fatorial de &lt;number&gt;. <br />
	 * &nbsp;&nbsp;&nbsp; entradas: 4 &lt;number&gt; - Calcula a soma dos m�ltiplos de 3 e 5 que s�o menores que &lt;number&gt;. <br />
	 */
	public static void main(String[] args) {
		
		// Reserva o primeiro argumento na vari�vel option 
		int option = Integer.parseInt(args[0]);
		
		// Se o primeiro argumento � 1 ent�o executa a l�gica do primeiro exerc�cio.
		if (option == 1) {
			
			//Constr�i objeto
			firstElection = new Election();
			
			//Imprime os valores calculados			
			System.out.printf("Percentual de votos v�lidos em rela��o ao n�mero total de eleitores: %.2f%%. \n", firstElection.calculatePercentageValidVotes()*100);
			System.out.printf("Percentual de votos brancos em rela��o ao n�mero total de eleitores: %.2f%%. \n", firstElection.calculatePercentageBlankVotes()*100);
			System.out.printf("Percentual de votos nulos em rela��o ao n�mero total de eleitores: %.2f%%. \n", firstElection.calculatePercentageNullVotes()*100);
		}
		// Se o primeiro argumento � 2 ent�o executa a l�gica do segundo exerc�cio.
		else if (option == 2) {
			
			//Constr�i objeto
			originalVector = new BubbleSort();	
			
			//Executa ordena��o
			int sortedVector[] = originalVector.sort();
			
			//Imprime vetor ordenado
			for (int i =0; i<sortedVector.length; i++) {
				System.out.printf("%d ", sortedVector[i]);
			}
		}
		// Se o primeiro argumento � 3 ou 4...
		else if (option == 3 || option == 4) {
			int number = Integer.parseInt(args[1]);
			
			//Constroi objeto que serve para o exerc�cio 3 e 4
			value = new Number(number);
			
			//Executa a l�gica do terceiro exerc�cio
			if (option == 3) {
				
				//Calcula o fatorial e imprime
				int factorial = value.calculateFactorial();				
				System.out.printf("Fatorial de %d � %d. \n", value.getValue(), factorial);
			}			
			//Executa a l�gica do quarto exerc�cio
			if (option == 4) {
				//Calcula a soma dos m�ltiplos e imprime
				int multiplesSum = value.calculateMultiples();				
				System.out.printf("Soma dos m�ltiplos de 3 e 5 menores que %d �: %d.\n", value.getValue(), multiplesSum);
			}				
		}
	}
}
