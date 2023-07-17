package EstruturaDados.vetores;

//(u · v) = u₁ * v₁ + u₂ * v₂ + u₃ * v₃
//Recebe dois vetores de mesmo tamanho e retorna um valor que é o produto escalar entre os vetores de entrada.
public class ProdutoEscalar {

    public static void main(String[] args) {

        int[] array01 = new int[3];
        int[] array02 = new int[3];

        array01[0] = 23;
        array01[1] = 78;
        array01[2] = 90;

        array02[0] = 30;
        array02[1] = 22;
        array02[2] = 50;

        System.out.println(produtoEscalar(array01, array02));
    }

    public static int produtoEscalar(int[] vect01, int[] vect02) {
        if (vect01.length != vect02.length) {
            throw new RuntimeException("Atenção os vetores não são do mesmo tamanho! Abortando Operação");
        }
        int produtoEscalar = 0;

        for (int i = 0; i < vect01.length; i++) {
            produtoEscalar += vect01[i] * vect02[i];

        }

        return produtoEscalar;
    }


}
