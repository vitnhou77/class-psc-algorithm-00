import java.util.Scanner;

public class Algoritmo {
  public static void main(String[] args) {
    String sala = "A219";
    String salaInformada = "";
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número da sala: ");
    salaInformada = scanner.next().trim();

    if (sala.equalsIgnoreCase(salaInformada)) {
      System.out.println("Você encontrou sua sala");
    } else {
      System.out.println("Você está perdido! \nSe encontre!");
    }

    scanner.close();
  }
}

