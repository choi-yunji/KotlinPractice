package accessmodifier

/* 접근지정자(Access Modifier) 또는 가시성 지정자(Visibility Modifier)
   코틀린에서 선언 가능한 요소(함수, 전역변수, 클래스, 프로퍼티, 멤버함수 등) 중, 일부 요소에는 접근권한이라는 것을 지정할 수 있다.
   접근지정자는 총 4개가 있다.

   public - 모든 곳에서 접근가능. 접근 지정자를 생략하면 기본적으로 public 이 된다.
   internal - 같은 모듈 안에서 접근 가능.
   protected - 클래스 내부와, 서브클래스 안에서만 접근 가능하다.
   private - 프로퍼티와 멤버 함수일 경우, 해당 클래스안에서만 접근 가능하고, 그외의 경우, 같은 파일 내에서만 접근 가능하다.
 */

class Rectangle(private val width:Int, private val height:Int){
    val area:Int
        get() = width * height
}

fun main(args:Array<String>){
    val rect = Rectangle(5,7)
    println(rect.area)
}

/* 다음과 같은 곳에 접근지정자를 붙일 수 있다.
   접근 지정자 class 식별자 접근 지정자 constructor(...){
   접근 지정자 val 또는 var 식별자 ...
    접근 지정자 get()= ...
    접근 지정자 set(value)= ...

  접근지정자 constructor(...):this(...)...

  접근지정자 fun 식별자()...
  }

  // 전역 변수에만 접근 지정자 지정 가능
  접근 지정자 val 또는 var 식별자...

  접근 지정자 fun 식별자(...)...

 */