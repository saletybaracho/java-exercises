package br.com.saletybaracho.git;

/**Classe que calcula algumas estatística sobre eleição.
 * @author Salety Baracho
 */
public class Election {
	
	/**
	 * Número de votos válidos.
	 */
	private int validVotes;
	
	/**
	 * Número de votos em branco.
	 */
	private int blankVotes;
	
	/**
	 * Número de votos nulos.
	 */
	private int nullVotes;
	
	/**
	 * Número total de eleitores
	 */
	private int totalVoters;
	
	/**
	 * Construtor default de acordo com a tabela apresentada no enunciado do exercício.
	 */
	public Election() {
		this.setTotalVoters(1000);
		this.validVotes = 800;
		this.blankVotes = 150;
		this.nullVotes = 50;		
	}

	/**
	 * 
	 * @return validVotes número de votos válidos.
	 */
	public int getValidVotes() {
		return validVotes;
	}

	/**
	 * 
	 * @param validVotes número de votos válidos.
	 */
	public void setValidVotes(int validVotes) {
		this.validVotes = validVotes;
	}
    
	/**
	 * 
	 * @return blankVotes número de votos em branco.
	 */
	public int getBlankVotes() {
		return blankVotes;
	}
    
	/**
	 * 
	 * @param blankVotes número de votos válidos.
	 */
	public void setBlankVotes(int blankVotes) {
		this.blankVotes = blankVotes;
	}
	
	/**
	 * 
	 * @return nullVotes número de votos nulos.
	 */
	public int getNullVotes() {
		return nullVotes;
	}

	/**
	 * 
	 * @param nullVotes número de votos nulos.
	 */
	public void setNullVotes(int nullVotes) {
		this.nullVotes = nullVotes;
	}

	/**
	 * 
	 * @return totalVoters número total de eleitores.
	 */
	public int getTotalVoters() {
		return totalVoters;
	}

	/**
	 * 
	 * @param totalVoters número total de eleitores.
	 */
	public void setTotalVoters(int totalVoters) {
		this.totalVoters = totalVoters;
	}
	
	/**
	 * Calcula a porcentagem de votos nulos em relação ao número total de eleitores.
	 * @return float porcentagem de votos nulos em relação ao número total de eleitores.
	 */
	public float calculatePercentageNullVotes() {
		return (float)nullVotes/(float)totalVoters;
	}
	
	/**
	 * Calcula a porcentagem de votos em branco em relação ao número total de eleitores.
	 * @return float porcentagem de votos em branco em relação ao número total de eleitores.
	 */
	public float calculatePercentageBlankVotes() {
		return (float)blankVotes/(float)totalVoters;
	}
	
	/**
	 * Calcula a porcentagem de votos válidos em relação ao número total de eleitores.
	 * @return float porcentagem de votos válidos em relação ao número total de eleitores.
	 */
	public float calculatePercentageValidVotes() {
		return (float)validVotes/(float)totalVoters;
	}
}
