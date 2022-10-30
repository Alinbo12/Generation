var matriz =[1,5,2,3,6,7]
var matriz2 =[1,5,2,3,2,7]

//IndexOF --> me devuelve la posición en la que está el elemento
console.log(matriz.indexOf(3));

console.log(matriz2.indexOf(2)); //me manda el primero que encuentra 

// pop --> elimina el ÚLTIMO elemento de la matriz
console.log(matriz.pop()); // me trae el que eliminó --> matriz quedó como [1,5,2,3,6]

//push --> agrega un elemento al final de la matriz
matriz.push(8) // [1,5,2,3,6,8]
console.log(matriz)
console.log(matriz.push(8)) // --> nos trae la posición en la que lo agregó
 
//splice --> sirve para incentar, editar y eliminar objetivos de una matriz en una posición (índice) determinada
/*matriz.splice (1,0,5) --> me agrega un 5 en el índice 1, moviendo todo a la derecha
matriz.splice (1,1,5) --> me agrega el 5 eliminando índice 1 
matriz.splice (1,2,5) --> me agrega el 5 eliminando índice 1 y 2 (ahora toma 2 argumentos, elementos)
matriz.splice (1,2) --> elimina el elemento de la posición 1 y 2 
matriz.splice (2) --> elimina todo lo que hay desde el índice 2

matriz.splice(2,0,5) // nos agrega un número en la posición que le indiquemos
console.log(matriz)
*/

// UnShif --> agrega elementos al inicio de la matriz

const matriz4 = [1,5,2,3,6,8,8]
matriz4.unshift("palabra", 8)
console.log(matriz4)

// Shift --> elimina el PRIMER objeto en la matriz

const matriz5 = [1,5,2,3,6,8,8]
matriz5.shift()
console.log(matriz5)

//Slice --> devuelte una parte de la matriz en formato matriz

const matriz6 = [1,5,8,4,6,8]
const sliceMatriz6 = matriz.slice(2,5) // --> entrega la matriz con la posición 2 a la 5
console.log(matriz6)
console.log(sliceMatriz6)

console.log(matriz6)
const sliceMatriz1 = matriz6.slice (2); // --> entrega parte de una matriz desde el indice 2 al final
const sliceMatriz2 = matriz6.slice (-3); // -->  entres los 3 últimos digidos de la matroz
const sliceMatriz3 = matriz6.slice (2,-2); // --> entrega una parte de la matriz, desde el 2 hasta 2 posiciones menos de izquierda a derech
const sliceMatriz4 = matriz6.slice (0); // --> nopasa nada

console.log(sliceMatriz1)
console.log(sliceMatriz2)
console.log(sliceMatriz3)
console.log(sliceMatriz4)

/* tipos de declaraciones de variables
var -> se ocupa cuando una declara una varabiale GLOBAL
let -> se ocupa cuando una declara una variable LOCAL
const -> se ocupa cuando una declara una variable que NO DEBE CAMBIAR
 var: Declara una variable de scope global o local para la función sin importar el ámbito de bloque. 
Permite hoisting.

let: Declara una variable de scope global, local para la función o de bloque.
 Es reasignable y no permite hoisting.

const: Declara una variable de scope global, local para la función o de bloque. 
No es reasignable, pero es mutable. No permite hoisting.
*/

