public abstract class Jogador {
    protected char simbolo;
    protected String nome;

    public Jogador(char simbolo, String nome) {
        this.simbolo = simbolo;
        this.nome = nome;
    }

    public char getSimbolo() {
        return simbolo;
    }

    public String getNome() {
        return nome;
    }

    public abstract int[] jogar(Tabuleiro tabuleiro);
}