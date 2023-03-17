/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero2;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class VectorFrase {

    Frase vector[];
    int totalElementos;

    public VectorFrase() {
        vector = new Frase[50];
        totalElementos = 0;

    }

    public boolean agregarFrase(Frase frase) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = frase;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public void mostrar(DefaultTableModel modelo) {
        Object dato[][] = new Object[totalElementos][1];
        String titulos[] = {"FRASES"};
        for (int i = 0; i < totalElementos; i++) {
            dato[i][0] = vector[i].getFrase();

        }
        modelo.setDataVector(dato, titulos);

    }

    public void ordenamientoShell() {
        Frase temp;
        int i, j;
        int salto = totalElementos / 2;
        while (salto > 0) {
            for (i = salto; i < totalElementos; i++) {
                j = i - salto;
                while (j>=0) {
                    if (vector[j].getFrase().length() > vector[j + salto].getFrase().length()) {
                        temp = vector[j];
                        vector[j] = vector[j + salto];
                        vector[j + salto] = temp;
                        j = j - salto;

                    } else {
                        j = -1;
                    }

                }

            }
            salto = salto / 2;
        }
    }

}
