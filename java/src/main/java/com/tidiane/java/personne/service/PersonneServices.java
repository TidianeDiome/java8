/**
 * 
 */
package com.tidiane.java.personne.service;

import java.util.Collections;
import java.util.List;

import com.google.common.collect.MoreCollectors;
import com.tidiane.java.client.ressources.Client;
import com.tidiane.java.commun.ClientToPersonneTransformer;
import com.tidiane.java.personne.resources.Personne;

import fr.xebia.extras.selma.Selma;

/**
 * @author A636862
 *
 */
public class PersonneServices implements IPersonneService{
	/**
	 * 
	 */
	private ClientToPersonneTransformer clientToPersonneTransformer = Selma.mapper(ClientToPersonneTransformer.class);

	/**
	 * implementation du service
	 */
	@Override
	public List<Personne> ajouterPersonnes(List<Personne> personnes) {
		Client client = clientToPersonneTransformer.transform(personnes.stream()
				.collect(MoreCollectors.onlyElement()));
		
		return Collections.singletonList(clientToPersonneTransformer.reverse(client));
	}
	

}
