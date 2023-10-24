package com.example.myapplication

class Triangulo (LadoA:Double, LadoB:Double,LadoC:Double){

    val A=LadoA
    val B =LadoB
    val C =LadoC
    //perimetro
    val  perimetro = A+B+C

    //Determinar tipo de triangulo
  fun TipoTriangulo ():String {
      var tipo =""
      if(A==B && B==C) {
         tipo="Equilatero"
      }  else if( A==B || B==C || A==C ) {

        tipo= "Isosceles"

      } else {
          tipo="Escaleno"
      }
      return tipo
  }
    //comprobar si es rectangulo
    fun Rectangulo ():Boolean {

        //odernar los lados
        val orden = listOf(A,B,C).sorted()

       // return (orden[0]*orden[0])+orden[1]*orden[1])=orden[2]*orden[2]

        val cuadradoA = orden[0]*orden[0]
        val cuadradoB = orden[1]*orden[1]
        val cuadradoC = orden[2]*orden[2]
        return cuadradoA+cuadradoB==cuadradoC
    }
}