import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringJoinComparison {
    public static void main(String[] args) {
        List<String> courses = new ArrayList<>();
        courses.add("Java");
        courses.add("Advanced Java");
        courses.add("Python");
        courses.add("DSA");
        StringJoin(courses);
        CollectorsJoining(courses);
    }

    private static void StringJoin(List<String> strings){
        long start = System.nanoTime();
        String result = String.join(",", strings);
        System.out.println(result);
        System.out.println("Using String's join() " + (System.nanoTime() - start));
    }

    private static void CollectorsJoining(List<String> strings){
        long start = System.nanoTime();
        String result = strings.stream().collect(Collectors.joining(","));
        System.out.println(result);
        System.out.println("Using Collectors's joining() " + (System.nanoTime() - start));
    }
}