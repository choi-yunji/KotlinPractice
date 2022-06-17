package operators

class Point(var x:Int = 0, var y:Int = 0){
    /** operator 의 의미는 Point 인스턴스 간에 연산자를 사용했을때 이 멤버함수를 대신 호출해 달라는 것이다. **/
    // plus 라는 이름은 + 연산자를 오버로딩한다.
    operator fun plus(other:Point):Point{
        return Point(x + other.x, y+other.y)
    }
    // minus 라는 이름은 - 연산자를 오버로딩한다.
    operator fun minus(other: Point):Point{
        return Point(x - other.x, y - other.y)
    }
    // times 라는 이름은 * 연산자를 오버로딩한다.
    operator fun times(number:Int):Point {
        return Point(x * number, y * number)
    }
    // div 라는 이름은 / 연산자를 오버로딩한다.
    operator fun div(number: Int):Point {
        return Point(x/number,y/number)
    }

    // 좌표값을 출력한다.
    fun print(){
        println("x:$x,y:$y")
    }
}

/** 오버로딩이 가능한 연산자 - 초보자를 위한 Kotlin 200제 168P **/