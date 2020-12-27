package fr.cd.jtetris.util;

import static org.junit.Assert.*;

import org.junit.Test;

public class BlocUtilTest {

	/**
	 *	Pour le bloc
	 *
	 *  X .
	 *  X .
	 *  X X
	 * 
	 * La colonne 1 a pour valeur binaire : 1 1 1
	 * La colonne 0 a pour valeur binaire : 0 0 1
	 */
	@Test
	public void testGetColonne() {
		int[] parts = {1,1,3};
		int result = BlocUtil.getColonne(parts, 1, 2);
		assertEquals(7, result);
		result = BlocUtil.getColonne(parts, 0, 2);
		assertEquals(1, result);
	}
}
