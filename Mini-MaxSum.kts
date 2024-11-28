import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'miniMaxSum' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun miniMaxSum(arr: Array<Int>): Unit {
    var Max:Long = 0 
    var Min = Long.MAX_VALUE //Comecar com max value faz com que todas as somas sejam menores que o valor inicial, atualizando o numero minimo logo na primeira soma.
    
    arr.forEachIndexed { indexToSkip, _ ->
    val currentSum = arr.filterIndexed { index, _ -> index != indexToSkip }.sumOf { it.toLong() }
    if (currentSum > Max) Max = currentSum
    if (currentSum < Min) Min = currentSum

}
    println("$Min $Max")
    
    
    
}

fun main(args: Array<String>) {

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    miniMaxSum(arr)
}
