package Test;
import java.io.*;
import java.util.Arrays;

public class SortingDemo {

    public static void main(String args[]) throws IOException {

        ShellSort shell = new ShellSort();
        File file = new File("E:\\IDE\\Lab\\DataForShell.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));

        System.out.println(br.readLine()); //строка с описанием массивов
        System.out.println();

        FileWriter fileIter = new FileWriter("E:\\IDE\\Lab\\DataIter.txt", false);//запись итераций в файл
        fileIter.write("0" + '\n');
        FileWriter fileTime = new FileWriter("E:\\IDE\\Lab\\DataTime.txt", false);//запись времени в файл
        fileTime.write("0" + '\n');




        for (int i = 0; i < Data.getCountOfArrays(); i++) {
            String data = br.readLine();
            System.out.println("Initial array: " + data);

            int[] intArray =  Arrays.stream(data.split(" ")).mapToInt(Integer::parseInt).toArray();

            double startTime = System.nanoTime();
            int iteration = shell.sort(intArray);
            double endTime = System.nanoTime();
            double duration = (endTime - startTime) / 1000000;

            fileTime.write(String.format("%.3f",duration) +'\n');
            fileIter.write("" + iteration+'\n');

            System.out.println("Resulting array:" + Arrays.toString(intArray));
            System.out.println("Execution time, ms: " + duration);
            System.out.println("Count of iterations: " + iteration);
            System.out.println();

        }
        fileIter.flush();
        fileTime.flush();


    }




}