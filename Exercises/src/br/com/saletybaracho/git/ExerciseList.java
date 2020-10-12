/**
 * 
 */
package br.com.saletybaracho.git;

/**Classe principal para executar os exercícios de Java de acordo com os valores passados como parâmetro. <br /> <br />
 * 
 * Exemplos: <br /> <br />
 * 
 * &nbsp;&nbsp;&nbsp; Input: 1 - Output: Exercício 1 - Votos em relação ao número de eleitores de acordo com a tabela do primeiro exercício. <br />
 * &nbsp;&nbsp;&nbsp; Input: 2 - Output: Exercício 2 - Ordena o vetor [5, 3, 2, 4, 7, 1, 0, 6] com o algoritmo Bubble Sort. <br />
 * &nbsp;&nbsp;&nbsp; Input: 3 &lt;number&gt; - Output: Exercício 3 - Calcula o fatorial de &lt;number&gt;. <br />
 * &nbsp;&nbsp;&nbsp; Input: 4 &lt;number&gt; - Output: Exercício 4 - Calcula a soma dos múltiplos de 3 e 5 que são menores que &lt;number&gt;. <br />
 * 
 * @author Salety Baracho
 */
public class ExerciseList {	
	
	/**
	 * Atributo estático para executar o exercício: votos em relação ao número de eleitores.
	 * @see Election
	 */
	static Election firstElection = null;
	
	/**
	 * Atributo estático para executar o exercício: algoritmo de ordenação Bubble Sort.
	 * @see BubbleSort
	 */	
	static BubbleSort originalVector = null;
	
	/**
	 * Atributo estático para executar o exercício Factorial e Soma dos multiplos de 3 ou 5
	 * @see Number
	 */	
	static Number value = null;	

	/**
	 * @param args apenas numero do exercício para o casos dos exercícios 1 e 2; número do exercício seguido da entradas para o caso dos exercícios 3 e 4. <br /><br />
	 * 
	 * Exemplos: <br />
	 * 
	 * &nbsp;&nbsp;&nbsp; entrada: 1 - Votos em relação ao número de eleitores de acordo com a tabela do primeiro exercício. <br />
	 * &nbsp;&nbsp;&nbsp; entrada: 2 - Ordena o vetor [5, 3, 2, 4, 7, 1, 0, 6] com o algoritmo Bubble Sort. <br />
	 * &nbsp;&nbsp;&nbsp; entradas: 3 &lt;number&gt; - Calcula o fatorial de &lt;number&gt;. <br />
	 * &nbsp;&nbsp;&nbsp; entradas: 4 &lt;number&gt; - Calcula a soma dos múltiplos de 3 e 5 que são menores que &lt;number&gt;. <br />
	 */
	public static void main(String[] args) {
		
		// Reserva o primeiro argumento na variável option 
		int option = Integer.parseInt(args[0]);
		
		// Se o primeiro argumento é 1 então executa a lógica do primeiro exercício.
		if (option == 1) {
			
			//Constrói objeto
			firstElection = new Election();
			
			//Imprime os valores calculados			
			System.out.printf("Percentual de votos válidos em relação ao número total de eleitores: %.2f%%. \n", firstElection.calculatePercentageValidVotes()*100);
			System.out.printf("Percentual de votos brancos em relação ao número total de eleitores: %.2f%%. \n", firstElection.calculatePercentageBlankVotes()*100);
			System.out.printf("Percentual de votos nulos em relação ao número total de eleitores: %.2f%%. \n", firstElection.calculatePercentageNullVotes()*100);
		}
		// Se o primeiro argumento é 2 então executa a lógica do segundo exercício.
		else if (option == 2) {
			
			//Constrói objeto
			originalVector = new BubbleSort();	
			
			//Executa ordenação
			int sortedVector[] = originalVector.sort();
			
			//Imprime vetor ordenado
			for (int i =0; i<sortedVector.length; i++) {
				System.out.printf("%d ", sortedVector[i]);
			}
		}
		// Se o primeiro argumento é 3 ou 4...
		else if (option == 3 || option == 4) {
			int number = Integer.parseInt(args[1]);
			
			//Constroi objeto que serve para o exercício 3 e 4
			value = new Number(number);
			
			//Executa a lógica do terceiro exercício
			if (option == 3) {
				
				//Calcula o fatorial e imprime
				int factorial = value.calculateFactorial();				
				System.out.printf("Fatorial de %d é %d. \n", value.getValue(), factorial);
			}			
			//Executa a lógica do quarto exercício
			if (option == 4) {
				//Calcula a soma dos múltiplos e imprime
				int multiplesSum = value.calculateMultiples();				
				System.out.printf("Soma dos múltiplos de 3 e 5 menores que %d é: %d.\n", value.getValue(), multiplesSum);
			}				
		}
	}
}
