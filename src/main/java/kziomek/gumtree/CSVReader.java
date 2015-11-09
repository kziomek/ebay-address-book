package kziomek.gumtree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class CSVReader {

    private static final String SEPARATOR = ",";

    public List<Person> readPeopleCSV(Path path) throws IOException {
        return Files.lines(path)
                .map(mapToPerson)
                .collect(Collectors.toList());
    }

    private Function<String, Person> mapToPerson = (line) -> {
        List<String> personLine = Arrays.asList(line.split(SEPARATOR));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yy");
        return new Person(personLine.get(0).trim(), personLine.get(1).trim(), LocalDate.parse(personLine.get(2).trim(), formatter));
    };
}
