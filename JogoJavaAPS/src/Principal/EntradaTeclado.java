package Principal;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class EntradaTeclado implements KeyListener {
    //implementa a interface KeyListener, que recebe inputs do teclado
    public boolean cima, baixo, direita, esquerda;

    @Override
    public void keyTyped(KeyEvent e) {



    }

    @Override
    public void keyPressed(KeyEvent e) {
        //método que identifica se a tecla foi pressionada ou não
        int direcao = e.getKeyCode();
        //variável que recebe getKeyCode (função que recebe um código que identifica a tecla presssionada)

        switch(direcao) {
            case(KeyEvent.VK_W):
                cima = true;
                break;
            case(KeyEvent.VK_S):
                baixo = true;
                break;
            case(KeyEvent.VK_A):
                esquerda = true;
                break;
            case(KeyEvent.VK_D):
                direita = true;
                break;
            //haverá movimento caso a tecla estiver pressionada, portanto todas serão verdadeiras

        }


    }

    @Override
    public void keyReleased(KeyEvent e) {
        //método que identifica se a tecla foi "solta" ou não

        int direcao = e.getKeyCode();

        switch(direcao) {
            case(KeyEvent.VK_W):
                cima = false;
                break;
            case(KeyEvent.VK_S):
                baixo = false;
                break;
            case(KeyEvent.VK_A):
                esquerda = false;
                break;
            case(KeyEvent.VK_D):
                direita = false;
                break;
            //não haverá movimento porque a tecla foi "solta", portanto todos serão falsas

        }
    }

}
