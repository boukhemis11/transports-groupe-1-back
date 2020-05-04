package dev.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class Collegue {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id; // TODO Long ????

	private String nom;

	private String prenom;

	private String email;

	private String motDePasse;

	private String matricule;

	private String numTelephone;

	@JsonManagedReference
	@OneToMany(mappedBy = "collegue", cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	private List<RoleCollegue> roles;

	/**
	 * Constructeur
	 * 
	 */
	public Collegue() {

	}

	/**
	 * Constructeur
	 * 
	 * @param id
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param motDePasse
	 * @param matricule
	 * @param numTelephone
	 * @param roles
	 * @param listReservationP
	 * @param listReservationC
	 * @param listReservationRA
	 */
	public Collegue(Long id, String nom, String prenom, String email, String motDePasse, String matricule,
			String numTelephone, List<RoleCollegue> roles) {

		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.matricule = matricule;
		this.numTelephone = numTelephone;
		this.roles = roles;
	}

	/**
	 * Constructor
	 *
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param motDePasse
	 * @param matricule
	 * @param numTelephone
	 * @param roles
	 * @param listReservationP
	 * @param listReservationC
	 * @param listReservationRA
	 */
	public Collegue(String nom, String prenom, String email, String motDePasse, String matricule, String numTelephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.motDePasse = motDePasse;
		this.matricule = matricule;
		this.numTelephone = numTelephone;
		this.roles = new ArrayList<>();
	}

	/**
	 * Getter
	 * 
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Getter
	 * 
	 * @return the prenom
	 */
	public String getPrenom() {
		return prenom;
	}

	/**
	 * Getter
	 * 
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * Getter
	 * 
	 * @return the motDePasse
	 */
	public String getMotDePasse() {
		return motDePasse;
	}

	/**
	 * Getter
	 * 
	 * @return the matricule
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * Getter
	 * 
	 * @return the numTelephone
	 */
	public String getNumTelephone() {
		return numTelephone;
	}

	/**
	 * Getter
	 * 
	 * @return the roles
	 */
	public List<RoleCollegue> getRoles() {
		return roles;
	}

	/**
	 * Setter
	 * 
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Setter
	 * 
	 * @param prenom the prenom to set
	 */
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	/**
	 * Setter
	 * 
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * Setter
	 * 
	 * @param motDePasse the motDePasse to set
	 */
	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	/**
	 * Setter
	 * 
	 * @param matricule the matricule to set
	 */
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	/**
	 * Setter
	 * 
	 * @param numTelephone the numTelephone to set
	 */
	public void setNumTelephone(String numTelephone) {
		this.numTelephone = numTelephone;
	}

	/**
	 * Setter
	 * 
	 * @param roles the roles to set
	 */
	public void setRoles(List<RoleCollegue> roles) {
		this.roles = roles;
	}

}
