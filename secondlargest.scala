import scala.io.StdIn
object scalasort {
    def sort1(a:Array[Int])  
  {
  
  	def swap ( l:Int,r:Int) {
  		val t = a(l) ; a(l) = a (r) ; a(r) = t
  		}
  		
  	def sort2(l:Int, r:Int)
	{
  		val pivot = a((l+r)/2)
		var i =l
		var j = r
		while (i <= j) 
		{
			while (a(i) < pivot ) i += 1
			while (a(j) > pivot) j -= 1
			if (i <= j)
			{
				swap (i,j)
				i += 1
				j -= 1
			}
		}
		if (l< j) sort2(l,j)
		if (j < r) sort2(i,r)
	}
	if (a.length > 0)
		sort2(0,a.length-1)
}

def main(args:Array[String]) {
    println("Enter number of elements")
	val n = scala.io.StdIn.readInt()
	 val b: Array[Int] = new Array[Int](n)

	println("Enter elements")
	for (i <- 0 to n-1){
			b(i) = scala.io.StdIn.readInt()
	}
	sort1(b)
	println("The second largest element is:")
	println(b(n-2))

}
}
