fun main() {
    add()
    name()
    var result=multiplication(10,20)
    print(result)
}
fun add(){
    var num1=10
    var num2=20
    var sum=num1+num2
    print(sum)
}
fun name(){
    print("hello anitab")
}
fun multiplication(num1:Int,num2:Int):Int{
    var multiply=num1*num2
    return multiply
}

