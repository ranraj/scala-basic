//Multiple Loop
/*for(x <- 0 to 2 ; y <- 0 to 2; z <-0 to 2; if x > 1){
	println( x +".."+ y +".."+ z)
}*/
for (i<-0 to 10  if i % 2 == 0 ){
	print(i)			
}
println

val evenList = for(i<-0 to 10 if i % 2 == 0)
	 yield i

println(evenList.mkString(" "))

for(i<-0 to 10 if i % 2 == 0)
	 yield{print(i)}

println

for { i<-0 to 10  if(i % 2 == 0)}{
	print(i)			
}
//Some or None
println
val dogBreeds = List(Some("Doberman"), None, Some("Yorkshire Terrier"),
Some("Dachshund"), None, Some("Scottish Terrier"),
None, Some("Great Dane"), Some("Portuguese Water Dog"))
println("first pass:")
for {
	breedOption <- dogBreeds
	breed <- breedOption
	upcasedBreed = breed.toUpperCase()
} 
print(s"$upcasedBreed ")
println
println("second pass:")
for {
	Some(breed) <- dogBreeds
	upcasedBreed = breed.toUpperCase()
} 
print(upcasedBreed+" ")
