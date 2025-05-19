package org.example;

import java.util.ArrayList;

public class Solution {
    public boolean isPalindrome(int x) {
        // Si el número es negativo, no puede ser palíndromo
        if (x < 0) return false;

        // Guardamos el valor original para comparación posterior
        int original = x;

        // Variable para almacenar el número invertido
        int inversion = 0;

        // Mientras queden dígitos por procesar
        while (x > 0) {
            // Paso 1: Obtener el último dígito de x (x % 10)
            // Paso 2: Agregar el dígito al número invertido (inversion * 10 + dígito)
            inversion = inversion * 10 + (x % 10);

            // Paso 3: Eliminar el último dígito de x (x / 10)
            x /= 10;
        }

        // Comparar el número original con su versión invertida
        // Si son iguales, es palíndromo (true), sino false
        return original == inversion;
    }
}
