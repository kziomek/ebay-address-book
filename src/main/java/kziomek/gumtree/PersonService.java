package kziomek.gumtree;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class PersonService {

    public static final String GENDER_MALE = "Male";

    public static final String NAME_BILL = "Bill";
    public static final String NAME_PAUL = "Paul";

    public long countMales(List<Person> persons) {
        return persons.stream().filter(p -> GENDER_MALE.equals(p.getGender())).count();
    }

    public Person findOldestPerson(List<Person> persons) {
        persons.sort((p1, p2) -> p1.getBirthDate().compareTo(p2.getBirthDate()));
        return persons.get(0);
    }

    //TODO
    public int howManyDaysOlderIsBillThanPaul(List<Person> persons){
        return 0;
    }
}
