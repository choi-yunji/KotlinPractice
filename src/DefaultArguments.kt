fun main(args:Array<String>):Unit {
    println(getAverage(89,96))
    getAverage(100,50,true)
    println(getAverage(90))
    getAverage(66,print=true)
    getAverage(print=true)
    getAverage(print=true,a=10,b=30)
}

//매개 변수 선언과 동시에 디폴트 값으로 초기화
fun getAverage(a:Int=0,b:Int=0,print:Boolean=false):Double{
    val result = (a+b)/2.0
    if (print)
        println(result)
    return result
}