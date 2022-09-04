//#1 Declare a constant exercises with value 9 and a variable exercisesSolved with
//value 0. Increment this variable every time you solve an exercise
val excercises: Int = 9
var exercisesSolved: Int = 0
exercisesSolved += 1

//#2 Declare age so that it compiles. Did you use var or val?
var age: Int = 16
    println(age)
 age = 30
    println(age)
exercisesSolved += 1
//#3 Consider the following code:
/*
val a: Int = 46
val b: Int = 10
//Work out what answer equals when you replace the final line of code above with each of
//these options:

// 1
val answer1: Int = (a * 100) + b
// 2
val answer2: Int = (a * 100) + (b * 100)
// 3
val answer3: Int = (a * 100) + (b / 10)
*/

val a: Int = 46
val b: Int = 10

/*
val answer1: Int = (a * 100) + b
    println(answer1)
    = 4610
*/

/*
val answer2: Int = (a * 100) + (b * 100)
    println(answer2)
    = 5600
*/


val answer3: Int = (a * 100) + (b / 10)
    println(answer3)
    //= 4601 