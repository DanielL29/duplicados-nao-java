import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class App {
    public static void main(String[] args) {
        String[] fruitsArray1 = new String[]{"strawberry", "tomato", "apple", "banana", "orange", "blueberry", "grape", "pear"};
        String[] fruitsArray2 = new String[]{"watermelon", "orange", "peach", "melon", "strawberry", "guava", "apple", "banana"};

        List<String> combinedFruits = new ArrayList<>();

        for (int i = 0; i < fruitsArray1.length; i++) {
            for (int j = 0; j < fruitsArray2.length; j++) {
                if (Objects.equals(fruitsArray1[i], fruitsArray2[j])) {
                    combinedFruits.add(fruitsArray1[i]);
                }
            }
        }

        System.out.println(
            "Fruits 1: " + Arrays.toString(fruitsArray1) + 
            "\nFruits 2: " + Arrays.toString(fruitsArray2) + 
            "\n\nEqual fruits: " + combinedFruits
        );
    }
}
