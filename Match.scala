
def findName(i:Any) ={
	i match {
		case i:Int => "Int"
		case i:String => "String"
		case _ => "Any"
	}
}

println(findName(10))
println(findName("Ranjth"))
println(findName(9.0))

for {
x <- Seq(1, 2, 2.7, "one", "two", 'four)
} {
val str = x match {
case 1 => "int 1"
case i: Int => "other int: "+i
case d: Double => "a double: "+x
case "one" => "string one"
case s: String => "other string: "+s
case unexpected => "unexpected value: " + unexpected
}
println(str)
}

def checkY(y: Int) = {
for {
x <- Seq(99, 100, 101)
} {
val str = x match {
case i: Int => "int: "+i
case y => "found y!" /*Warning for unrechable code*/
}
println(str)
}
}
checkY(100)

/*Tuple match*/
val langs = Seq(
("Scala", "Martin", "Odersky"),
("Clojure", "Rich", "Hickey"),
("Lisp", "John", "McCarthy"))
for (tuple <- langs) {
tuple match {
	case ("Scala", _, _) => println("Found Scala")
	case (lang, first, last) => println(s"Found other language: $lang ($first, $last)")
}
}

/* Guards in case clause */

for (i <- Seq(1,2,3,4)) {
	i match {
		case _ if i%2 == 0 => println(s"even: $i")
		case _ => println(s"odd: $i")
	}
}

/* Matching on case classes*/
case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int, address: Address)
val alice = Person("Alice", 25, Address("1 Scala Lane", "Chicago", "USA"))
val bob = Person("Bob", 29, Address("2 Java Ave.", "Miami", "USA"))
val charlie = Person("Charlie", 32, Address("3 Python Ct.", "Boston", "USA"))
	for (person <- Seq(alice, bob, charlie)) {
	person match {
		case Person("Alice", 25, Address(_, "Chicago", _)) => println("Hi Alice!")
		case Person("Bob", 29, Address("2 Java Ave.", "Miami", "USA")) => println("Hi Bob!")
		case Person(name, age, _) => println(s"Who are you, $age year-old person named $name?")
	}
}

/* Match with index */
val itemsCosts = Seq(("Pencil", 0.52), ("Paper", 1.35), ("Notebook", 2.43))
val itemsCostsIndices = itemsCosts.zipWithIndex

for (itemCostIndex <- itemsCostsIndices) {
	itemCostIndex match {
		case ((item, cost), index) => println(s"$index: $item costs $cost each")
	}
}