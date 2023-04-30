object curryingFun extends App{
//Currying function accepting multiple arguement to execute one function
//   normal function -> def sum(a:Int, b: Int) = a+b

  def sumOfTwoNumber(num1:Int)(num2:Int):Int = num1 + num2
    println("sum of two number is :"+sumOfTwoNumber(10)(40))


}
