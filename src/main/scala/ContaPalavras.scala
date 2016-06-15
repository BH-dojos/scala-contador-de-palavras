/**
  * Created by fviane on 6/15/16.
  */
object ContaPalavras {
    def validar(palavra: String) = {
      if (palavra == "")
        Map()
      else
        Map(palavra -> 1)
    }
}
