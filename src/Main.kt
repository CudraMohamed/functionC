fun main(){
    var j = addNumb(10,15,17,25)
    println(j)
   var c = modulus(70,15)
    println(c)
   var x = printName("Cudra")
    return x
}

fun printName(name:String){
    println("Hello $name")
}

fun modulus(a:Int,b:Int):Int{
    var quotent=a%b
    return(quotent)
}

fun addNumb(e:Int,f:Int,g:Int,h:Int):Int{
    var sum = e+f+g+h
    return(sum)
}