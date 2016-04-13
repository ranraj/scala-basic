case class Profile(
	id:Int,
	name:String,
	skills:List[Skill])
{
	override def toString()={
		id +","+name+","+skills
	}
}
case class Skill(
	id:Int,
	name:String)
{
	override def toString()={
		id +","+name
	}
}	



def doIt(){
	val p1 = Profile(101,"Ranjith",List(Skill(1,"scala"),Skill(2,"java")))
	val p2 = Profile(102,"Abdul",List(Skill(3,"Liferay"),Skill(2,"java")))
	val p3 = Profile(103,"Venkat",List(Skill(4,"Javascript"),Skill(2,"java")))
	val p4 = Profile(101,"Mahes",List(Skill(5,"Angular"),Skill(6,"C++")))
	val profiles = List(p1,p2,p3,p4)

	val skillToProfile: List[(Skill, Profile)] = for {
  		p <- profiles
  		s <- p.skills 
	} yield (s, p)
	
	val skillsOnly: List[Skill] = for {
  		p <- profiles
  		s <- p.skills 
	} yield (s)	

	println(skillsOnly)
	println(skillToProfile.mkString("\n"))
	println
	val profilesBySkill: Map[Skill, List[Profile]] =
    skillToProfile
       .groupBy{case (skill,profile) => skill}
       //.mapValues{case(skill,profile)=>profile}
       .mapValues(_.map(_._2))
       //.map{case (skill,profiles) => (skill,profiles.map(profile => profile._2))}
    println(profilesBySkill.mkString("\n"))
}
doIt()