/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.torresdehanoi;

/**
 *
 * @author Marcelo
 */
public class TorresDeHanoi {
    
    static long contadorMovimentos = 0;

    static void torresDeHanoi(long n, char origem, char destino, char auxiliar) {
        if (n == 1) {
            contadorMovimentos++;
            return;
        }
        torresDeHanoi(n - 1, origem, auxiliar, destino);
        contadorMovimentos++;
        torresDeHanoi(n - 1, auxiliar, destino, origem);
    }

    public static void main(String args[]) {
        long n = 35;

        long startTime = System.currentTimeMillis();

        torresDeHanoi(n, 'A', 'C', 'B');

        long endTime = System.currentTimeMillis();

        long elapsedTime = endTime - startTime;
        String formattedTime = formatElapsedTime(elapsedTime);

        System.out.println("Quantidade de movimentos: " + contadorMovimentos);
        System.out.println("Tempo gasto: " + formattedTime);
    }

    public static String formatElapsedTime(long elapsedTime) {

        long horas = (elapsedTime / (1000 * 60 * 60)) % 24;
        long minutos = (elapsedTime / (1000 * 60)) % 60;
        long segundos = (elapsedTime / 1000) % 60;
        long milis = elapsedTime % 1000;

        return String.format("%02d:%02d:%02d:%03d", horas, minutos, segundos, milis);
    }
}
