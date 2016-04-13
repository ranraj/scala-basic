implicit def getInt = 10

/*trait Message{
	def sayHi()
}
implicit object MyMessage extends Message{
	override def sayHi() = "Welcome"
}
println(new MyMessage().sayHi())*/

def run(i:Int,j:Int)(implicit k:Int)={
	i + j + k
}

val result = run(3,2)
println(result)