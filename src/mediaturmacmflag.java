public class mediaturmacmflag {

    public static void main(String[] args) {

        int notaslidas, soma, nota;

        double media;

        soma = 0;

        notaslidas = 0;

        System.out.print("Nota 1: ");

        nota = Integer.parseInt(System.console().readLine());

        while(nota >= 0) {

            soma = soma + nota;

            notaslidas = notaslidas + 1;

            System.out.printf("notas %d: ", notaslidas+1);

            nota = Integer.parseInt(System.console().readLine());
        }

        media = (double) soma / notaslidas;

        System.out.printf("Media de Notas = %.1f\n", media);

    }
}

