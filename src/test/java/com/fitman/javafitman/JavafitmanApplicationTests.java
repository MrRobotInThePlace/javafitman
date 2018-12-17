package com.fitman.javafitman;

import com.fitman.javafitman.Model.Executer;
import com.fitman.javafitman.Model.Utilisateur;
import com.fitman.javafitman.Repository.UtilisateurRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.HashSet;

import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class JavafitmanApplicationTests {

	@Autowired
	private UtilisateurRepository UtilisateurRepository;

	/* @Test
	public void testConnectionBDD() {

		//Given


		//Integer nbUtilisateur = UtilisateurRepository.findOne(2);


		//Assert.assertTrue((nbUtilisateur > 0));

		//When
		Utilisateur u = UtilisateurRepository.findOne(4);
		Set<Executer> e = u.getExecuterSports();

		for (Executer ex : e) {
			System.out.println(ex.getExercicesSport());

		}

		//Then
		Assert.assertEquals(1, e.size());
	}
*/

}

