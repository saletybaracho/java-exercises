package br.com.saletybaracho.git;


/**Classe para ordenar vetor usando algoritmo BubbleSort.
 * @author Salety Baracho
 */
public class BubbleSort {

    /**
     * Vetor de números inteiros.
     */
	private int[] vector;
    
	/**
	 * Construtor default com os valores [5, 3, 2, 4, 7, 1, 0, 6].
	 */
    public BubbleSort() {
    	this.vector = new int[8];
    	vector[0] = 5;
    	vector[1] = 3;
    	vector[2] = 2;
    	vector[3] = 4;
    	vector[4] = 7;
    	vector[5] = 1;
    	vector[6] = 0;
    	vector[7] = 6;
    }
    
    /**
     * 
     * @return vector vetor de valores inteiros.
     */
    public int[] getVector() {
		return vector;
	}
	
    /**
     * 
     * @param vector vetor de valores inteiros.
     */
    public void setVector(int[] vector) {
		this.vector = vector;
	}
	
	/**
	 * Ordena o atributo vector com o algoritmo Bubble Sort.
	 * @return result vetor ordenado.
	 */
	public int[] sort() {
		
		//Criar vetor result do mesmo tamanho que vector.
		int result[] = new int[this.vector.length];
		
		//Variável temporária de suporte para ordenação.
		int temp = 0;
		
		//Loop de comparações para ordenar vector.
		for (int j = 0; j< this.vector.length-1; j++) {
			for (int i = 0; i< (this.vector.length-1)-j; i++) {
				if (vector[i] > this.vector[i+1]) {
					temp = this.vector[i];
					this.vector[i] = this.vector[i+1];
					this.vector[i+1] = temp;
				}
			}
			
			result[(vector.length-1)-j] = vector[(vector.length-1)-j];
		}		
		
		return result;
	}
	

}
