@file:JvmName("Figura")

package com.ieseljust.kscenemaker

import java.awt.Graphics
import java.awt.Color
//import com.ieseljust.edd.scenemaker.Renderizable;

open class Figura constructor() : Renderizable  { 
    /*
     * Aquesta classe representa una figura
     * Es defineix com a open, per poder crear estendre altres classes derivades
     * Implementa la interfície Renderizable
     * 
     */
    
    var x:Int
    var y:Int
    var color:Color    // Atribut importat d'una llibrería de Java!
    var x2:Int
    var y2:Int
    var texto2:String=""

    // Hem utilitzat el constructor primari
    // en la declaracó de la classe (constructor()),
    // que no té arguments.
    // Ara ens queda inicialitzar la classe amb el bloc init (compte que no () )
    init {
        x=-0
        y=-0
        x2=-0
        y2=-0
        color=Color.BLACK
    }

    // Constructors secundaris per fer
    // el constructor sobrecarregat:

    // Constructor secundari si passem x i y
    // Amb el :this() estem invocant també el 
    // constructor primary, per evitar l'error 
    // "Primary constructor call expected"
    constructor(x:Int, y:Int) : this() {
        this.x=x
        this.y=y
        color=Color.BLACK
    }

    // Constructor secundari si passem x, y i el color
    constructor(x:Int, y:Int, color:Color) : this() {
        this.x=x
        this.y=y
        this.color=color
    }
    constructor(x:Int, y:Int, x2:Int,y2:Int, color:Color) : this() {
        this.x=x
        this.y=y
        this.x2=x2
        this.y2=y2
        this.color=color
    }
    constructor(x:Int, y:Int, color:Color,texto :String) : this() {
        this.x=x
        this.y=y
        this.color=color
        this.texto2=texto
    }


    // Mètodes abstactes que hauran d'implementar les subclasses
    open fun describeMe(){}

    // Mètode render de la interfície Renderizable
    open override fun render(g:Graphics){}

    



}
