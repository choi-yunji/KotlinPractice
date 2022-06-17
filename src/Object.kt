/* 객체(Object) 우리가 인식할 수 있는 물체 또는 물건
    각자의 고유한 속성과 동작을 갖고 있음
    소프트웨어 관점에서 객체란, 서로 연관 있는 변수(속성)들을 묶어 놓은 데이터 덩어리를 뜻함
    객체에 포함된 변수들은 프로퍼티(Property)라고 부른다
 */
fun main(args:Array<String>):Unit{
    val person = object {
        val name:String = "홍길동"
        val age: Int = 36
    }
    println(person.name)
    println(person.age)
}

/** 필드와 프로퍼티
 * 프로퍼티는 필드와 Getter, Setter 가 합쳐진 개념이다.**/