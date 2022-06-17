package operators
import Building

fun main(args:Array<String>){
    var obj:Building? = Building()
    // !! 연산자는 Nullable 타입을 Not_null 타입으로 강제로 캐스팅한다.
    obj!!.name = "서울시청"
    println(obj!!.name)

    obj = null
}