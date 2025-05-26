package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

public class etapa4 {
    

    public static class App {
        public void draw() {
        }

        private Draw draw;

        public App() {
            draw = new Draw();
            // Configurações iniciais...
        }

        private void criarCenario() {
            Grade gradeJogador = new Grade(50, 50);
            Grade gradeInimigo = new Grade(600, 50);

            // Navios do jogador (exemplo)
            Navio[] navios = {
                    new Navio(gradeJogador, 5, 3, 2, true),   // Navio vertical tamanho 5
                    new Navio(gradeJogador, 4, 7, 5, false),   // Navio horizontal tamanho 4
                    // Adicione mais 3 navios conforme a Figura 3
            };

            gradeJogador.desenhar(draw);
            gradeInimigo.desenhar(draw);
            for (Navio navio : navios) {
                navio.desenhar(draw);
            }
        }

        public void main(String[] args) {
            App app = new App();
            app.criarCenario();
            app.draw.show();
        }
    }
}
