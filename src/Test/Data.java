package Test;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Data {



    //задаем количество массивов, максимальный размер массива, верхняя граница, шаг в кол-ве эелементов массива
    private static int countOfArrays = 100; // от 100 элементов до 10000
    private static int arraySizeMax = 10_000;
    private static int apperBound = 10_000;
    private static int hop = 100;

    public static int getCountOfArrays() {
        return countOfArrays;
    }

    public void loading() {
        try {
            FileWriter file = new FileWriter("E:\\IDE\\Lab\\DataForShell.txt", false);
            file.write("Количество наборов: "+ (countOfArrays) +'\t'+ "Максимальный размер массива: " + arraySizeMax +'\t'+ "Шаг в количестве эллементов массивов: " + hop + '\n');

            for (int j = hop; j <= arraySizeMax; j=j+ hop) {
                file.write(arrayRandom(j) + '\n');
            }

            file.flush();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    public String arrayRandom(int arraySize){
        Random random = new Random();
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < arraySize; i++) {
            str.append(random.nextInt(apperBound) + " ");
        }
        return str.toString();
    }

    public static void main(String[] args) {
        Data dataFile = new Data();
        dataFile.loading();
    }

}
