package Shapes

class Square:Drawable ,Measurable{
    var dimension_x:Int=0
    var dimension_y:Int=0

    override fun requestMeasure(){
        print("ingrese la dimension del cuadrado \n")
        var input= readLine()!!.toInt()
        this.dimension_x=input
        this.dimension_y=input
    }

    override fun drawMe(){
        for (i in 0..dimension_y-1){
            for (j in 0..dimension_x-1){
                print("*")}
            print("\n")
    }
}}