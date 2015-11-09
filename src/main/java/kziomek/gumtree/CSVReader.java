package kziomek.gumtree;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author Krzysztof Ziomek
 * @since 09/11/2015.
 */
public class CSVReader {

    public List<Person> readPeopleCSV(Path path) throws IOException {

        Stream<String> lines = Files.lines(path);
        System.out.println(lines.count());

        return new LinkedList<Person>();

    }
}
