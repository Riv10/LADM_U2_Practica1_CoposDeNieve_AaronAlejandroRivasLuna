package mx.edu.ittepic.ladm_u2_practica1_coposdenieve_aaronalejandrorivasluna

import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import kotlin.random.Random

class Copos (l:Lienzo){
    val l = l
    var x = 0f
    var y = 0f
    var movRapido = 0f
    var movLento =0f
    var aux = 0f
    var color = Color.WHITE


    init{
        x = random(1080)
        y = -10f
        movRapido = 50f
        movLento = 2f
        aux = 0f
    }

    fun mover(){
        if(y<l.height){
            movimiento()
        }else{
            y = 0f
            movimiento()
        }

    }

    private fun movimiento(){
        if(random(100)<50f){
            y += movLento
        }else{
            y += movRapido
        }
    }

    private fun random(hasta:Int):Float{
        return Random.nextInt(hasta).toFloat()
    }

    fun pintar(canvas: Canvas){
        var p = Paint()
        p.color = color
        canvas.drawCircle(x,y,20f,p)
    }
}