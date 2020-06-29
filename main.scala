println("crazy" * 3)
println(10 max 2)
println(BigInt(2) pow 1024)

import BigInt.probablePrime
import util.Random
print("\n")

println(probablePrime(100, Random))

print("\n")


println(probablePrime(100, Random).toString(36))

val s = "Hello"
println(s.head)
println(s.last)
println(s.take(3))
println(s.drop(3))
println(s.takeRight(3))
println(s.dropRight(3))


def signum(x:Int) : Int = {
    if (x > 0) return 1
    else if (x < 0) return -1
    else return 0
}

println(signum(10))

// {} ничего не возвращает, тип Unit

for (i<- 10 to 0 by -1) println(i)
def countdown(n:Int) = for(i <- n to 0 by -1) println(i)
countdown(10)

println((for(i <- "Hello") yield i.toLong).product)
println((for(i <- "Hello") yield i.toLong).product)

def product(s:String) = s.map(c => c.toLong).product

println(product("Hello"))

def product(s:String, p:Long):Long = s.isEmpty match {
     case false => product(s.tail, p * s.head.toLong)
     case true => p
     }

def prod(s:String):Long = s.isEmpty match {
     case false => product(s, 1)
     case true => 0
     }

println(prod("Hello"))


def pow(x:Int, n:Int) = n match {
     case n if n > 0 && (n%2 == 0) => scala.math.pow(x, n/2)
     case n if n > 0 && (n%2 == 1) => x * scala.math.pow(x, n-1)
     case 0 => 1
     case n if n < 0 => 1/scala.math.pow(x, -n)
     }

println(pow(2, 4))