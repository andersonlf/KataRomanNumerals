package com.andersonlfeitosa.romanos;

/**
 * Classe utilitaria que converte numeros do nosso sistema de numeracao
 * para o sistema de numeracao romano.
 * 
 * @author Anderson Lobo Feitosa
 * @since 1.0.0
 * @version 1.0.0
 */
public class ConversorNumerosRomanos {

	/**
	 * Metodo que converte o numero especificado para o sistema de numeracao romano.
	 * Esse metodo retornara <code>null</code> quando o numero especificado for 
	 * menor ou igual a zero e maior igual a 4000.
	 * 
	 * @param numero O inteiro positivo maior que zero a ser convertido para algarismos romanos.
	 * @return O numero especificado representado por algarismos romanos.
	 */
	public static String converter(Integer numero) {
		String romanos = null;
		
		if (numero != null && numero > 0 && numero < 4000) {
			romanos = converterParaRomanos(numero);
		}
		
		return romanos;
	}

	/*
	 * Metodo que realiza a conversao para algarismos romanos.
	 * Esse metodo assume que o numero passado eh positivo, maior que zero e menor que 4000.
	 * 
	 * @param numero O numero a ser convertido. 
	 * @return O numero especificado representado por algarismos romanos.
	 */
	private static String converterParaRomanos(Integer numero) {
		int resultado = 0;
		int resto = 0;
		
		/*
		 * Verifica se nao eh um numero cheio
		 */
		for (AlgarismosRomanos algarismo: AlgarismosRomanos.values()) {
			if (algarismo.getValor() == numero) {
				return algarismo.name();
			}
		}
		
		/*
		 * Verifica se eh maior que um dos valores cheios obtem o resto e reprocessa-o
		 */
		for (AlgarismosRomanos algarismo: AlgarismosRomanos.values()) {
			if (algarismo.equals(AlgarismosRomanos.M) && numero > algarismo.getValor()) {
				resultado = numero / algarismo.getValor();
				resto = numero % algarismo.getValor();
				return repetirAlgarismos(algarismo.name(), resultado) + converterParaRomanos(resto);
			} else if (numero > algarismo.getValor()) {
				resto = numero - algarismo.getValor();
				return algarismo.name() + converterParaRomanos(resto);
			}
		}
		
		// retorna vazio em qualquer outra situacao
		return "";
	}

	/*
	 * Metodo que repete o algarismo romano especificado de acordo com a quantidade de
	 * repeticoes especificado. Exemplo: Para os argumentos M, 3 a saida eh MMM.
	 *   
	 * @param algarismoRomano O algarismo romano que sera repetido.
	 * @param repeticoes A quantidade de vezes que o algarismo romano especificado sera repetido.
	 * @return Um string com a representacao romana.
	 */
	private static String repetirAlgarismos(String algarismoRomano, int repeticoes) {
		String romanos = new String();
		
		for (int i = 0; i < repeticoes; i++) {
			romanos += algarismoRomano;
		}
		
		return romanos;
	}

}
