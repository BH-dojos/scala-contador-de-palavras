import org.scalatest.{BeforeAndAfterEach, FunSuite}

class ContaPalavrasTest extends FunSuite with BeforeAndAfterEach {

  val StringVazia: String = ""

  test("Deve retornar um ,ap vazio caso string vazia") {
    assert(ContaPalavras.validar(StringVazia) == Map())
  }

  test("Deve retornar um map com a palavra e contar 1") {
    assert(ContaPalavras.validar("AloGalera") == Map("AloGalera" -> 1))
  }

}
