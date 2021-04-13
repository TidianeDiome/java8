/**
 * 
 */
package com.tidiane.java.personne.service;

import java.util.List;

import com.tidiane.java.personne.resources.Personne;

/**
 * @author A636862
 *
 */
public interface IPersonneService {
	
	/**
	 * Service permettant d'ajouter une personne
	 * 
	 * @param personnes the personne
	 * @return la liste de personne
	 */
	List<Personne> ajouterPersonnes(List<Personne> personnes);

}
