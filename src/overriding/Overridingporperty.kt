package overriding
/** 프로퍼티에도 함수의 일종인 Getter/Setter 가 존재하므로, 이들도 오버라이딩이 가능하다. **/
open class yunji{
    open var number = 10
    get(){
        println("yunji number Getter 호출됨")
        return field
    }
    set(value) {
        println("yunji number Setter 호출됨")
        field = value
    }
}

class Wonseok:yunji(){
    override var number:Int
        get() {
        println("Wonseok number Getter 호출됨")
        return super.number
    }
    set(value) {
        println("Wonseok number Setter 호출됨")
        super.number = value
    }
}

fun main(args:Array<String>){
    val test = Wonseok()
    test.number = 5
    test.number
}

/* val 프로퍼티를 var 로 오버라이딩하기
   슈퍼클래스에서 val 로 선언한 프로퍼티를 var 로 오버라이딩 할 수 있다.
   open class AAA(open val number:Int = 0)

   class BBB:AAA(){
    override var number:Int = 0
    get() = super.number
    set // 디폴트 Setter
 */