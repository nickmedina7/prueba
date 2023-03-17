/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numero3;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author USER
 */
public class VectorInvitado {

    Invitados vector[];
    int totalElementos;

    public VectorInvitado() {
        vector = new Invitados[50];
        totalElementos = 0;
    }
    public boolean agregar(Invitados invitados){
        if(totalElementos<vector.length){
            vector[totalElementos]=invitados;
            totalElementos++;
            return true;
        }else
          return false;
    }
     public void mostrar(DefaultTableModel modelo) {
        Object datos[][] = new Object[totalElementos][2];
        String titulos[] = {"Apellidos", "Nombres"};
        for (int i = 0; i < totalElementos; i++) {
            datos[i][0] = vector[i].getApellidos();
            datos[i][1] = vector[i].getNombres();
            
        }
        modelo.setDataVector(datos, titulos);
    }
     public void burbujaNombre(){
         burbujaNombre(vector,totalElementos);
     }
     
     
        private void burbujaNombre(Invitados v[], int n){
        int i,j;
        Invitados temp;
        for(i=0; i<n; i++)
            for(j=n-1;j>i;j--)
                if(v[j].getNombres().compareTo(v[j-1].getNombres())<0){  // cuando el metodo CompareTo te devulv un 
                    //valor menor que 0 , el onjeto de la izquierda es menor que el de la derecha  <
                    temp = v[j];
                    v[j]=v[j-1];
                    v[j-1] = temp;
                }
    }
      public void burbujaApellido(){
         burbujaApellido(vector,totalElementos);
     }
        
        
       
        public void burbujaApellido(Invitados v[], int n){
        int i,j;
        Invitados temp;
        for(i=0; i<n; i++)
            for(j=n-1;j>i;j--)
                if(v[j].getApellidos().compareTo(vector[j-1].getApellidos())<0){
                    temp = v[j];
                    v[j]=v[j-1];
                    v[j-1] = temp;
                }
    }
        
    
    
    
    
}
