import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        System.out.println("Задача №1");
        //Первый массив
        int[] numberOne = new int[3];
        numberOne[0] = 1;
        numberOne[1] = 2;
        numberOne[2] = 3;
        for (int i = 0; i < numberOne.length; i++) {

        }
        //Второй массив
        double[] numberTwo = {1.57, 7.654, 9.986};
        //Третий массив
        int[] mounth = new int[2];
        mounth[0] = 56;
        mounth[1] = 324;
        for (int i = 0; i < mounth.length; i++) {

        }

        System.out.println("Задача №2");
        //Первый массив
        for (int i = 0; i < numberOne.length; i++) {
            if (i == numberOne.length - 1) {
                System.out.print(numberOne[i] + " ");
            } else {
                System.out.print(numberOne[i] + ",");
            }

        }

        System.out.println();

        //Второй Массив
        for (int i = 0; i < numberTwo.length; i++) {
            if (i == numberOne.length - 1) {
                System.out.print(numberTwo[i] + " ");
            } else {
                System.out.print(numberTwo[i] + ",");
            }

        }

        System.out.println();

        //Третий массив
        for (int i = 0; i < mounth.length; i++) {
            if (i == mounth.length - 1) {
                System.out.print(mounth[i] + " ");
            } else {
                System.out.print(mounth[i] + ",");
            }

        }

        System.out.println();

        System.out.println("Задача №3");
        //Первый массив
        for (int i = numberOne.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numberOne[i] + " ");
            } else {
                System.out.print(numberOne[i] + ",");
            }

        }

        System.out.println();

        //Второй Массив
        for (int i = numberTwo.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(numberTwo[i] + " ");
            } else {
                System.out.print(numberTwo[i] + ",");
            }

        }

        System.out.println();

        //Третий массив
        for (int i = mounth.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.print(mounth[i] + " ");
            } else {
                System.out.print(mounth[i] + ",");
            }
        }

        System.out.println();

        System.out.println("Задача №4");
        //Первый массив
        for (int i = 0; i < numberOne.length; i++) {
            if (numberOne[i] % 2 != 0) {
                numberOne[i] += 1;
            }
        } System.out.print(Arrays.toString(numberOne));


    }
}