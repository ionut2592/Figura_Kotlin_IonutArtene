@file:JvmName("El·lipse")

package com.ieseljust.kscenemaker

import java.awt.Graphics
import java.awt.Color

class Elipse: Figura {

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var width: Int=100
    var height: Int=100
    
    
    // Constructors secundaris
    constructor():super() //Sense arguments

    constructor(x: Int, y:Int, width:Int=150, height:Int=150, color:Color=Color.RED): super(x, y, color) {
        //super(x, y, color)
        this.width=width;
        this.height=height;
       
         
     }

    override fun describeMe() {
        /*
        * Mètode que mostra en mode text una descripció de la figura per la consola.
        * S'utilitzarà per al mètode llista de la CLI.
        */
        println("el·lipse " + x + " " + y + " " + width + " " + height + " " + color)
    }

    override fun render(g:Graphics) {
        
        /*
         * Mètode que dibuixa sobre un context gràfic la figura el·lipse.
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
        g.fillOval(x, y, width,height)    // Dibuixem un el·lipse en la posició i mida indicades
    }

}