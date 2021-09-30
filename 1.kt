// fibonacci

fun main() {
	var first = 1
	var second = 1

	print("amount: ")
	var amount:Int = readLine()!!.toInt()

	
	println(first)
	println(second)
	for (i in 1..amount){
		println(first + second)

		if(first == 1 && second == 1){
			second = first + second
		}
		else{
			var temp = first
			first = second
			second = temp + second
		}
	}
}
