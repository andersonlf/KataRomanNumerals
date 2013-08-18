package com.andersonlfeitosa.romanos;

/**
 * 
 * Classe responsavel por declarar todos os algarismos romanos: 
 * M, D, C, L, X, V e I.
 * Para efeitos de desempenho tambem foram declarados composicoes 
 * dos algarismos romanos: CM, CD, XC, XL, IX, IV.
 * A declaracao dos algarismos romanos deve obedecer a ordem decrescente,
 * um vez que algarismos que representam numeros maiores tem precedencia 
 * sobre os algarismos que representam numeros menores.
 * 
 * 
 * @author Anderson Lobo Feitosa
 * @since 1.0.0
 * @version 1.0.0
 */
public enum AlgarismosRomanos {
	
	M (1000),
	
	CM (900),
	
	D (500),
	
	CD (400),
	
	C (100),
	
	XC (90),
	
	L (50),
	
	XL (40),
	
	X (10),
	
	IX (9),
	
	V (5),
	
	IV (4),
	
	I (1);
	
	private int valor;
	
	AlgarismosRomanos(int valor) {
		this.valor = valor;
	}
	
	/**
	 * Representa o valor no nosso sistema de numeracao.
	 * @return valor do algarismo romano no nosso 
	 * sistema de numeracao.
	 */
	public int getValor() {
		return valor;
	}

}
