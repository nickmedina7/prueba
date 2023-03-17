/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero5;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class VectorNumero {
    private Datos vector[];
    private int totalElementos;
    
    
    public VectorNumero(){
        vector= new Datos[50];
        totalElementos=0;
    }
    public boolean agregarNumero(Datos numero){
        if(totalElementos<vector.length){
            vector[totalElementos]=numero;
            totalElementos++;
            return true;
        }
        else
            return false;
    }
    public void mostrar( DefaultTableModel modelo){
        Object dato[][]=new Object[totalElementos][1];
        String titulos[] ={"DATOS"};
        for(int i=0; i<totalElementos; i++){
            dato[i][0]=vector[i].getNumero();
            
        }
        modelo.setDataVector(dato, titulos);
        
        
    }
     public void ordenamientoQuickSortNota(Datos v[], int left, int right){
        int i=left, j=right;
        Datos x, temp;
        x = v[(left+right)/2];
        
        do{
            while(vector[i].getNumero()<x.getNumero() && i<right) i++;
            while(vector[j].getNumero()>x.getNumero() && j>left) j--;
            if(i<=j){
                temp = vector[i];
                vector[i]=vector[j];
                vector[j]= temp;
                i++;
                j--;
            }
        } while(i<=j);
        if(i<right) ordenamientoQuickSortNota(v,i,right);
        if(left<j) ordenamientoQuickSortNota(v,left,j);
    }
    
    public void ordenamientoQuickSortNota(){
        ordenamientoQuickSortNota(vector,0,totalElementos-1);
    }
   public Double calcularMediana() {
        if (totalElementos % 2 != 0) {
            return vector[totalElementos / 2].getNumero();
        } else {
            return (vector[(totalElementos / 2) - 1].getNumero() + vector[(totalElementos / 2)].getNumero()) / 2;
        }

    }
    
    
    
    
    
    
}
