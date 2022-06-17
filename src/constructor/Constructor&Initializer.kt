package constructor

/** 생성자 정의
 * class 클래스 이름 constructor(생성자의 매개변수 선언)
 * {...}
 * constructor 키워드 생략 가능
 */
class Person constructor(name:String, age:Int) {
   // val 프로퍼티를 선언과 동시에 초기화 X
    val name:String
    val age:Int

    init {
        // 생성자의  매개변수는 init 블록 내부에서 사용 할 수 있다.
        // init 블록 안에서 프로퍼티를 초기화하면 프로퍼티를 선언과 동시에 초기화 하지 않아도 된다.
        this.name = name
        this.age = age
    }
}

fun main(args:Array<String>){
    val person = Person("홍길동", 46)
    println("이름:${person.name}")
    println("나이:${person.age}")
}