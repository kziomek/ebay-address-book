package kziomek.gumtree;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class App {

    public static List<Person> loadFile(Path path) throws IOException, URISyntaxException {

        CSVReader csvReader = new CSVReader();
        return csvReader.readPeopleCSV(path);

    }

    public static void executeTasks(List<Person> personList) {

        PersonService personService = new PersonService();

        System.out.println("How many males are in the address book?");
        System.out.println(personService.countMales(personList));

        System.out.println("Who is the oldest person in the address book?");
        System.out.println(personService.findOldestPerson(personList).getName());

        System.out.println("How many days older is Bill than Paul?");
        System.out.println(personService.howManyDaysOlderIsBillThanPaul(personList));


    }

    public static void main(String args[]) {

        if (args.length != 1) {
            System.out.println("Run app with file path parameter, i.e.:");
            System.out.println("java -jar target/gumtree-1.0-SNAPSHOT.jar target/classes/AddressBook.csv");
            System.exit(0);
        }
        try {
            String filename = args[0];
            Path path = Paths.get(filename);

            App app = new App();
            List<Person> persons = app.loadFile(path);
            app.executeTasks(persons);

        } catch (IOException|URISyntaxException  e) {
            e.printStackTrace();
        }
    }

}
