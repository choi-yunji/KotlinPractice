package operators

class Product(val id:Int, val name:String){
    /** ()연산자를 오버로딩하는 멤버함수 invoke 를 선언하고 있다. **/
    operator fun invoke(value:Int){
        println(value)
        println("id:$id\nname:$name")
    }
}