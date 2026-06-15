import java.util.Scanner;

public class JogadorHumano extends Jogador {

    private Scanner scanner = new Scanner(System.in);

    public JogadorHumano(char simbolo, String nome) {
        super(simbolo, nome);
    }

    @Override
    public int[] jogar(Tabuleiro tabuleiro) {
        System.out.print("Linha: ");
        int linha = scanner.nextInt();

        System.out.print("Coluna: ");
        int coluna = scanner.nextInt();

        return new int[]{linha, coluna};
    }
}