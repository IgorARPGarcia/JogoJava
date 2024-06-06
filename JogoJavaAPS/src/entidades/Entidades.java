package entidades;



import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import Principal.PaineldoJogo;

public class Entidades {
    PaineldoJogo pdj;
    public int x, y, largura, altura;
    public int velocidade;

    public BufferedImage frente, frente1, frente2, costas, costas1, costas2, direita, direita1, direita2, esquerda, esquerda1, esquerda2;
    //biblioteca que permite acessar as imagens que serão colocadas no jogo
    public static String direcao;
    //variavel do tipo string para relacionar cada varivel BufferedImage a uma direcao diferente
    public int contadorPersonagem = 0;
    public int numeroPersonagem = 1;
    public Rectangle AreaColisaoPersonagem,  AreaColisaoTelaEsquerda, AreaColisaoMaca, AreaColisaoMaca2,
            AreaColisaoMaca3, AreaColisaoMaca4, AreaColisaoMaca5, AreaColisaoMaca6, AreaColisaoMaca7, AreaColisaoTelaDireita, AreaColisaoPredios, AreaColisaoRua, AreaColisaoMapa,
            AreaColisaoLixeiras, AreaColisaoLixeiras2;
    //importa a biblioteca retangulo para criar um retangulo invisivel em volta do personagem
    public boolean ColisaoLigada;



    public Entidades() {
        IniciarColisao();
        x = 0;
        y = 0;


    }


    private void IniciarColisao(){
        //método para iniciar a colisao
        AreaColisaoPersonagem = new Rectangle(x, y, largura, altura);
        AreaColisaoPersonagem.width = 40;
        AreaColisaoPersonagem.height = 58;

        largura = AreaColisaoPersonagem.width;
        altura = AreaColisaoPersonagem.height;

        AreaColisaoPredios = new Rectangle(x, y, largura, altura);
        AreaColisaoPredios.x = 0;
        AreaColisaoPredios.y = -15;
        AreaColisaoPredios.width = 1000;
        AreaColisaoPredios.height = 170;

        AreaColisaoRua = new Rectangle(x, y, largura, altura);
        AreaColisaoRua.x = 0;
        AreaColisaoRua.y = 427;
        AreaColisaoRua.width = 1000;
        AreaColisaoRua.height = 200;

        AreaColisaoLixeiras = new Rectangle(x, y, largura, altura);
        AreaColisaoLixeiras.x = 300;
        AreaColisaoLixeiras.y = 100;
        AreaColisaoLixeiras.width = 110;
        AreaColisaoLixeiras.height = 100;

        AreaColisaoLixeiras2 = new Rectangle(x, y, largura, altura);
        AreaColisaoLixeiras2.x = 600;
        AreaColisaoLixeiras2.y = 100;
        AreaColisaoLixeiras2.width = 110;
        AreaColisaoLixeiras2.height = 100;

        AreaColisaoTelaEsquerda = new Rectangle(x, y, largura, altura);
        AreaColisaoTelaEsquerda.x = 900;
        AreaColisaoTelaEsquerda.y = 0;
        AreaColisaoTelaEsquerda.width = 10;
        AreaColisaoTelaEsquerda.height = 576;

        AreaColisaoTelaDireita = new Rectangle(x, y, largura, altura);
        AreaColisaoTelaDireita.x = 0;
        AreaColisaoTelaDireita.y = 0;
        AreaColisaoTelaDireita.width = 1;
        AreaColisaoTelaDireita.height = 576;

        AreaColisaoMaca = new Rectangle(x, y, largura, altura);
        AreaColisaoMaca.x = 300;
        AreaColisaoMaca.y = 300;
        AreaColisaoMaca.width = 16;
        AreaColisaoMaca.height = 25;

        AreaColisaoMaca2 = new Rectangle(x, y, largura, altura);
        AreaColisaoMaca2.x = 100;
        AreaColisaoMaca2.y = 250;
        AreaColisaoMaca2.width = 16;
        AreaColisaoMaca2.height = 25;

        AreaColisaoMaca3 = new Rectangle(x, y, largura, altura);
        AreaColisaoMaca3.x = 600;
        AreaColisaoMaca3.y = 400;
        AreaColisaoMaca3.width = 16;
        AreaColisaoMaca3.height = 25;

        AreaColisaoMaca4 = new Rectangle(x, y, largura, altura);
        AreaColisaoMaca4.x = 815;
        AreaColisaoMaca4.y = 230;
        AreaColisaoMaca4.width = 16;
        AreaColisaoMaca4.height = 25;

        AreaColisaoMaca5 = new Rectangle(x, y, largura, altura);
        AreaColisaoMaca5.x = 435;
        AreaColisaoMaca5.y = 230;
        AreaColisaoMaca5.width = 16;
        AreaColisaoMaca5.height = 25;
        //cada objeto novo criado é um retangulo novo para criar uma "zona" de colisao nos objetos do cenario

    }


    public void DesenharColisao(Graphics g){
        //g.setColor(Color.PINK);
        //g.drawRect(AreaColisaoPersonagem.x, AreaColisaoPersonagem.y, largura, altura);
        //g.setColor(Color.BLUE);
        //g.drawRect(AreaColisaoPredios.x, AreaColisaoPredios.y, AreaColisaoPredios.width, AreaColisaoPredios.height);
        //g.setColor(Color.GREEN);
        //g.drawRect(AreaColisaoRua.x, AreaColisaoRua.y, AreaColisaoRua.width, AreaColisaoRua.height);
        //g.setColor(Color.ORANGE);
        //g.drawRect(AreaColisaoLixeiras.x, AreaColisaoLixeiras.y, AreaColisaoLixeiras.width, AreaColisaoLixeiras.height);
        //g.setColor(Color.ORANGE);
        //g.drawRect(AreaColisaoLixeiras2.x, AreaColisaoLixeiras2.y, AreaColisaoLixeiras.width, AreaColisaoLixeiras.height);
        //g.setColor(Color.magenta);
        //g.drawRect( AreaColisaoTelaDireita.x,  AreaColisaoTelaDireita.y, AreaColisaoTelaDireita.width, AreaColisaoTelaDireita.height);
        //g.setColor(Color.magenta);
        //g.drawRect(AreaColisaoTelaEsquerda.x, AreaColisaoTelaEsquerda.y, AreaColisaoTelaEsquerda.width, AreaColisaoTelaEsquerda.height);

        //g.setColor(Color.RED);
        //g.drawRect(AreaColisaoMaca.x, AreaColisaoMaca.y, AreaColisaoMaca.width, AreaColisaoMaca.height);

        //g.setColor(Color.RED);
        //g.drawRect(AreaColisaoMaca2.x, AreaColisaoMaca2.y, AreaColisaoMaca2.width, AreaColisaoMaca2.height);

        //g.setColor(Color.RED);
        //g.drawRect(AreaColisaoMaca3.x, AreaColisaoMaca3.y, AreaColisaoMaca3.width, AreaColisaoMaca3.height);

    }

    public void AtualizarColisao(){
        AreaColisaoPersonagem.x = this.x;
        AreaColisaoPersonagem.y = this.y;

    }

}
