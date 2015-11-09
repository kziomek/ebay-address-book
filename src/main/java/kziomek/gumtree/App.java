package kziomek.gumtree;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class App {

    public static void run() throws IOException, URISyntaxException {

        CSVReader csvReader = new CSVReader();
        List<Person> personList = csvReader.readDefaultCSV();

        PersonService personService = new PersonService();

        System.out.println("How many males are in the address book?");
        System.out.println(personService.countMales(personList));

        System.out.println("Who is the oldest person in the address book?");
        System.out.println(personService.findOldestPerson(personList).getName());

        System.out.println("How many days older is Bill than Paul?");
        System.out.println(personService.howManyDaysOlderIsBillThanPaul(personList));


    }

    public static void main(String args[]) {
        try {
            App.run();
        } catch (IOException|URISyntaxException  e) {
            e.printStackTrace();
        }
    }

}
