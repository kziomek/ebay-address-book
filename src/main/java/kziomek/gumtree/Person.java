package kziomek.gumtree;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class Person {

    private String name;
    private String gender;
    private LocalDate birthDate;

    public Person(String name, String gender, LocalDate birthDate) {
        this.name = name;
        this.gender = gender;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
