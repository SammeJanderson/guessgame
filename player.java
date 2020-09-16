public class player {
  int number = 0; //onde entra o palote

  public void guess() {
    number = (int) (Math.random() * 10);
    System.out.println("Estou pensando em " + number);
  }
}
