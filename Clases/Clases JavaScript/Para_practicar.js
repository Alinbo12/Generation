/* Crear un programa donde el usuario ingrese la temperatura en Celcius y el programa
muestre en consola la temperatura en Fahrenheit. */

// función que me agarré la temperatura ingresada (en celcius)
// que se devuelva la temperatura en Fahrenheit


function ConvertirTemperatura(temperatura) {
    var TemperaturaF = (temperatura * 9/5) + 32
        console.log("La temperatura en Fahrenheit es "+ TemperaturaF)
}

ConvertirTemperatura (100)


//pedir un numero y luego dividirlo por 10
function ingresarnum (number) {
    var x = number / 10
     console.log (x);
 
 }
 ingresarnum (100)
 

 /* Si a = [1,2,3] crear un script que determine de muestre en consola el tipo de dato de a.
## If and else */

/* - Crear un programa que determine si un número es par o no, la respuesta será mostrada
con console.log */

function numeroParImpar (x) {
        if (x % 2 == 0) {
            console.log("el numero ingresado es par")
            } else {        
        console.log("el numero ingresado es impar")
    }}

    numeroParImpar (5)

/* Crear un programa que determine si un número es divisible por 5 o no, mostrar el
resultado con console.log */

function divisibleEnCinco (x) {
    if (x % 5 == 0) {
        console.log("el numero ingresado SÍ es divisible por 5")
    }else{
        console.log("el numero ingresado NO es divisible por 5")
    }
}

divisibleEnCinco (50)

/* Crear un programa que determine si un número introducido es divisible por 11 y 5 o no,
mostrar el resultado con console.log */

/* - Crear un programa que le pida dos números y luego muestre en un console.log el número
mayor. */


    function numeroMayor (a,b) {
        if (a<b){
            console.log(b)
        }else{
            console.log(a)
        }

    }

    numeroMayor (90000,700)


/* El siguiente código tiene un error, descubrirlo y arreglarlo:
~~~javascript
// Obtener edad
if(edad < 13) {
console.log("Es niño");
}if(edad < 18 ){
console.log("Es adolecente");
} else{
console.log("Es adolecente");
}
~~~
## Loops */

/* ALÍN --> NO se definió función
qué pasa si tiene 18 y 13? no tiene rango
es adolescente xd*/

/*
Crear un programa que determine si un número introducido es divisible por 11 y 5 o no,
mostrar el resultado con console.log
*/

function divisibleONCEyCinco (x) {
    if ((x % 11 == 0) && (x % 5 == 0)) {
        console.log ("este número es divisible por 11 y 5");
    }
    else if ((x % 11 == 0) && !(x % 5 == 0)) {
        console.log("este número SOLO es divisile por 11");
    }
    else if ((x % 5 == 0) && !(x % 11 == 0)){
            console.log("este número SOLO es divisible por 5");
    }else{
        console.log("este número no es divisible por 11 NI por 5");
    }
}

divisibleONCEyCinco (55)

/* Mostrar todos los números de 1 a n aumentando de 1 en 1 donde n se ingresa como
número en la función*/

var n = 5 

for (i = 0; i<=n; i++){
    console.log(i)
}
 /*Mostrar todos los números de 1 a N aumentando de 2 en 2 donde n se ingresa como
número en la función */
console.log("------------")

var N2 = 6

for (i=0; i<=N2; i=i+2){
    console.log(i)
}

console.log("------------")

/* Mostrar todos los números de N a 1 disminuyendo de 1 en 1 donde n se ingresa como
número en la función */

var n3 = 8

for (i=n3; i>=1; i--){
    console.log(i)
}

console.log("------------")

/* - Escribir utilizando console.log la tabla del 9 hasta 9x10.*/
// finalmente esta función sirve para cualquier tabla

var tablaDel = 9
    for (i = tablaDel; i <= tablaDel * 10; i = i + tablaDel){
        console.log(i)
    }

console.log("------------")

/* Crear una función que reciba un valor cualquiera y lo muestre ocupando console.log(),
llamar a la función pasando el valor 5*/



function numeroCualquiera (x){
    console.log(x)
}

numeroCualquiera (5)

console.log("------------")

/* La siguiente función devuelve undefined en lugar de la multiplicación, se pide arreglarla
~~~js
function multiply(a, b){
a * b
}
~~~ */

function multiply(a, b){
    var c = a
    var d = b
    c * d
}

multiply (2, 4)