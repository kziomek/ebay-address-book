package kziomek.gumtree;

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

    public String findOldestPerson(List<Person> persons) {
        return null;
    }

    //TODO
    public int howManyDaysOlderIsBillThanPaul(List<Person> persons){
        return 0;
    }
}
