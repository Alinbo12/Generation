function saludo(nombre) {
    console.log('hola, cómo estás?, '+nombre)
}

saludo('fernando')
saludo('maria')


// funciones básicas de cadena (String)

var oracion = 'esta es una oración ';
var oracion2 = 'eSTa es uNa oRación ';
var num = '20';
    console.log(oracion.toLowerCase());
    console.log(oracion2.charAt(5));
    console.log(oracion.concat (oracion2));
    console.log(typeof(num));
    var numInt = parseInt (num);
    console.log(typeof(numInt));
    console.log(numInt)

    //cómo dejar mayúscula la primera legra de una oración

var oracion3 = 'esta es otra oración ';
var primeraLetra = oracion3.charAt(0);
var restoOración = oracion3.slice(1,0);
var oracion4 = primeraLetra.toUpperCase().concat(restoOración)
console.log(oracion4)

