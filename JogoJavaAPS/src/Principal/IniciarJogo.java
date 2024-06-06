package Principal;

import javax.swing.JFrame;
//função para importar a biblioteca JFrame
import javax.swing.WindowConstants;

public class IniciarJogo {

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        //criação do objeto janela
        janela.setSize(800, 600);
        //função para escolher o tamanho da janela
        janela.setTitle("Jogo APS");
        //função para escolher o título da janela
        janela.setDefaultCloseOperation(janela.EXIT_ON_CLOSE);
        //função para encerrar a aplicação quando clicar no X
        janela.setResizable(false);
        //função para escolher se a janela pode ou não ser redimensionada
        PaineldoJogo painelJogo = new PaineldoJogo();
        janela.add(painelJogo);
        //função para adicionar o paineldojogo ao void principal (main)
        janela.pack();
        //função que "força" a janela a ser iniciada no tamanho preferido (escolhido na classe PainelJogo)
        janela.setLocationRelativeTo(null);
        //função para escolher o local em que a janela irá aparecer (null = meio da tela)
        janela.setVisible(true);
        //função para decidir se a janela será visível ou não
        painelJogo.IniciarThreadJogo();



    }

}
