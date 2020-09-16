public class GuessGame{
    //guess game tem três variaveis de instancias para o trÊs objetos jogador
    player p1;
    player p2;
    player p3;

    //cria trÊs objetos jogadoe e a eles atribui as três insancias player
  public void startGame() {
    p1 = new player();
    p2 = new player();
    p3 = new player();

    //declara as variaveis para armazenar os palpites dos jogadores
    int guessp1 = 0;
    int guessp2 = 0;
    int guessp3 = 0;

    //declara uma variavel para armazenar se a resposta do jogador é verdadeira ou falsa
    boolean p1isRight = false;
    boolean p2isRight = false;
    boolean p3isRight = false;

    //cria um numero alvo que o jogador deverá advinhar.
    int targetNumber = (int) (Math.random() * 10);
    System.out.println("Estou pensando em um numero entre 0 e 9...");

    while(true) {
      System.out.println("o numero a advinhar é" + targetNumber);

      // chama o metodo guess() de cada jogador
      p1.guess();
      p2.guess();
      p3.guess();

      guessp1 = p1.number;
      System.out.println("O jogador um forneceu o palpite " + guessp1);
      guessp2 = p2.number;
      System.out.println("O jogador dois forneceu o palpite " + guessp2);
      guessp3 = p3.number;
      System.out.println("O jogador três forneceu o palpite " + guessp3);

      if (guessp1 == targetNumber){
        p1isRight = true;
      }
      if (guessp2 == targetNumber){
        p2isRight = true;
      }
      if (guessp3 == targetNumber){
        p3isRight = true;
      }

      if (p1isRight || p2isRight || p3isRight) {

        System.out.println("Temos um vencedor");
        System.out.println("O jagor um acertou?" + p1isRight);
        System.out.println("o jagodor dois acertou?" + p2isRight);
        System.out.println("o jogador três acertou?" + p3isRight);
        System.out.println("fim do jogo.");
        break; //fim do jogo, portanto saia do jogo
      } else { //niguem acertou o jogo continua
        System.out.println("Os jogadores vão tentar novamente");
      }

    }


    }

  }
