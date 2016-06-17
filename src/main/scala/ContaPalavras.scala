object ContaPalavras {
    def validar(frase: String): Map[String, Int] = {
      if (frase == "")
        Map()
      else{
        var fraseArray: Array[String] = frase.split(" ")
        fraseArray.map((x:String) => x -> fraseArray.count(_ == x)).toMap
      }
    }
}
