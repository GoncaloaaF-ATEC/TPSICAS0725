
class Pessoa(private var _nome: String, var idade: Int = 15){

    var nome: String
        get() {
            println("Get do nome")
            return _nome
        }

        set(value) {
            println("Set do nome")
            val v = value.capitalize()
            _nome = v
        }

    var turma: String = "Sem turma"

    init {
       // println("a Pessoa $nome foi criada")
    }

    constructor(nome: String, idade: Int = 15, turma: String): this(nome, idade){
        this.turma = turma
        println("constructor")
    }


    fun anoNac(): Int{
        return 2026 - this.idade
    }

}