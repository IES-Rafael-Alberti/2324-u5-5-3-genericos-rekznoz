
fun <T> reverse(lista: List<T>): List<T> {
    val pila = Pila<T>()
    val resultado = mutableListOf<T>()

    val iterador = lista.iterator()
    while (iterador.hasNext()) {
        pila.push(iterador.next())
    }

    while (!pila.vacia()) {
        pila.tope()?.let {
            resultado.add(it)
        }
        pila.pop()
    }

    return resultado
}

fun validarEstructura(cadena: String): Boolean {
    val pila = Pila<Char>()
    val estructura = mapOf(')' to '(', ']' to '[', '}' to '{')

    val iterator = cadena.iterator()
    while (iterator.hasNext()) {
        val caracter = iterator.next()
        if (estructura.contains(caracter)) {
            if (pila.tope() == estructura[caracter]) {
                pila.pop()
            }
        } else {
            pila.push(caracter)
        }
    }

    return pila.vacia()
}

fun main(args: Array<String>) {
    val listaNumeros = listOf("Uno", "Dos", "Tres", "Cuatro")
    val listaNumReversa = reverse(listaNumeros)
    if (listOf("Cuatro", "Tres", "Dos", "Uno") == listaNumReversa) {
        println("Correcto")
    } else {
        println("Error: $listaNumReversa")
    }
    println(listaNumReversa)

    println("----------------------")

    var validacion = "(([()]{}[(())]))"
    if (validarEstructura(validacion)) {
        println("Correcto")
    } else {
        println("Error: $validacion")
    }
    println(validacion)

    println("----------------------")

    validacion = "(([()]{[(())))"
    if (validarEstructura(validacion)) {
        println("Correcto")
    } else {
        println("Error: $validacion")
    }
    println(validacion)
}