package ObjetosJogo;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

import entidades.Personagem;

public class Maca extends JFrame{

    BufferedImage imagem;
    Personagem personagem;

    public Maca() {
        ImagemMaca();
    }
    private void ImagemMaca() {

        try {
            imagem = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/maça_comida.png"));

        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
    public boolean ItemExiste = true;
    public boolean ItemExiste2 = true;
    public boolean ItemExiste3 = true;
    public boolean ItemExiste4 = true;
    public boolean ItemExiste5 = true;

    public void DesenharMaca(Graphics graficos2d) {
        if(ItemExiste == true) {
            graficos2d.drawImage(imagem, 300, 300, 16, 25, null);
        }
        if(ItemExiste2 == true) {
            graficos2d.drawImage(imagem, 100, 250, 16, 25, null);
        }
        if(ItemExiste3 == true) {
            graficos2d.drawImage(imagem, 600, 400, 16, 25, null);
        }
        if(ItemExiste4 == true) {
            graficos2d.drawImage(imagem, 815, 230, 16, 25, null);
        }
        if(ItemExiste5 == true) {
            graficos2d.drawImage(imagem, 435, 230, 16, 25, null);
        }
        //caso o ItemExiste seja verdadeiro, a maça será desenhada


    }


}
