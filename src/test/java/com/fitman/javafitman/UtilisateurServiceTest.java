package com.fitman.javafitman;

import com.fitman.javafitman.Model.Exercices_Sport;
import com.fitman.javafitman.Model.Utilisateur;
import com.fitman.javafitman.Service.UtilisateurService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UtilisateurServiceTest {
    @Autowired
    private UtilisateurService utilisateurService;

    @Test(expected = Exception.class)
    public void testliaison() throws Exception {
        Exercices_Sport ex = utilisateurService.suggestionSport(-5);

    }

}
