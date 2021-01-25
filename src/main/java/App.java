import java.util.stream.Stream;

public class App {
    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5, 6, 7, 8)
                .filter(i -> i > 3)
                .map(i -> i * 3)
                .forEach(System.out::println);
    }
}
