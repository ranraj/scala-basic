/* This sample is demo for while-like-loop */

def continue(condition: => Boolean)(body: => Unit):Unit={
	if(condition)
		body
		continue(condition)(body)
}

var i = 0
continue(i < 10){
	println(i)
	i += 1
}
