abstract class Shape {
	def getArea():Int 
}

class Circle(r: Int) extends Shape {
	def getArea():Int = { r * r * 3 }
}	

val c = new Circle(2)
println(c.getArea)