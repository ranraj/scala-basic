/* Construction and DeConstruction*/
case class Address(street: String, city: String, country: String)
case class Person(name: String, age: Int, address: Address)

val person = Person("Ram", 25, Address("2nd Mainroad", "Chennai", "Tamilnadu"))

println(Person.apply("Akbar", 22, Address("2nd street", "Kaasi", "India")))

val opt = Person.unapply(person)
println(opt)
println(opt.isEmpty)
println(opt.get)