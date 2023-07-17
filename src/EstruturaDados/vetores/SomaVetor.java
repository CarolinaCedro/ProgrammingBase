package EstruturaDados.vetores;


//Recebe dois vetores de mesmo tamanho e retorna um novo vetor que é a soma elemento a elemento dos vetores de entrada.

public class SomaVetor {

    public static void main(String[] args) {

        int[] array01 = new int[3];
        int[] array02 = new int[4];

        array01[0] = 23;
        array01[1] = 78;
        array01[2] = 90;

        array02[0] = 23;
        array02[1] = 78;
        array02[2] = 90;


        soma(array01, array02);

    }

    public static void soma(int[] vect01, int[] vect02) {
        if (vect01.length != vect02.length) {
            throw new RuntimeException("Atenção os vetores não são do mesmo tamanho! Abortando Operação");
        }

        int[] vectSoma = new int[vect01.length];

        for (int i = 0; i < vectSoma.length; i++) {
            vectSoma[i] = vect01[i] + vect02[i];
        }

        for (int value : vectSoma
        ) {
            System.out.print(value + " ");
        }
    }


}
