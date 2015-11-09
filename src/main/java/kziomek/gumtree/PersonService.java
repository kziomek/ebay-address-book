package kziomek.gumtree;

import java.util.List;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class PersonService {

    public long countMales(List<Person> persons) {
        return persons.stream().filter(p -> "Male".equals(p.getGender())).count();
    }
}
