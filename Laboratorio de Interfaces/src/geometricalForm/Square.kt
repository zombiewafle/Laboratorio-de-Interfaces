package geometricalForm
import interfaces.Drawable
import interfaces.Describable


open class Square: Drawable, Describable{

    var size: Int = 0

    override fun draw (): String{
        getDescription()
        var square = " "
        for(x in 1.. size){
            square += "\n"
            for (y in 1.. size)
                square += "*" + " "
        }
        return square
    }

    override fun getDescription(){
        print("Ingrese el tamaña del lado")
        this.size= Integer.parseInt(readLine())
    }
}