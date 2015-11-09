package kziomek.gumtree;

import java.util.Date;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class Person {

    private String name;
    private String gender;
    private Date birthDate;

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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }
}
