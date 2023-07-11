package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
 * App.
 */
public class App {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
//    String option = menu(scanner);
    System.out.println("Digite a quantidade de atividades para cadastrar: ");
    String quantity = scanner.nextLine();
    int value = Integer.parseInt(quantity);
    for (int index = 1; index <= value; index += 1) {
      System.out.println("Digite o nome da atividade " + index + ":");
      String activity = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + index + ":");
      int peso = Integer.parseInt(scanner.nextLine());
    }
  }
}