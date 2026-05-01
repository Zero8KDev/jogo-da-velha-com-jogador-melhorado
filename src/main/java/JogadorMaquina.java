public class JogadorMaquina { 
    private char simbolo;
    private String nome;

    public JogadorMaquina(char simbolo, String nome) {
        this.simbolo = simbolo;
        this.nome = nome;
    }

    public char getSimbolo() {
        return this.simbolo;
    }

    public String getNome() {
        return this.nome;
    }
}