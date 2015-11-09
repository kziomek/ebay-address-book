package kziomek.gumtree;


import org.junit.Assert;
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
public class CSVReaderTest {

    @Test
    public void shouldLoadFivePeople() throws IOException, URISyntaxException {

        String filename = "AddressBook.csv";
        Path path = Paths.get(ClassLoader.getSystemResource(filename).toURI());

        CSVReader csvReader = new CSVReader();

        List<Person> personList = csvReader.readPeopleCSV(path);
        Assert.assertTrue(personList.size() == 5);
        Assert.assertTrue("Bill McKnight".equals(personList.get(0).getName()));
        Assert.assertTrue("Male".equals(personList.get(4).getGender()));
        Assert.assertTrue(personList.get(2).getBirthDate() != null);
    }
}
