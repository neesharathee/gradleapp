package me.dharanaditya.jokelib;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertNotSame;


public class JokesUnitTest {
    private Jokes mJokes;

    @Before
    public void setUp(){
        mJokes = new Jokes();
    }
    @Test
    public void joke_isRetrieved(){
        String joke = mJokes.getJoke();
        assertNotNull(joke);
    }
    @Test
    public void notSameTest(){
        assert mJokes.getJoke() != mJokes.getJoke();
    }
}
