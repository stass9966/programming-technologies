public class Math {
    int min(int[] source) {
        var result = source[0];
        for (int i : source) {
            var current = source[i];
            if (current < result) {
                result = current;
            }
        }
        return result;
    }
}
