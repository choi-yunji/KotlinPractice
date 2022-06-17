/* 힙(Heap)영역 - 임의의 위치에 객체가 생성되므로 어떤 객체의 프로퍼티에 값을 저장하거나 저장된 값을 가져오고 싶으면
   그객체의 힙 영역상 좌표를 알고있어야 한다. object{...} 표현식은 힙영역에 객체를 생성하며,
   갓 생성된 객체의 좌푯값을 갖는다.
 */
fun main(args:Array<String>):Unit {
    val person = object {
        val name:String = "홍길동"
        val age:Int = 36
    }
    println(person.name)
    println(person.age)
}

/** 참조변수(Reference Variable)
 * 실제 값을 가지지 않고 객체의 좌표만 저장하는 변수
 * 객체의 좌푯값은 참조값(Reference Value)라 부른다
 */

/* 힙영역의 존재이유
   - 힙영역에 만들어진 변수의 수명: 힙영역에 생성한 변수는 어느 블록에서 생성했던 간에, 블록을 빠져나와도 지워지지 않는다.
   힙 영역을 두면 하나의 객체를 여러 참조 변수에서 공유하는 형태로 사용할 수 있어 훨씬 메모리 공간을 절약 할 수 있다.
 */