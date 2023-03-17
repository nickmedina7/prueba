/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero7;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class VectorReales {

    Reales vector[];
    int totalElementos;

    public VectorReales() {
        vector = new Reales[40];
        totalElementos = 0;
    }

    public boolean agregar(Reales reales) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = reales;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][1];
        String titulos[] = {"Reales"};
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getReal();

        }
        modelo.setDataVector(datos, titulos);
    }

    public void RecursivoBurbuja(Reales v[], int n) {
        
        if (n == 1) return;
        int i, j;
        Reales temp;
        for (i = 0; i < totalElementos; i++) {
            for (j = totalElementos - 1; j > i; j--) {
                if (vector[j].getReal() > vector[j - 1].getReal()) {
                    temp = vector[j];
                    vector[j] = vector[j - 1];
                    vector[j - 1] = temp;
                }
            }
        }
        RecursivoBurbuja(vector, n - 1);
    }

    public void RecursivoBurbuja() {
        RecursivoBurbuja(vector, totalElementos - 1);
    }
}
