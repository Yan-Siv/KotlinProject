import javax.print.attribute.IntegerSyntax
import java.util.Scanner
import kotlin.reflect.typeOf

fun main(){
    print("введите число 1: ")
    var inputNum = Scanner(System.`in`).nextInt()
    print("введите число 2: ")
    var inputNum2 = Scanner(System.`in`).nextInt()
    println("что вы хотите с ним сделать?")
    println("1 - для +, 2 - для -, 3 - для *, 4 - для /")
    var inputWay = Scanner(System.`in`).nextInt()

    if (inputWay == 1){
        var result = inputNum + inputNum2
        println("вот ваше сложенное число - $result")
    }
    else if(inputWay == 2){
        var result = inputNum - inputNum2
        println("вот ваше вычтенное число - $result")
    }
    else if(inputWay == 3){
        var result = inputNum * inputNum2
        println("вот ваше умноженное число - $result")
    }
    else if(inputWay == 4){
        var result = inputNum / inputNum2
        println("вот ваше поделенное число - $result")
    }
}

