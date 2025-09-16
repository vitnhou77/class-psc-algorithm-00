/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

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