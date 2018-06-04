/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package leccion.extra.pkg2bim.pkg01;

/**
 *
 * @author User
 */
public class LeccionExtra2bim01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables
        //variables de entrada
        int[] arreglo1 = {110, 220, 430, 140, 250, 460};
        int[] arreglo2 = {10, 20, 30, 40, 50, 60};
        //variables de salida
        double[] arreglo3 = new double[arreglo1.length];
        double suma=0;//variable transitoria
        double promedio=0;//acumulador
        //Calculos para el arreglo3        
        for (int i=0;i<arreglo1.length;i++){
            arreglo3[i]=arreglo1[i]/arreglo2[i];
        }
        //Calculo de la suma de elementos del arreglo3 
        for (int j=0;j<arreglo3.length;j++){
            suma=suma+arreglo3[j];
        }
        promedio=suma/arreglo3.length;//obtencion del promedio
        //Presentacion de lso datos de salida (tabla)
        System.out.printf("%-12s\t%-12s\t%-12s\n","Arreglo1","Arreglo2","Resultado");
        for (int k=0;k<arreglo2.length;k++){
            System.out.printf("%-12d\t%-12d\t%-12.2f\n",arreglo1[k],arreglo2[k],arreglo3[k]);
        }
        System.out.printf("\nEl promedio del arreglo 3 es: %.2f\n", promedio);//Promedio del arreglo3
    }
}

