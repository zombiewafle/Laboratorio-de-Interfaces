package geometricalForm

import interfaces.Describable
import interfaces.Drawable

open class Rectangle: Drawable, Describable{
    var WIDTH: Int = 0
    var HEIGHT: Int = 0

    override fun draw(): String{
        getDescription()
        var rec = ""
        for (x in 1 .. HEIGHT){
            rec+= "\n"
            for (y in 1.. WIDTH)
                rec+= "*" + " "
        }
        return rec
    }

    override fun getDescription() {
        print("Ingrese el ancho")
        WIDTH = Integer.parseInt(readLine())

        print("Ingrese la altura ")
        HEIGHT = Integer.parseInt(readLine())
    }
}