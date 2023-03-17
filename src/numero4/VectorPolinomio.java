/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero4;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class VectorPolinomio {

    Polinomio vector[];
    int totalElementos;

    public VectorPolinomio() {
        vector = new Polinomio[50];
        totalElementos = 0;

    }

    public boolean agregar(Polinomio polinomio) {
        if (totalElementos < vector.length) {
            vector[totalElementos] = polinomio;
            totalElementos++;
            return true;
        } else {
            return false;
        }
    }

    public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][1];
        String titulos[] = {"POLINOMIO"};
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getCoeficente() + "x^" + vector[i].getExponente();

        }
        modelo.setDataVector(datos, titulos);
    }

    
    
    public void InsercionExponente(){
        int i,j;
        Polinomio temp;
        for(i=1;i<totalElementos;i++){
            temp=vector[i];
            j=i;
            while(j>0 && temp.getExponente()>vector[j-1].getExponente()){
                vector[j]=vector[j-1];
                j--;
            }
            vector[j]=temp;    
        } 
    }

}
