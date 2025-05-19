package org.example;

public class Main {
    public static void main(String[] args) {
        Solution solucion = new Solution();
        int numero = 5005;
        boolean esPalindromo = solucion.isPalindrome(numero);
        System.out.println("¿El número " + numero + " es palíndromo? " + esPalindromo);
    }
}

