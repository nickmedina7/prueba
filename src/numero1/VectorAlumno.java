/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero1;

import javax.swing.table.DefaultTableModel;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class VectorAlumno {

    Alumno vector[];
    int totalElementos;

    public VectorAlumno() {
        vector = new Alumno[50];
        totalElementos = 0;
    }

    public boolean agregarAlumno(Alumno alumno) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = alumno;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public void mostrar(DefaultTableModel modelo) {

        Object datos[][] = new Object[totalElementos][2];
        String titulos[] = {"ALUMNO", "NOTA"};
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getPromedio();
        }
        modelo.setDataVector(datos, titulos);

    }

    public void mostrarTercio(DefaultTableModel modelo2) {

        Object datos[][] = new Object[totalElementos / 3][2];
        String titulos[] = {"ALUMNO", "NOTA"};
        for (int i = 0; i < totalElementos / 3; i++) {
            datos[i][0] = vector[i].getNombre();
            datos[i][1] = vector[i].getPromedio();
        }
        modelo2.setDataVector(datos, titulos);

    }

    public void seleccion() {
        seleccion(vector, totalElementos);

    }

    private void seleccion(Alumno vector[], int n) {
        int indice_menor, i, j;
        Alumno temp;
        for (i = 0; i < n - 1; i++) {
            indice_menor = i;
            for (j = i + 1; j < n; j++) {
                if (vector[j].getPromedio() > (vector[indice_menor].getPromedio())) {
                    indice_menor = j;
                }
            }
            temp = vector[i];
            vector[i] = vector[indice_menor];
            vector[indice_menor] = temp;
        }
    }
    
    public void seleccionRecursiva() {
        seleccionRecursiva(vector, totalElementos,0);

    }



    private void seleccionRecursiva(Alumno vector[],int n,int i){
       int indice_menor, j;
       Alumno temp;
         if (i<n-1) {
             indice_menor = i;
            for (j = i + 1; j < n; j++) {
                if (vector[j].getPromedio() > (vector[indice_menor].getPromedio())) {
                    indice_menor = j;
                }
            }
            temp = vector[i];
            vector[i] = vector[indice_menor];
            vector[indice_menor] = temp;


           seleccionRecursiva(vector,n,i+1);
         }
     } 


}