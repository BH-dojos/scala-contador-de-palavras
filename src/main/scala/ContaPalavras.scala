/**
  * Created by fviane on 6/15/16.
  */
object ContaPalavras {
    def validar(palavra: String) = {
      if (palavra == "")
        Map()
      else{
        var palavras = palavra.split(" ")
        palavras.map(_ -> 1).toMap
        //print(palavras)
      }
    }
}
