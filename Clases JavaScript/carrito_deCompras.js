const frutas = []
const fruta = prompt('🍒 Feria Market 🍉 ¿qué fruta desea comprar?')

frutas.push(fruta)

while (confirm('¿Desea agregar otro elemento al 🛒?')) {
    const fruta = prompt('¿qué fruta desea comprar?')
    frutas.push(fruta)
}

console.log('Ustede compró: ')
for (let fruta of frutas) {
    console.log(fruta)
}

let verduras = ["plátano, sandía, uva, pera"]

for (let i = 0; i < verduras.length; i++) 
    console.log(frutas[i])

