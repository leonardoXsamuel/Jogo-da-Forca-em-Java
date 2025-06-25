package secao14;

import java.util.Scanner;

public class jogoDaForca_v2 {

    public static void main(String[] args) {
        Scanner lerEnt = new Scanner(System.in);

        System.out.println("Digite uma palavra para seu adversário adivinhar: ");
        String palavraSecreta = lerEnt.nextLine().toUpperCase();
        int maxTentativas = 3;  
        boolean venceu = false;
        char[] palavraOculta = new char[palavraSecreta.length()];

        for (int i = 0; i < palavraOculta.length; i++) {
            palavraOculta[i] = '_';
        }

        while (maxTentativas > 0) {
            boolean acertou = false;

            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + maxTentativas);

            System.out.print("Digite uma letra: ");
            char letra = lerEnt.next().toUpperCase().charAt(0);
            

            for (int i = 0; i < palavraSecreta.length(); i++) {
                if (palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                maxTentativas--;
                System.out.println("Letra incorreta.");
                System.out.println();
            } else {
                System.out.println("Letra correta.");
                System.out.println();
            }

            if (String.valueOf(palavraOculta).equals(palavraSecreta)) {
                venceu = true;
                break;
            }
        }

        if (venceu) {
            System.out.println("Parabéns, você venceu! A palavra era: " + palavraSecreta);
        } else {
            System.out.println("Você perdeu! A palavra era: " + palavraSecreta);
        }

        lerEnt.close();
    }
}
