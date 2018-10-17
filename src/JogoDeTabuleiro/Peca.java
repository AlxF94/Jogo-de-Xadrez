
package JogoDeTabuleiro;


public class Peca {
    protected Posicao posicao;
    private Tabuleiro tabuleiro;

    public Peca(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        posicao = null; // se eu não coloca-se o null o java por parão colocaria o null?
        
    }
    protected Tabuleiro getTabuleiro() {
        return tabuleiro;
    }
    
}

