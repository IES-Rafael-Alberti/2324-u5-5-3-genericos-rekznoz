
class Pila<T> {
    private val elementos = mutableListOf<T>()

    fun push(elemento: T) {
        elementos.add(elemento)
    }

    fun pop(){
        if (elementos.isNotEmpty()) {
            elementos.removeAt(elementos.size - 1)
        }
    }

    fun tope(): T? {
        if (elementos.isEmpty()) {
            return null
        }
        return elementos[elementos.size - 1]
    }

    fun vacia(): Boolean {
        return elementos.isEmpty()
    }
}
