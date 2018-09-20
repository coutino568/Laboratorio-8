import Shapes.Drawable
import Shapes.Measurable
import Shapes.Triangle
import Shapes.Square
import Shapes.Rectangle
import com.sun.org.apache.xpath.internal.functions.FuncFalse

fun ask(anyShape: Measurable){
    anyShape.requestMeasure()
}

fun draw(anyShape:Drawable){
    anyShape.drawMe()
}

fun main(args: Array<String>){
        var opcion:Int
        var menuIndex:Int=1
        var exit:Boolean =false
        var myTriangle= Triangle()
        var myRectangle=Rectangle()
        var mySquare=Square()

        while (exit==false){
            if(menuIndex==1){
                print("1)Dibujar una figura\n2)Salir\n")
                opcion= readLine()!!.toInt()
                //print("usted eligio "+ opcion+"\n")
                if (opcion==2){exit=true}
                if (opcion==1){menuIndex=2}

            }else if(menuIndex==2){
                print("1)Dibujar un cuadrado \n2)Dibujar un Rectangulo \n3)Dibujar un Triangulo \n4)Regresar \n")
                opcion= readLine()!!.toInt()
                if (opcion==1){
                    ask(mySquare)
                    draw(mySquare)
                } else if(opcion==2) {
                    ask(myRectangle)
                    draw(myRectangle)
                }else if (opcion==3){
                    ask(myTriangle)
                    draw(myTriangle)
                }else if(opcion==4){menuIndex=1}
            }


    }}



