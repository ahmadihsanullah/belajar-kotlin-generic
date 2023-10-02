package data

class ComparableFruit(val name: String, val quantity: Int):
        Comparable<ComparableFruit>{
    override fun compareTo(other: ComparableFruit): Int {
        return quantity.compareTo(other.quantity)
    }
}
