@file:JvmName("Linia")

package com.ieseljust.kscenemaker

import java.awt.Graphics
import java.awt.Color

class Linia: Figura {

   
    
    
    // Constructors secundaris
    constructor():super() //Sense arguments

    constructor(x: Int, y:Int, x2: Int, y2:Int, color:Color=Color.RED): super(x, y, x2, y2 ,color) {
        //super(x, y, color)
       
         
     }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("Linia " + x + " " + y + " " + x2 + " " + y2 + " " + color)
    }

    override fun render(g:Graphics) {
        
        /*
         * Mètode que dibuixa sobre un context gràfic la "figura" linia.
         * S'utilitza per al mètode render() de App.
         * 
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         * 
         * Fixeu-vos que això són classes de java que estem utilitzant
         * directament des de Kotlin!
         * 
         */

        g.setColor(color)             // Establim el color interior
        g.drawLine (x, y, x2,y2)    // Dibuixem una linia en la posició indicada
    }

}
