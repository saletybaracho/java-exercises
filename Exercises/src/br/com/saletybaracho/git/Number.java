package br.com.saletybaracho.git;

/**Classe para controlar operações sobre número inteiro.
 * @author Salety Baracho
 */
public class Number {
	
	/**
	 * Atributo que armazena o valor de um número inteiro.
	 */
	private int value;
	
	
	/**
	 * Construtor default.
	 * @param value valor do número inteiro.
	 */
	public Number(int value) {
		this.setValue(value);
	}

	/**
	 * 
	 * @return value valor do número inteiro.
	 */
	public int getValue() {
		return value;
	}

	/**
	 * 
	 * @param value valor do número inteiro.
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * Calcula o fatorial de value.
	 * @return factorial valor do fatorial calculado.
	 */
	public int calculateFactorial( ) {
		//Se value é 0 ou 1, então o fatorial é 1.
		if (this.value == 1 || this.value == 0) {
			return 1;
		}
		
		int factorial = 1;
		
		//Calcula o fatorial de value.
		for (int i = this.value; i > 0; i--) {
			factorial = factorial * i;
		}
		
		return factorial;
	}
	
	/**
	 * Calcula os multiplos de 3 e 5 menores que value.
	 * @return multiplesSum soma dos multiplos de 3 e 5 menores que value.
	 */
	public int calculateMultiples() {
		int multiplesSum = 0;
		
		//Calcula a soma dos múltiplos.
		for (int i = this.value-1; i > 0; i--) {
			if (i%5 == 0 || i%3 == 0) {
				multiplesSum += i;
			}
		}
		
		return multiplesSum;
	}
}
