package Principal;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

import javax.swing.JPanel;

import ObjetosJogo.Maca;
import cidade.Cenario;
import entidades.Entidades;
import entidades.Personagem;
//importa a biblioteca JPanel

public class PaineldoJogo extends JPanel implements Runnable {
    /**
     *
     */
    //extends = função para o PaineldoJogo herdar a classe JPanel
    //implements = função para o PaineldoJogo implementar os métodos da biblioteca Runnable
    final int tamanhoRealPersonagemX = 16;
    final int tamanhoRealPersonagemY = 25;
    private final int escalaTamanho = 3;

    public final int tamanhoFinalPersonagemX = tamanhoRealPersonagemX * escalaTamanho;// 48
    public final int tamanhoFinalpersonagemY = tamanhoRealPersonagemY * escalaTamanho;// 75
    //aumenta a escala dos elementos do jogo para que fiquem proporcionais a tela
    public final int MaxTelaCol = 12;
    public final int MaxTelaLin = 12;
    //Semelhante a uma matriz, com linhas e colunas
    //cada posição será um pixel
    public final int alturaTela = tamanhoFinalPersonagemX * MaxTelaCol;// 576
    public final int larguraTela = tamanhoFinalpersonagemY * MaxTelaLin;// 900
    //definição do tamanho da tela de acordo com as medidas do personagem principal
    float personagemVelocidade = 3;
    //velocidade do movimento (quantos pixels ele irá andar por movimento
    int FPS = 200;
    //frames por segundo (quantas vezes o jogo irá se atualizar por segundo)

    Cenario cena = new Cenario(this);
    Thread ThreadJogo;
    //Algo que se pode inciar e parar, utilizado para criar o loop do jogo
    EntradaTeclado teclado = new EntradaTeclado();
    Rectangle AreaC = new Rectangle();
    Personagem personagem = new Personagem(this, teclado);
    Entidades entidade = new Entidades();
    Maca maca = new Maca();




    public PaineldoJogo(){
        this.setPreferredSize(new Dimension(larguraTela, alturaTela));
        //função da biblioteca Dimension para escolher o tamanho preferido da tela
        this.setBackground(Color.BLACK);
        //função para alterar a cor do fundo
        this.addKeyListener(teclado);
        //função para adicionar as entradas do teclado no painel do jogo
        this.setFocusable(true);
        //função para trazer o foco do input do teclado ao painel do jogo


    }

    public void IniciarThreadJogo() {
        ThreadJogo = new Thread(this);
        //this para referenciar uma variável, classe ou parâmetro fora do método
        ThreadJogo.start();
        //irá chamar automaticamente o método run quando for iniciado

    }

    @Override
    public void run() {
        double IntervaloDoDesenho = 1000000000/FPS;
        //1 bilhão de nanosegundos equivalem a 1 segundo
        //por isso, se torna mais preciso do que utilizar milissegundos (1000 milissegundos equivalem a 1 segundo)
        double ProximoDesenho = System.nanoTime();
        //o próximo desenho será feito partindo do tempo do desenho atual (System.nanoTime()) + o Intervalo do desenho
        while(ThreadJogo != null) {


            atualizar();
            //método utilizado para atualizar a tela
            repaint();
            //método utilizado para repintar a tela cada vez que houver uma atualização



            try {
                double TempoRestante = ProximoDesenho - System.nanoTime();
                //essa variável calcula o tempo restante até que o proximo desenho seja feito na tela
                TempoRestante = TempoRestante/1000000;
                //A função sleep utiliza especificamente milissegundos, portanto é preciso converter o tempo restante para nano segundos novamente
                Thread.sleep((long)TempoRestante);
                ProximoDesenho += IntervaloDoDesenho;
                //função para o Thread "dormir", ou seja, não ser utilizado enquanto houver tempo restante após o ultimo desenho ser feito
            } catch (InterruptedException e) {
                e.printStackTrace();
                //try catch é utilizado para identificar erros, o try tenta executar uma ação e o catch mostra o erro, caso aconteça.
            }
        }
    }



    public void atualizar(){
        personagem.atualizar();
        //chama o método atualizar da classe Personagem
        ColisaoPersonagemItem();
        DesenharMacaDeNovo();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //o comando super. chama a super classe (classe pai) e chama a função paintComponent
        //a função paintComponent é utilizada para utilizar outras funções mais específicas
        Graphics2D graficos2d = (Graphics2D)g;

        cena.DesenharCenario(graficos2d);
        maca.DesenharMaca(graficos2d);

        personagem.desenhar(graficos2d);
        //chama o método desenhar da classe Personagem


    }
    public void ColisaoPersonagemItem() {
        if(personagem.AreaColisaoPersonagem.intersects(personagem.AreaColisaoMaca)) {
            maca.ItemExiste = false;
        }
        if(personagem.AreaColisaoPersonagem.intersects(personagem.AreaColisaoMaca2)) {
            maca.ItemExiste2 = false;
        }
        if(personagem.AreaColisaoPersonagem.intersects(personagem.AreaColisaoMaca3)) {
            maca.ItemExiste3 = false;
        }
        if(personagem.AreaColisaoPersonagem.intersects(personagem.AreaColisaoMaca4)) {
            maca.ItemExiste4 = false;
        }
        if(personagem.AreaColisaoPersonagem.intersects(personagem.AreaColisaoMaca5)) {
            maca.ItemExiste5 = false;
        }
        //sempre que o personagem colidir com uma maça ela irá sumir

    }
    public void DesenharMacaDeNovo() {
        if(maca.ItemExiste == false && maca.ItemExiste2 == false && maca.ItemExiste3 == false
                && maca.ItemExiste4 == false && maca.ItemExiste5 == false) {
            maca.ItemExiste = true; maca.ItemExiste2 = true;
            maca.ItemExiste3 = true; maca.ItemExiste4 = true;
            maca.ItemExiste4 = true; maca.ItemExiste5 = true;

        }
        //quando todas as maças sumirem, este metódo irá desenha-las novamente
    }




}
