import java.util.Collections;
import java.util.List;

public class ShellSort {
    void shell_sort(List<Integer> array) {
        for (int s = array.size() / 2; s > 0; s /= 2)
            for (int i = s; i < array.size(); ++i)
                for (int j = i - s; j >= 0 && array.get(j) > array.get(j + s); j -= s) {
                    Collections.swap(array, j, j + s);
                };
    }
}
