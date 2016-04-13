val fruits = Seq("apple", "banana", "orange")
//fruits: Seq[java.lang.String] = List(apple, banana, orange)

fruits.map(_.toUpperCase)
//res0: Seq[java.lang.String] = List(APPLE, BANANA, ORANGE)

 fruits.flatMap(_.toUpperCase)
//res1: Seq[Char] = List(A, P, P, L, E, B, A, N, A, N, A, O, R, A, N, G, E)

val seqOneD = Seq(10,20,30,40,50,60)
val seqTwoD = Seq(Seq(10,20),Seq(30,40),Seq(50,60))
println(seqOneD)

val divBy10 = seqOneD.map(_/10)

println(divBy10)
val flat1 = seqTwoD.flatten // Converting 2d to 1d list
val flat2 = seqTwoD.flatMap(x => x)

println(flat1)
println(flat2)

val f = Seq(1,2,3)
println(f.head)

println(seqTwoD)
val headOption = seqTwoD.flatMap(_.headOption)
val list = List(1,2,3)
val listHead = list.headOption
println(listHead)
val headOption1 = seqTwoD.flatMap(_.headOption)
println(headOption1)

//Like partial function 
val a = List("hello", 1, true, "world")
val aResult = a collect { case s: String => s }
println(aResult.mkString(","))

val bResult = a flatMap { case s: String => s ;case _ => None }
println(bResult.mkString(","))

val cResult = a filter(_.isInstanceOf[String])
println(cResult)

val words = List("Hi", "Hello", "World")
val collect = Seq(1,2,0) collect words 
println(collect)
