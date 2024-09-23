package com.example.TestingApplicaton1.repo;

import com.example.TestingApplicaton1.TestingApplicaton1Application;
import com.example.TestingApplicaton1.model.Movies;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class RepoMovieTest {

    @Autowired
    private RepoMovie repoMovie;

    @Test
    public void save(){
        //arrange
        Movies maha = new Movies();
        maha.setName("Maharaaja");
        maha.setRating("9.8");

        //act
        Movies movies = repoMovie.save(maha);

        //assert
        assertNotNull(movies);

    }

    @Test
    public void findAll(){
////find duplocaicateslist..Collec.Funt, Collectiors.;Map<Intgege, Lo> res = res..s.filtentry-> entry.getVa > 1.forentry -> soutent.get2,3,,1,5,2,8freq2fre2//
    }

}
