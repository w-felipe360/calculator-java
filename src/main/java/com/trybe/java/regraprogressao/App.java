package com.trybe.java.regraprogressao;

import java.util.Scanner;

/**
   * App.
   */
public class App {
  /**
   * Metodo main.
   */
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite a quantidade de atividades para cadastrar:");
    String quantity = scanner.nextLine();
    int value = Integer.parseInt(quantity);

    for (int index = 1; index <= value; index += 1) {
      System.out.println("Digite o nome da atividade " + index + ":");
      String activity = scanner.nextLine();

      System.out.println("Digite o peso da atividade " + index + ":");
      int height = Integer.parseInt(scanner.nextLine());

      System.out.println("Digite a nota obtida para " + activity + ":");
      String result = scanner.nextLine();
    }
  }
}