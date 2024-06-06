package cidade;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import Principal.PaineldoJogo;

public class Cenario extends ElementosCenario {
    public PaineldoJogo pdj;
    public int x,y;
    public BufferedImage imagem;




    public Cenario(PaineldoJogo pdj) {
        this.pdj = pdj;


        ImagensCenario();



    }

    public void ImagensCenario() {
        try {


            imagem = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/calçada.png"));

            imagem2 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/rua.png"));

            imagem3 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/prédio_azul.png"));

            imagem4 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/predio_tijolo.png"));

            imagem4_1 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/predio_tijolo_centro.png"));

            imagem4_2 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/predio_tijolo_direita.png"));

            imagem5 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/casa_amarela.png"));

            imagem6 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/maça_comida.png"));

            imagem7 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/lixeira_organica.png"));

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
    public void DesenharCenario(Graphics graficos2d) {






        //graficos2d.drawImage(imagem, 0, 210, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 0, 360,pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 150, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 225, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 300, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 375, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 450, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 525, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 600, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 675, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 750, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 825, 285, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 0, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 75, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 150, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 225, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 300, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 375, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 450, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 525, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 600, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 675, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 750, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        //graficos2d.drawImage(imagem, 825, 144, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);

        graficos2d.drawImage(imagem2, 0, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 75, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 150, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 225, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 300, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 375, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 450, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 525, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 600, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 675, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 750, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);
        graficos2d.drawImage(imagem2, 825, 427, pdj.tamanhoFinalPersonagemX*2, pdj.tamanhoFinalpersonagemY*2, null);







        graficos2d.drawImage(imagem3, 0, -15, pdj.tamanhoFinalPersonagemX*3, pdj.tamanhoFinalpersonagemY*3, null);
        graficos2d.drawImage(imagem3, 135, -15, pdj.tamanhoFinalPersonagemX*3, pdj.tamanhoFinalpersonagemY*3, null);
        graficos2d.drawImage(imagem4, 279, -15, pdj.tamanhoFinalPersonagemX*3, pdj.tamanhoFinalpersonagemY*3, null);
        graficos2d.drawImage(imagem4_1, 420, -15, pdj.tamanhoFinalPersonagemX*3, pdj.tamanhoFinalpersonagemY*3, null);
        graficos2d.drawImage(imagem4_2, 560, -15, pdj.tamanhoFinalPersonagemX*3, pdj.tamanhoFinalpersonagemY*3, null);
        graficos2d.drawImage(imagem5, 680, -15, pdj.tamanhoFinalPersonagemX*3, pdj.tamanhoFinalpersonagemY*3, null);
        graficos2d.drawImage(imagem5, 815, -15, pdj.tamanhoFinalPersonagemX*3, pdj.tamanhoFinalpersonagemY*3, null);


        //graficos2d.drawImage(imagem7, 300, 80, 16*7, 25*7, null);
        //graficos2d.drawImage(imagem7, 600, 80, 16*7, 25*7, null);




    }

}

