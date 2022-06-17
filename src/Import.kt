import ex_package.max
import ex_package.min as ex_min

/*  import - 다른 패키지에 선언된 함수를 패키지 이름 없이 호출 할 수 있다.
    import 패키지 이름.함수이름을 적으면 해당함수를 패키지 이름없이 호출 할 수 있다.
    import 패키지이름.* 과 같이 적으면 그 패키지에 들어있는 모든 함수를 패키지 이름없이 호출할수 있다.
    import 패키지이름.함수이름 as 새로운 이름 과 같이 적으면 새로운 이름으로 해당함수를 호출할 수 있다.

 */
fun main(args:Array<String>):Unit {
    println(max(55,47))
    println(ex_min(3,10))
}