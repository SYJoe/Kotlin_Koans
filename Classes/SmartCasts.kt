fun eval(expr: Expr): Int =
        when (expr) {
            is Num -> return expr
            is Sum -> 
            else -> throw IllegalArgumentException("Unknown expression")
        }

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr