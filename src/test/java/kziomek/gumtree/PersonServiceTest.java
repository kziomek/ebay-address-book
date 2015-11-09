package kziomek.gumtree;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.List;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class PersonServiceTest {

    List<Person> personList;

    @Before
    public void init() throws IOException, URISyntaxException {
        CSVReader csvReader = new CSVReader();
        personList = csvReader.readDefaultCSV();

    }

    @Test
    public void shouldCount3Males () {
        Assert.assertNotNull(personList);

        PersonService personService = new PersonService();
        long count = personService.countMales(personList);
        Assert.assertTrue(count == 3);
    }

    @Test
    public void shouldFindWesJacksonAsOldestPerson() {
        Assert.assertNotNull(personList);

        PersonService personService = new PersonService();
        Person oldestPerson = personService.findOldestPerson(personList);

        Assert.assertTrue("Wes Jackson".equals(oldestPerson.getName()));

    }

    @Test
    public void shouldCountOneDay() {
        Assert.assertNotNull(personList);
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        PersonService personService = new PersonService();
        long days = personService.countDaysBetweenDates(today, yesterday);
        Assert.assertTrue(days == 1);

    }

    @Test
    public void shouldCountOneDayWithReversedDates() {
        Assert.assertNotNull(personList);
        LocalDate today = LocalDate.now();
        LocalDate yesterday = today.minusDays(1);

        PersonService personService = new PersonService();
        long days = personService.countDaysBetweenDates(yesterday, today);

        Assert.assertTrue(days == 1);

    }

    @Test
    public void shouldReturnNumberDaysBetweenBillAndPaulBirthDates(){
        Assert.assertNotNull(personList);
        PersonService personService = new PersonService();
        long days = personService.howManyDaysOlderIsBillThanPaul(personList);

        //2862 calculated by countDaysBetweenDates()
        Assert.assertTrue(days == 2862);
    }

}
