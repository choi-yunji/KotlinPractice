// 점을 표현하는 클래스
class Point2(val x: Int, val y: Int)

// 사각형을 표현하는 클래스
class Rect
{
   // lateinit 키워드가 붙은 프로퍼티는 클래스안에서 바로 초기화하지 않아도 된다.
   // lateinit은 var 프로퍼티에만 붙일 수 있다.
    lateinit var pt: Point2
    lateinit var pt2: Point2

    val width: Int
        get() = pt2.x - pt.x
    val height: Int
        get() = pt2.y - pt.y
    val area
        get() = width * height
}

fun main(args: Array<String>)
{
    val rect = Rect()
    rect.pt = Point2(3, 3)
    rect.pt2 = Point2(6, 5)

    println("너비: ${rect.width}")
    println("높이: ${rect.height}")
    println("넓이: ${rect.area}")
}

/* lateinit 프로퍼티가 초기화되었는지 여부를 확인하는 방법
   if (rect::pt.isInitialized){
   }
 */