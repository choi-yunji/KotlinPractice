/* 가변인자
   별도의 오버로딩 없이 인자수를 유동적으로 활용할 수 있다
   매개변수 앞에 vararg 카워드를 붙이면 여러개의 인수를 받을 수 있게 된다.
 */

fun main(args:Array<String>):Unit {
    println(getSumOf(1,2,3,4,5,6,7))
    println(getSumOf(32,57,12))
}

fun getSumOf(vararg numbers:Int): Int {
    val count = numbers.size;
    var i = 0; var sum = 0

    while (i < count){
        sum += numbers[i]
        i += 1
    }
    return sum
}

/* 가변인수는 일반 인수와 함께 쓸 수도 있다.
    fun function(something:Char , vararg numbers:Int): Int
    이 함수는 다음처럼 호출하면된다.
    function(Char 타입 인수, N개의 Int 타입 인수)
    일반 인수가 가변 인수보다 오른쪽에 있으면 호출시 인수에 매개변수 이름을 붙여야 한다.
    fun function(vararg numbers:Int, something:Char ): Int
    위와 같은 함수는 아래처럼 호출해야 한다.
    function(N개의 Int 타입 인수 , something = Char 타입 인수)
 */