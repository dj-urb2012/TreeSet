/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package treesetej;

import java.util.TreeSet;

/**
 *
 * @author Diego
 */
public class TreeSetEj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se crea una instancia de la clase treeSet
        TreeSet ts = new TreeSet();
        /*Su funcionamiento es similar al HashSet, no permite elemento repetidos, pero esta vez
        Se ordenan alfabeticamente y de menor a mayor al contrario del HashSet donde los elementos
        No estan ordenados*/
        ts.add("D");
        ts.add("D");
        ts.add("A");
        ts.add("C");
        ts.add("B");
        System.out.println(ts);
    }
    
}
