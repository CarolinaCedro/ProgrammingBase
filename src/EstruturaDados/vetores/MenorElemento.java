package EstruturaDados.vetores;

import java.util.Arrays;

public class MenorElemento {

    public static void main(String[] args) {

        int[] array01 = new int[3];

        array01[0] = 140;
        array01[1] = 103;
        array01[2] = 30;


        System.out.println(minLambda(array01));
    }

    private static int min(int[] array01) {
        int menor = array01[array01.length - 1];

        for (int value : array01
        ) {
            if (value < menor) {
                menor = value;
            }
        }
        return menor;
    }

    //abordagem usando lambind
    private static int minLambda(int[] array01) {
        return Arrays.stream(array01).min().orElse(0);
    }

}
