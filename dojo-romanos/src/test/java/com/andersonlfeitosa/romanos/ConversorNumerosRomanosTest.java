package com.andersonlfeitosa.romanos;

import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de teste para ConversorNumerosRomanos.
 * 
 * @author Anderson Lobo Feitosa
 * @since 1.0.0
 * @version 1.0.0
 */
public class ConversorNumerosRomanosTest {

	@Test
	public void test() {
		
		/*
		 * Convencoes
		 */
		// verifica conversao valor null
		Assert.assertNull(ConversorNumerosRomanos.converter(null));

		// verifica conversao valor negativo, neste caso null
		Assert.assertNull(ConversorNumerosRomanos.converter(-1));

		// verifica conversao valor 0, neste caso null
		Assert.assertNull(ConversorNumerosRomanos.converter(0));
		
		/*
		 * Algarismos romanos
		 */
		// verifica coversao de 1
		Assert.assertEquals("I", ConversorNumerosRomanos.converter(1));
		
		// verifica coversao de 5
		Assert.assertEquals("V", ConversorNumerosRomanos.converter(5));

		// verifica coversao de 10
		Assert.assertEquals("X", ConversorNumerosRomanos.converter(10));

		// verifica coversao de 50
		Assert.assertEquals("L", ConversorNumerosRomanos.converter(50));
		
		// verifica coversao de 100
		Assert.assertEquals("C", ConversorNumerosRomanos.converter(100));

		// verifica coversao de 500
		Assert.assertEquals("D", ConversorNumerosRomanos.converter(500));

		// verifica coversao de 1000
		Assert.assertEquals("M", ConversorNumerosRomanos.converter(1000));
		
		/*
		 * Composicoes de algarismos romanos
		 */
		// verifica coversao de 4
		Assert.assertEquals("IV", ConversorNumerosRomanos.converter(4));
		
		// verifica coversao de 6
		Assert.assertEquals("VI", ConversorNumerosRomanos.converter(6));
		
		// verifica coversao de 9
		Assert.assertEquals("IX", ConversorNumerosRomanos.converter(9));
		
		// verifica coversao de 11
		Assert.assertEquals("XI", ConversorNumerosRomanos.converter(11));
		
		// verifica coversao de 40
		Assert.assertEquals("XL", ConversorNumerosRomanos.converter(40));

		// verifica coversao de 60
		Assert.assertEquals("LX", ConversorNumerosRomanos.converter(60));
		
		// verifica coversao de 90
		Assert.assertEquals("XC", ConversorNumerosRomanos.converter(90));

		// verifica coversao de 110
		Assert.assertEquals("CX", ConversorNumerosRomanos.converter(110));
		
		// verifica coversao de 400
		Assert.assertEquals("CD", ConversorNumerosRomanos.converter(400));
		
		// verifica coversao de 600
		Assert.assertEquals("DC", ConversorNumerosRomanos.converter(600));
		
		// verifica coversao de 900
		Assert.assertEquals("CM", ConversorNumerosRomanos.converter(900));
		
		// verifica coversao de 1100
		Assert.assertEquals("MC", ConversorNumerosRomanos.converter(1100));

		/*
		 * Outros numeros
		 */
		// verifica coversao de 1990
		Assert.assertEquals("MCMXC", ConversorNumerosRomanos.converter(1990));
		
		// verifica coversao de 2
		Assert.assertEquals("II", ConversorNumerosRomanos.converter(2));

		// verifica coversao de 3
		Assert.assertEquals("III", ConversorNumerosRomanos.converter(3));

		// verifica coversao de 369
		Assert.assertEquals("CCCLXIX", ConversorNumerosRomanos.converter(369));
		
		// verifica coversao de 448
		Assert.assertEquals("CDXLVIII", ConversorNumerosRomanos.converter(448));

		// verifica coversao de 600
		Assert.assertEquals("DC", ConversorNumerosRomanos.converter(600));
		
		// verifica coversao de 1998
		Assert.assertEquals("MCMXCVIII", ConversorNumerosRomanos.converter(1998));
		
		// verifica coversao de 24
		Assert.assertEquals("XXIV", ConversorNumerosRomanos.converter(24));
		
		// verifica coversao de 2751
		Assert.assertEquals("MMDCCLI", ConversorNumerosRomanos.converter(2751));
		
		// verifica coversao de 5000
		Assert.assertEquals("MMMMM", ConversorNumerosRomanos.converter(5000));

		// verifica coversao de 999
		Assert.assertEquals("CMXCIX", ConversorNumerosRomanos.converter(999));
		
	}

}
