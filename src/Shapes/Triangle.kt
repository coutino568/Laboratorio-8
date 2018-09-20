package Shapes

class Triangle :Drawable ,Measurable {
    var dimension_y :Int=0
    override fun drawMe() {
        print("**IMPRIMIR TRIANGULO**\n")
    }
    override fun requestMeasure() {
        print("Ingrese la altura del triangulo\n")
        var input: Int = readLine()!!.toInt()
        dimension_y=input
    }

}