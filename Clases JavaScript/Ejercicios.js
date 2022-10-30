/* ( true && true )  --> verdadero
( false && true ) --> falso
( true && false ) --> falso
( false && false ) --> falso
( true || true) --> verdadero
( true || false )   --> verdadero
( false || true)   --> verdadero
( false || false )  --> falso
!( false || true )   --> falso
!( false && true ) --> verdadero
( !false && true ) --> verdadero
( !true && true ) --> falso
( !false || false ) --> verdadero
*/


1
2
/**
 * 1. Create a fork of this repl.it.
 * 2. Write test cases to validate your code before you complete the exercise.
 * 3. Make sure to run your exercise and check
 * for correctness.
 */
  

/**
 * Exercise 1:
 * We want to check if a string is empty.
 * If a string is not empty, we want to print
 * out the first character of that string.
 * If a string is empty, print out a text saying
 * "This string is empty" 
 */
function checkEmptyString(str) {
    if (str == ""){
        console.log("Este String está vacío")
    }else{
        console.log(str.charAt())

    }}
    
// Example test, should return a
checkEmptyString("apple");

/**
 * Exercise 2:
 * We want to compare two strings and check if
 * they are the same - case insensitive.
 * Return a boolean - true if the two strings are
 * the same, and false if they are not 
 */
function checkTwoStringsSame(str1, str2) {
    if(str1 === str2){
        console.log(true)
    }else{
        console.log(false)
    }
}

// Example test, should return true
checkTwoStringsSame("String1", "string1");


/**
 *  Create a function that takes in 2 inputs (using prompt)
 *  and goes through the 5 arithmetic operators (+, -, /, *,
 *  %). The expected output on the console is:
 * `The sum is x` -> x is the calculated sum
 * `The subtraction is y` -> y is the calculated difference
 * `The multiplication is z` -> z is the calculated multiplication
 * `The division is w` -> w is the calculated division
 * `The remainder is q` -> q is the calculated remainder
 */

function mathematicOperations(x, y) {

    var sum = x + y
    var rest = x - y
    var multi = x * y
    var div = x / y
    var resto = x % y
    console.log (sum, rest, multi, div, resto)
 
}

mathematicOperations(2, 4);

/* Write a program where a user enters the number of tasks they have completed. 
The program returns one of the following labels to the console:
**Failed**
**Insufficient**
**Good**
**Excellent**
**Error** 

based on the conditions:

Failed if they scored 6 or less
Insufficient if they scored > 6 but less than 9 (9 included)
Good if they scored > 9 but less than 14 (14 included)
Excellent if they scored 15
Error if participants enter a negative number or a number outside the range supported (outside 0 - 15)
*/

function calificacion(nota){
    if ((nota <= 6) && (nota >= 0)){
        console.log("Fallaste");
    }
    else if ((nota > 6) && (nota <= 9) ){
        console.log("Insuficiente");
    }
    else if ((nota > 9) && (nota <= 14)){
        console.log("Bien")
    }
    else if (nota == 15){
        console.log("Excelente")
    }
    else{
        console.log("Error, ingresaste un numero fuera del rango. (0, 15)")
    }
    
}
calificacion(16)


/*
Part 2
Open a repl.it Javascript page and call it Algorithms Introduction Exercise 2.
Write an algorithm to find the largest among 5 different numbers entered by the user.
Print out the largest number to the console.*/

var arr = [3,552,79,1,88] // esta es la lista
var mayor = arr[0]; // mayor es igual a la posicion 0 del array, para que empieze la iteracion desde el primero
for (var i = 0; i < arr.length; i++) { 
    // compara el valor de i , si es menor al largo del array , le suma
    //1 al i IMPORTANTE: en la segunda parte del for dice que se detendra 
    //cuando i sea mayor al largo de array
    //por lo que obliga al if pasar por todos los numeros comparando
    if (mayor < arr[i] ) { 
        //compara la primera posicion del array
        //si mayor osea el numer en la posicion de arr[] es MENOR a el numero que esta en 
        //array[i] sigue
        mayor = arr[i]; 
        //hace que var mayor sea igual al numero al cual se comparo y vuelve al for 
    }
}
console.log(mayor);

/* Part 3
Open a repl.it Javascript page and call it Algorithms Introduction Exercise 3.
We have 3 items and we know the price for each. However, we can only buy the two least expensive items.
Write an algorithm that takes in three user inputs and outputs the two smallest prices to the console. 
*/

function dosnumpek(x, y, z) 

var arr = [x, y, z] // esta es la lista
var menor1 = arr[0]
var menor2 = arr[1]; 
for (var i = 0; i < arr.length; i++) { 
    // compara el valor de i , si es menor al largo del array , le suma
    //1 al i IMPORTANTE: en la segunda parte del for dice que se detendra 
    //cuando i sea mayor al largo de array
    //por lo que obliga al if pasar por todos los numeros comparando
    if (mayor < arr[i] ) { 
        //compara la primera posicion del array
        //si mayor osea el numer en la posicion de arr[] es MENOR a el numero que esta en 
        //array[i] sigue
        mayor = arr[i]; 
        //hace que var mayor sea igual al numero al cual se comparo y vuelve al for 
    }
}
console.log(mayor);