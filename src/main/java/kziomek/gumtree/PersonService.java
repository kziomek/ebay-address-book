package kziomek.gumtree;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class PersonService {

    public static final String GENDER_MALE = "Male";

    public static final String NAME_BILL = "Bill McKnight";
    public static final String NAME_PAUL = "Paul Robinson";

    public long countMales(List<Person> persons) {
        return persons.stream().filter(p -> GENDER_MALE.equals(p.getGender())).count();
    }

    public Person findOldestPerson(List<Person> persons) {
        persons.sort((p1, p2) -> p1.getBirthDate().compareTo(p2.getBirthDate()));
        return persons.get(0);
    }

    public long howManyDaysOlderIsBillThanPaul(List<Person> persons){
        List<Person> billAndPaul = persons.stream()
                .filter(p -> NAME_BILL.equals(p.getName()) || NAME_PAUL.equals(p.getName()))
                .collect(Collectors.toList());

        return countDaysBetweenDates(billAndPaul.get(0).getBirthDate(), billAndPaul.get(1).getBirthDate() );
    }

    protected long countDaysBetweenDates(LocalDate end, LocalDate start) {
        return Math.abs(ChronoUnit.DAYS.between(end, start));
    }
}
