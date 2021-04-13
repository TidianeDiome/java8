/**
 * 
 */
package com.tidiane.java.personne.service;

import java.util.Collections;
import java.util.List;

import com.tidiane.java.personne.resources.Personne;
import com.tidiane.java.personne.resources.PersonneBuilder;

/**
 * @author A636862
 *
 */
public class PersonneServices implements IPersonneService{
	
	/**
	 * implementation du service
	 */
	@Override
	public List<Personne> ajouterPersonnes(List<Personne> personnes) {
		return Collections.singletonList(new PersonneBuilder().build());
	}
	

}
