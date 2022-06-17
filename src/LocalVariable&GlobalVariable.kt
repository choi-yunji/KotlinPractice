// 전역변수(GlobalVariable) - 함수 밖에 선언한 변수
//                          어떤 함수에도 속해있지 않기 때문에 모든 함수에서 사용할 수 있다.
var count = 0

fun main(args:Array<String>): Unit {
   // 지역함수(LocalVariable) - 블록안에 선언된 변수 , 변수가 선언된 블록 안에서만 인식가능
    //                         변수가 인식될 수 있는 범위를 스코프(Scope)라함
    val a = 15
    println(a)

    count += 1
    printCount()
    println(count)
}

fun printCount() {
    println(count)
    count += 1
}
    /*  지역변수와 전역변수의 이름이 중복될 때
        한 블록 내에서 변수의 이름은 중복될 수 없지만, 지역변수와 전역변수는 이름이 중복될 수 있다.
        이름이 중복된 변수에 접근할 때는 현재 실행되고 있는 코드와 가장 가까운 스코프의 변수,
        즉 main 의 함수가 우선적으로 인식된다.
        var a = 5

        fun main() {
            val a = 30
            println(a)
            func()
        }

        fun func(){
            println(a)
        }
     */

    /** 지역변수와 다른 함수의 지역변수가 중복될때
     *  지역 변수의 이름은 같은 스코프내에서만 중복되지 않으면 되기때문에 서로 다른 함수 안에 같은 이름의 변수가 존재할 수 있다.**/
    /*
        fun main(args: Array<String>)
        {
            val a = 52
            println(a)

            printA()
            printA2()
        }

        fun printA()
        {
            val a = 17
            println(a)
        }

        fun printA2()
        {
            val a = 120
            println(a)
        }
     */
