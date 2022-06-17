class Size( width:Int, height:Int){
    val width = width
    val height:Int

    /** init 블록은 여러개로 나누어서 사용할 수 있다.
     * 인스턴스가 생성된다고 해서 init 블록이 곧장 실행되는것은 아니다.
     * 인스턴스가 생성되면 위에서부터 순서대로 프로퍼티의 선언 및 초기화문과, init 블록이 실행된다.
     * 생성자의 매개변수는 int 블록뿐만 아니라 프로퍼티를 선언과 동시에 초기화하는 데에도 사용할 수 있다.
     */
    init {
        this.height = height
    }

    val area: Int

    init {
        area = width * height
    }
}

fun main(args:Array<String>){
    val size = Size(10,50)
    println(size.area)
}