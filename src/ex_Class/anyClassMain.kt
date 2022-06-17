package ex_Class

fun main(args:Array<String>){
    val building = Building("코틀린", area= 100)
    printObject(building)
}

fun printObject(any:Any){
    /**  코드상으로는 Any 타입의 toString 멤버 함수를 호출하고 있지만, 다형성덕에 실제로는
     * building  객체의 toString()이 호출된다.
     */
    println(any.toString())
}