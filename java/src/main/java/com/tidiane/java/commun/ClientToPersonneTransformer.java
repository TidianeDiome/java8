/**
 * 
 */
package com.tidiane.java.commun;

import com.tidiane.java.client.ressources.Client;
import com.tidiane.java.personne.resources.Personne;

import fr.xebia.extras.selma.Mapper;

/**
 * @author A636862
 *
 */
@Mapper()
public interface ClientToPersonneTransformer {
	
	Personne reverse(Client client);
	
	Client transform(Personne client);

}
