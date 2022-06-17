/* Unit 타입
   반환값이 필요없을때, 함수의 반환타입으로 Unit 을 사용한다.
   반환타입이 Unit 이면 함수끝에 return 을 쓰지 않아도 된다.

   /*자바의 Unit 타입?
     코틀린의 Unit 타입은 자바의 void 에 대응되는 개념이나 완전히 같은것은 아님
     void 는 반환 값이 없음을 의미하는 특수타입이지만, Unit 은 class 키워드로 정의된 일반 타입
     자바의 Void 클래스와 비슷한 개념
     Unit 타입을 반환하는 함수는, return 을 생략한다고 해도 암묵적으로 Unit 타입의 객체를 return 하도록 되어있다
     단, 그 Unit 객체는 싱글톤 인스턴스이기 때문에 매번 객체를 생성하지는 않는다.
     */
 */

fun main(args:Array<String>):Unit {
    celsiusToFah(27)
}

fun celsiusToFah(celsius:Int):Unit{
    println(celsius * 1.8 + 32)
}




