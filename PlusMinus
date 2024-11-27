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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    var PositiveCount = 0
    var NegativeCount = 0
    var Neutral = 0
    
    arr.forEach { element ->
        when {
        element > 0 -> PositiveCount++
        element < 0 -> NegativeCount++
        element == 0 -> Neutral++
        }
    }
        println("%.6f".format(PositiveCount / arr.size.toDouble()))
        println("%.6f".format(NegativeCount / arr.size.toDouble()))
        println("%.6f".format(Neutral / arr.size.toDouble()))
        
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()

    plusMinus(arr)
}
