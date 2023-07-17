package EstruturaDados.vetores;

//Recebe dois vetores de mesmo tamanho e verifica se eles são idênticos, isto é, se possuem os mesmos elementos nas mesmas posições.

public class VetoresIguais {

    public static void main(String[] args) {

        int[] vetor1 = {1, 2, 3, 4, 5};
        int[] vetor2 = {1, 2, 3, 4, 8};


        System.out.println(vetoresIdenticos(vetor1, vetor2));

    }

    public static boolean vetoresIdenticos(int[] vect01, int[] vect02) {
        if (vect01.length != vect02.length) {
            throw new RuntimeException("Atenção os vetores não são do mesmo tamanho! Abortando Operação");
        }

        for (int i = 0; i < vect01.length; i++) {
            if (!(vect01[i] == vect02[i])) {
                return false;
            }
        }

        return true;
    }


}
