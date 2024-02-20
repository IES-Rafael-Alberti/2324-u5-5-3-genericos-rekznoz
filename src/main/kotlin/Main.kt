
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

fun main(args: Array<String>) {
    val listaNumeros = listOf("Uno", "Dos", "Tres", "Cuatro")
    val listaNumReversa = reverse(listaNumeros)
    if (listOf("Cuatro", "Tres", "Dos", "Uno") == listaNumReversa) {
        println("Correcto")
    } else {
        println("Error: $listaNumReversa")
    }
    println(listaNumReversa)
}