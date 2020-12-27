package fr.cd.jtetris.factory;

import java.awt.Color;

import fr.cd.jtetris.bean.Bloc;

/**
 * Factory des blocs de type :
 * 
 *  . X 
 *  . X 
 *  X X 
 * 
 * @author CD
 * @version 1.0.0
 * @since 1.0.0
 */
public class Type1BlocFactory implements BlocFactory {
	
	public Bloc nouveauBloc() {
		return new Bloc(new int[] {1,1,3}, 2, 3, Color.green.brighter());
	}

}
