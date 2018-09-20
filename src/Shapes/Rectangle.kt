package Shapes

import com.sun.xml.internal.fastinfoset.util.StringArray

class Rectangle :Drawable ,Measurable {
    var dimension_x: Int=0
    var dimension_y: Int=0
   // var lenght:ArrayList<String>()
    //var height: ArrayList<lenght>()

    override fun drawMe(){
        for (i in 0..dimension_y-1){
            for (j in 0..dimension_x-1){
            print("*")}
            print("\n")
    }}

    override fun requestMeasure() {

        print("Ingrese el ancho \n")
        var input:Int= readLine()!!.toInt()
        this.dimension_x=input
        print("Ingrese la altura \n")
        input= readLine()!!.toInt()
        this.dimension_y=input

    }
}