package fr.cd.jtetris.util;

import static org.junit.Assert.*;
import org.junit.Test;

public class LigneUtilTest {

	/**
	 * ligne complète : 1 1 1 1 1 1 1 1 1 1 1 1 1 --> 8191
	 */
	@Test
	public void testIsComplete() {
		int ligne = 0;
		boolean complete = LigneUtil.isComplete(ligne);
		assertEquals(false, complete);
		ligne = 8191;
		complete = LigneUtil.isComplete(ligne);
		assertEquals(true, complete);
	}

}
