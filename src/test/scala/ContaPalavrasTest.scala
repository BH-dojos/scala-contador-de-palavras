import org.scalatest.{BeforeAndAfterEach, FunSuite}

class ContaPalavrasTest extends FunSuite with BeforeAndAfterEach {

  val StringVazia: String = ""

  test("Deve retornar um map vazio caso string vazia") {
    assert(ContaPalavras.validar(StringVazia) == Map())
  }

  test("Deve retornar um map com a palavra e contar 1") {
    assert(ContaPalavras.validar("AloGalera") == Map("AloGalera" -> 1))
  }

  test("Deve retornar um map com as palavras diferentes, para 2"){
    assert(ContaPalavras.validar("Alo galera") == Map("Alo" -> 1, "galera" -> 1))
  }

  test("Deve retornar um map com as palavras diferentes, para 3"){
    assert(ContaPalavras.validar("alo alo galera") == Map("alo" -> 2, "galera" -> 1))
  }

  /*test("Deve retornar um map com as palavras diferentes, para 3"){
    assert(ContaPalavras.validar("alo galera palavras") == Map("alo" -> 1, "galera" -> 1, "palavras" -> 1))
  }*/
}
