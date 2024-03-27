package Test;

class ShellSort {
    public int sort(int array[]) {
        int n = array.length;
        int iter =0;
        for (int hop = n / 2; hop > 0; hop /= 2) {
            iter++;
            for (int i = hop; i < n; i += 1) {
                int temp = array[i];
                int j;
                iter++;
                for (j = i; j >= hop && array[j - hop] > temp; j -= hop) {
                    array[j] = array[j - hop];
                    iter++;
                }
                array[j] = temp;
            }
        }

        return iter;

    }
}
