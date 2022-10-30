// BUCLES --> algo que se repite
// iteración --> repetición del bucle
/*
for
cómo se declara

for(var i = 0; i < 9; i++){
    proceso
}

forEach
var matriz = [1,5,8,6,7]
matriz.forEach(x => proceso) --> => es una flecha
*/

var matrizPrecios = [100,500,800,600,700]
// dada la matriz de precio, tenemos una descuento del 15% hoy, cómo queda el precio?
var nuevosPrecios = []
matrizPrecios.forEach(numero=>nuevosPrecios.push(numero*0.85)) // número sabe que va a ver los valores
console.log(nuevosPrecios)


/* ciclos while
    While (condiciónVerdadera){
        esto itera
    }

    do{

        al menos va a entrar y de ahí ve si la condición es verdad o no 
    }while (Condición){
*/

var x = 4
    // while(4>=3){
  //  console.log('sí ') // --> cuidado con esto que no va a parar


// while(x>=3){
   // console.log('sí');
    // x--
    // console.log(x);  --> tb genera un bucle infinito
    // break termina el bucle con un if

   
// refactorizar --> optimizar el código

