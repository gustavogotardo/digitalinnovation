package one.digitalinnovation.digionebank

class Pessoa {
    var nome: String = "Jether"

    var cpf: String = "123.123.123-12"
    private set

    inner class Endereco{
        var cep: String = "12345-678"
        var rua: String = "Rua Teste"
        var numero: String = "125"
        var bairro: String = "Parque Teste"
        var cidade: String = "São Teste"
        var estado: String = "São Teste"
    }
}

fun main() {
    val jether = Pessoa()

    println(jether.nome)
    println(jether.cpf)

    println(jether.Endereco().rua)
}