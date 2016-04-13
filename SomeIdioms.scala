val l1 = (1 +: 2 +: 3 +: Nil)
val l2 = (1 :: 2 :: 3 :: Nil)
println(l1)
println(l2)

val listTuple = ("a",1) :: ("b",2) :: ("c",3) :: Nil; // Tuple list
val map = Map(listTuple :_*)
println(listTuple)
println(map)