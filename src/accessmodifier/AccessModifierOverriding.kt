package accessmodifier

/** 오버라이딩이 불가능한 private 접근 지정자
 * 
 */
open class CCC(protected open val number:Int){
    protected open fun hello(){
        println("hello")
    }
}

class DDD(number: Int):CCC(number){
    public override val number:Int
        get() = super.number

    public  override fun hello() = super.hello()
}

fun main(args:Array<String>){
    val b = DDD(26)
    val a:CCC = b

    // println(a.number) 에러
    // a.hello() 에러
    println(b.number)
    b.hello()
}