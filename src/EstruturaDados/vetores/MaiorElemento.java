package EstruturaDados.vetores;

public class MaiorElemento {

    public static void main(String[] args) {

        int[] array01 = new int[3];

        array01[0] = 140;
        array01[1] = 103;
        array01[2] = 120;


        System.out.println(maior(array01));
    }

    private static int maior(int[] array01) {
        int maior = 0;

        for (int value : array01
        ) {
            if (value > maior) {
                maior = value;
            }
        }
        return maior;
    }

}
