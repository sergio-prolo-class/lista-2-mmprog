package ifsc.poo;


import edu.princeton.cs.algs4.Draw;

public class Grade {
    private int xInicial = 10;
    private int yInicial = 10;
    private final int celulaTamanho = 40;
    private final int linhas = 10;
    private final int colunas = 10;
    public int xGrade;
    public int yGrade;

    private Draw draw;

    // Main
    public Grade(int x, int y) {
        this.xInicial = x;
        this.yInicial = y;
    }

    // Construtor
    void desenhar(Draw draw) {
        // Desenha linhas horizontais e verticais
        for (int i = 0; i <= linhas; i++) {
            int y = yInicial + i * celulaTamanho;
            draw.line(xInicial, y, xInicial + colunas * celulaTamanho, y);
        }
        for (int j = 0; j <= colunas; j++) {
            int x = xInicial + j * celulaTamanho;
            draw.line(x, yInicial, x, yInicial + linhas * celulaTamanho);
        }

        // Rótulos das colunas (A-J)
        for (int j = 0; j < colunas; j++) {
            int x = xInicial + j * celulaTamanho + celulaTamanho / 2;

        }

        // Rótulos das linhas (1-10)
        for (int i = 0; i < linhas; i++) {
            int y = yInicial + i * celulaTamanho + celulaTamanho / 2;
            draw.text(xInicial - 15, y, String.valueOf(i + 1));
        }
    }

    public double getCelulaTamanho() {

        return 0;
    }
}