import java.util.Random;

public class JogadorMaquina extends Jogador {

    private Random random = new Random();

    public JogadorMaquina(char simbolo, String nome) {
        super(simbolo, nome);
    }

    @Override
    public int[] jogar(Tabuleiro tabuleiro) {
        int linha;
        int coluna;

        do {
            linha = random.nextInt(3);
            coluna = random.nextInt(3);
        } while (!tabuleiro.posicaoLivre(linha, coluna));

        return new int[]{linha, coluna};
    }
}