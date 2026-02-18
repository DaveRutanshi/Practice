package Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamIO {
    public static void main(String []args)
    {
        Path path= Paths.get("example.txt");

        //Read File//
        try (Stream<String> lines= Files.lines(path)){
            lines.forEach(System.out::println);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //Filter Data From File
        try (Stream<String> lines=Files.lines(path)){
            List<String> filtereddata=lines.filter(line->line.contains("Java")).map(String::toUpperCase).collect(Collectors.toList());
            filtereddata.forEach(System.out::println);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //Write Data To File
        try {
            Files.write(path, Arrays.asList("Hello Java","Welcome To Java 8 Features"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
