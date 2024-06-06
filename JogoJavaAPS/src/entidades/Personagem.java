package entidades;


import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import ObjetosJogo.Maca;
import Principal.EntradaTeclado;
import Principal.PaineldoJogo;

public class Personagem extends Entidades{
    PaineldoJogo pdj;
    EntradaTeclado ett;
    //variavei para importar classes de outro pacote
    Entidades entidade = new Entidades();
    Graphics graficos2d;
    Maca maca = new Maca();


    public Personagem(PaineldoJogo pdj, EntradaTeclado ett){
        this.pdj = pdj;
        this.ett = ett;


        ValoresPadroes();
        atualizar();
        ImagensPersonagem();







    }





    public void ValoresPadroes(){
        x = 250;
        y = 250;
        velocidade = 2;

        direcao = "frente";

    }


    public void ImagensPersonagem() {
        try {
            frente = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/personagem_frente.png"));
            frente1 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/andando_frente_1.png"));
            frente2 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/andando_frente_2.png"));
            costas = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/personagem_costas.png"));
            costas1 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/andando_costas_1.png"));
            costas2 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/andando_costas_2.png"));
            direita = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/personagem_direita.png"));
            direita1 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/direita_andando_1.png"));
            direita2 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/direita_andando_2.png"));
            esquerda = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/personagem_esquerda.png"));
            esquerda1 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/esquerda_andando_1.png"));
            esquerda2 = ImageIO.read(getClass().getResourceAsStream("/ImagensJogo/esquerda_andando_2.png"));

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public void atualizar() {
        AtualizarColisao();

        if (ett.cima || ett.baixo || ett.direita || ett.esquerda) {
            //a animação só acontecerá caso o personagem se mova
            if (ett.cima) {
                direcao = "costas";
            } else if (ett.baixo) {
                direcao = "frente";
            } else if (ett.direita) {
                direcao = "direita";
            } else if (ett.esquerda) {
                direcao = "esquerda";
            }

            //variaveis para calcular a próxima posição do personagem
            int proximaX = x;
            int proximaY = y;
            switch(direcao) {
                case "costas":
                    proximaY -= velocidade;
                    break;
                case "frente":
                    proximaY += velocidade;
                    break;
                case "direita":
                    proximaX += velocidade;
                    break;
                case "esquerda":
                    proximaX -= velocidade;
                    break;
            }

            //para conferir se haverá colisão na próxima posição
            Rectangle proximaPosicao = new Rectangle(proximaX, proximaY, largura, altura);
            boolean ColisaoProximaPosicao = false;
            if (proximaPosicao.intersects(AreaColisaoPredios) || proximaPosicao.intersects(AreaColisaoTelaEsquerda) ||
                    proximaPosicao.intersects(AreaColisaoTelaDireita) ||
                    proximaPosicao.intersects(AreaColisaoRua)) {
                ColisaoProximaPosicao = true;
            }

            //só permite mover o personagem se não houver colisão
            if (ColisaoProximaPosicao == false) {
                x = proximaX;
                y = proximaY;
            }
            //caso a colisao seja falsa o x e o y recebem os resultados da posicao proximaX e proximaY

            contadorPersonagem++;
            if (contadorPersonagem > 60) {
                // Velocidade da animação
                if (numeroPersonagem == 1) {
                    numeroPersonagem = 2;
                } else if (numeroPersonagem == 2) {
                    numeroPersonagem = 3;
                } else if (numeroPersonagem == 3) {
                    numeroPersonagem = 1;
                }
                contadorPersonagem = 0;
            }
        }
    }


    public void desenhar(Graphics graficos2d) {
        //Graphics2D é uma classe que herda da superclasse Graphics e permite um controle mais específico em relação a parte 2d dos gráficos

        BufferedImage imagem = null;

        switch(direcao) {
            case "costas":
                if(numeroPersonagem == 1) {
                    imagem = costas;
                }
                else if(numeroPersonagem == 2) {
                    imagem = costas1;
                }
                else if(numeroPersonagem == 3) {
                    imagem = costas2;
                }
                break;
            case "frente":
                if(numeroPersonagem == 1) {
                    imagem = frente;
                }
                else if(numeroPersonagem == 2) {
                    imagem = frente1;
                }
                else if(numeroPersonagem == 3) {
                    imagem = frente2;
                }
                break;
            case "direita":
                if(numeroPersonagem == 1) {
                    imagem = direita;
                }
                else if(numeroPersonagem == 2) {
                    imagem = direita1;
                }
                else if(numeroPersonagem == 3) {
                    imagem = direita2;
                }
                break;
            case "esquerda":
                if(numeroPersonagem == 1) {
                    imagem = esquerda;
                }
                else if(numeroPersonagem == 2) {
                    imagem = esquerda1;
                }
                else if(numeroPersonagem == 3) {
                    imagem = esquerda2;
                }
                break;
        }

        graficos2d.drawImage(imagem, x, y, pdj.tamanhoFinalPersonagemX, pdj.tamanhoFinalpersonagemY, null);
        DesenharColisao(graficos2d);



    }
}
