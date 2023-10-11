import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ConvertToStream {

    public static void streamFromArray() {
        String[] languages = {"Java", "Scala", "C++", "Haskell", "Lisp"};
        Stream<String> langs = Arrays.stream(languages);
        langs.forEach(System.out::print);
        System.out.println();
    }

    public static void streamFromCollection() {
        List<String> subjects = List.of("Math", "English", "Physics", "Chemistry");
        subjects.stream().forEach(System.out::print);
        System.out.println();
    }

    public static void main(String[] args) {
        streamFromArray();
        streamFromCollection();
    }
}
