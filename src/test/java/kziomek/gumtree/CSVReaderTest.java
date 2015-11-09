package kziomek.gumtree;


import org.junit.Assert;
import org.junit.Test;

import java.util.List;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class CSVReaderTest {

    @Test
    public void shouldLoadFivePeople() {

        CSVReader csvReader = new CSVReader();

        List<Person> personList = csvReader.readPeopleCSV(null);
        Assert.assertTrue(personList.size() == 5);

        System.out.println("run :)");

    }
}
