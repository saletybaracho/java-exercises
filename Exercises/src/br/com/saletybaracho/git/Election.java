package br.com.saletybaracho.git;

/**Classe que calcula algumas estat�stica sobre elei��o.
 * @author Salety Baracho
 */
public class Election {
	
	/**
	 * N�mero de votos v�lidos.
	 */
	private int validVotes;
	
	/**
	 * N�mero de votos em branco.
	 */
	private int blankVotes;
	
	/**
	 * N�mero de votos nulos.
	 */
	private int nullVotes;
	
	/**
	 * N�mero total de eleitores
	 */
	private int totalVoters;
	
	/**
	 * Construtor default de acordo com a tabela apresentada no enunciado do exerc�cio.
	 */
	public Election() {
		this.setTotalVoters(1000);
		this.validVotes = 800;
		this.blankVotes = 150;
		this.nullVotes = 50;		
	}

	/**
	 * 
	 * @return validVotes n�mero de votos v�lidos.
	 */
	public int getValidVotes() {
		return validVotes;
	}

	/**
	 * 
	 * @param validVotes n�mero de votos v�lidos.
	 */
	public void setValidVotes(int validVotes) {
		this.validVotes = validVotes;
	}
    
	/**
	 * 
	 * @return blankVotes n�mero de votos em branco.
	 */
	public int getBlankVotes() {
		return blankVotes;
	}
    
	/**
	 * 
	 * @param blankVotes n�mero de votos v�lidos.
	 */
	public void setBlankVotes(int blankVotes) {
		this.blankVotes = blankVotes;
	}
	
	/**
	 * 
	 * @return nullVotes n�mero de votos nulos.
	 */
	public int getNullVotes() {
		return nullVotes;
	}

	/**
	 * 
	 * @param nullVotes n�mero de votos nulos.
	 */
	public void setNullVotes(int nullVotes) {
		this.nullVotes = nullVotes;
	}

	/**
	 * 
	 * @return totalVoters n�mero total de eleitores.
	 */
	public int getTotalVoters() {
		return totalVoters;
	}

	/**
	 * 
	 * @param totalVoters n�mero total de eleitores.
	 */
	public void setTotalVoters(int totalVoters) {
		this.totalVoters = totalVoters;
	}
	
	/**
	 * Calcula a porcentagem de votos nulos em rela��o ao n�mero total de eleitores.
	 * @return float porcentagem de votos nulos em rela��o ao n�mero total de eleitores.
	 */
	public float calculatePercentageNullVotes() {
		return (float)nullVotes/(float)totalVoters;
	}
	
	/**
	 * Calcula a porcentagem de votos em branco em rela��o ao n�mero total de eleitores.
	 * @return float porcentagem de votos em branco em rela��o ao n�mero total de eleitores.
	 */
	public float calculatePercentageBlankVotes() {
		return (float)blankVotes/(float)totalVoters;
	}
	
	/**
	 * Calcula a porcentagem de votos v�lidos em rela��o ao n�mero total de eleitores.
	 * @return float porcentagem de votos v�lidos em rela��o ao n�mero total de eleitores.
	 */
	public float calculatePercentageValidVotes() {
		return (float)validVotes/(float)totalVoters;
	}
}
