
package JogoDeTabuleiro;


public class Tabuleiro {
  
    private int linhas;
    private int colunas;
    private Peca[][] Pecas;

    public Tabuleiro(int Linhas, int Colunas) {
        this.linhas = Linhas;
        this.colunas = Colunas;
        Pecas = new Peca[linhas][colunas]; // dentro dos vetores estão sendo chamados a quantidade de linhas e do colunas do tabuleiro. 
        
}

    public int getLinhas() {
        return linhas;
    }

    public void setLinhas(int linhas) {
        this.linhas = linhas;
    }

    public int getColunas() {
        return colunas;
    }

    public void setColunas(int colunas) {
        this.colunas = colunas;
    }
}