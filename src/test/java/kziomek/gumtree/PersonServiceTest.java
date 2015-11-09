package kziomek.gumtree;


import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class PersonServiceTest {

    List<Person> personList;

    @Before
    public void init() throws IOException, URISyntaxException {
        System.out.println("inti");
        CSVReader csvReader = new CSVReader();
        personList = csvReader.readDefaultCSV();

    }

    @Test
    public void shouldCount3Males () {
        Assert.assertNotNull(personList);

        PersonService personService = new PersonService();
        int count = personService.countMales(personList);
        Assert.assertTrue(count == 3);
    }

}
