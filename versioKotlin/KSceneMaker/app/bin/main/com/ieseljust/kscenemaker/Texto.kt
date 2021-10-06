@file:JvmName("Texto")

package com.ieseljust.kscenemaker

import java.awt.Color
import java.awt.Graphics

class Texto : Figura {

    // Inicialitzem les variables en la delcaració mateix
    // No utilitzarem cap constructor primari
    var texto: String = ""
   

    // Constructors secundaris
    constructor() : super() // Sense arguments

    constructor(x: Int,y: Int, color: Color = Color.RED,texto2:String =" ") : super(x, y, color,texto2) {
        // super(x, y, color)
        this.texto=texto2
        
    }

    override fun describeMe() {
        /*
         * Mètode que mostra en mode text una descripció de la figura per la consola.
         * S'utilitzarà per al mètode llista de la CLI.
         */
        println("texto " +x + " " + y  + " " + color+" "+texto+" ")
    }

    override fun render(g: Graphics) {

        /*
         * Mètode que dibuixa sobre un context gràfic la "figura" texto.
         * S'utilitza per al mètode render() de App.
         *
         * Per dibuixar altres primitives de la classe Graphics, podeu consultar
         * https://docs.oracle.com/javase/10/docs/api/java/awt/Graphics.html
         *
         * Fixeu-vos que això són classes de java que estem utilitzant
         * directament des de Kotlin!
         *
         */

        g.setColor(color) // Establim el color interior
        g.drawString(texto, x, y) // Dibuixem un text en la posició 
        
    }
}
