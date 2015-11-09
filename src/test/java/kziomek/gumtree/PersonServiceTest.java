package kziomek.gumtree;


import org.junit.Assert;
import org.junit.Test;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class PersonServiceTest {

    @Test
    public void shouldCount3Males () {
        PersonService personService = new PersonService();
        int count = personService.countMales(null);
        Assert.assertTrue(count == 3);
    }
}
