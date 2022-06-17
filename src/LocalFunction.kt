/** 지역 함수
 *  블록안에 선언된 함수
 */
fun main(args:Array<String>):Unit{
    fun printFomular(a:Int,b:Int){
        println(a * b + a - b)
    }

    printFomular(73,1)
    printFomular(4,6)
}