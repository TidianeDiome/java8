/**
 * 
 */
package com.tidiane.java.client.ressources;

import java.io.Serializable;
import java.util.Date;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.karneim.pojobuilder.GeneratePojoBuilder;

/**
 * @author A636862
 *
 */
@GeneratePojoBuilder(intoPackage = "*")
@ApiModel("Client")
public class Client implements Serializable {

	/**
	 * serialVersionUID
	 */
	private static final long serialVersionUID = -1963708172814933796L;
	
	@ApiModelProperty(name = "nom")
	private String nom;
	
	@ApiModelProperty(name = "prenom")
	private String prenom;
	
	@ApiModelProperty(name = "dateNaissance")
	private Date dateNaissance;

	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * @return the dateNaissance
	 */
	public Date getDateNaissance() {
		return dateNaissance;
	}

	/**
	 * @param dateNaissance the dateNaissance to set
	 */
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	@Override
	public String toString() {
		return "Client [nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance + "]";
	}
	
	

}
