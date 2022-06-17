package RepeatingSentence
/* label
    코틀린의 모든 표현식은 레이블(Label)을 사용할 수 있습니다.
    레이블은 이름 뒤에 @(골뱅이?) 기호를 붙혀서 레이블이라는 것을 컴파일러에 알려주면 됩니다.
    예를 들어 abc@, foo@, nextStep@ 과 같이 사용하고, 표현식의 가장 앞에 붙혀주면 됩니다.
    레이블은 여러개의 반복문이 중복되어 있을 때 break 나 continue 와 같은 탈출구문이 어떤 반복문을 가리키는지를 명시하기 위해서 사용됩니다.
 */
fun main(args:Array<String>): Unit {
    var x = 0
    var y = 0

    outer@ while (x <= 20){
        y = 0
        while (y <= 20){
            if (x+y == 15 && x-y==5)
                break@outer
            y += 1
        }
        x += 1
    }
    println("x:$x, y:$y")
}
