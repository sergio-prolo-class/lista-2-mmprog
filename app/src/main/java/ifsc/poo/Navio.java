package ifsc.poo;

import edu.princeton.cs.algs4.Draw;

import java.awt.*;


    // Construdor
    public class Navio {
        private final Grade grade;
        private final int tamanho;
        private final int xGrade;
        private final int yGrade;
        private final boolean vertical;
        private final Color cor;
        private Draw draw;


        private static void getInstance() {
            return ;
        }


        public Navio(Grade grade, int tamanho, int x, int y, boolean vertical) {
            this.grade = grade;
            this.tamanho = tamanho;
            this.xGrade = x;
            this.yGrade = y;
            this.vertical = vertical;
            this.cor = Color.RED;
        }

        Object desenhar(Draw draw) {
            draw.setPenColor(cor);
            int xReal = grade.xGrade;
            int yReal = grade.yGrade;

            for (int i = 0; i < tamanho; i++) {
                if (vertical) {
                    draw.filledSquare(xReal, yReal + i * grade.getCelulaTamanho(), grade.getCelulaTamanho() / 2);
                }
            }

            // Getters (necessários para Grade)
            Grade getGrade;
            ;
            {
                return grade;
            }


        }
    }