package fr.cd.jtetris.factory;

import fr.cd.jtetris.bean.Bloc;

/**
 * Interface commune aux fabriques de blocs
 * @author CD
 * @version 1.0.0
 * @since 1.0.0
 */
public interface BlocFactory {

	/**
	 * Créé un nouveau bloc
	 * @return Un nouveau bloc
	 */
	Bloc nouveauBloc();
	
}
