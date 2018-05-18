package fr.gtm.pbsi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.gtm.pbsi.domain.Employe;

/**
 * @author Bovin Blondel Demolis Colbert Sersoub * Interface permettant de
 *         definir un Repository Spring. Nous utilisons ici l'interface
 *         JpaRepository de Spring pour demander au Framework de fabriquer un
 *         DAO evolue qui manipule une entite JPA/Hibernate.
 */
public interface IEmployeDao extends JpaRepository<Employe, Integer> {

	Employe findByLoginAndPassword(String login, String password);

}
