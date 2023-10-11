import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {

    public static void main(String[] args) {
        IntStream.range(1, 5).forEach(System.out::println);

        IntStream.of(1, 2, 5).forEach(System.out::println);

        LongStream.range(1, 9).forEach(System.out::println);
    }
}