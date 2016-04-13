object ComputerScienceSubject extends Enumeration {
	type ComputerScienceSubject = Value
	val DS = Value("Data structure")
	val SNS = Value("Signals and System")
	val DSP = Value("Digital Signal Processing")
	val OOPS = Value("Object Oriented Programming")
	val DM = Value("Discreet Maths")
}
import ComputerScienceSubject._

// print a list of breeds and their IDs

println("ID\tSubject")
for (subject <- ComputerScienceSubject.values) println(s"${subject.id}\t$subject")

println(ComputerScienceSubject.DM)
	
println("\nOnly Signals")
ComputerScienceSubject.values filter (_.toString.contains("Singal")) foreach println

def isMathsThere(b: ComputerScienceSubject) = b.toString.contains("Maths")
println("\nExtract Maths??")
ComputerScienceSubject.values filter isMathsThere foreach println

