
def integracion(a: Double, b: Double, f: Double => Double): Double = {
  
  val xBar = (a + b) / 2 
  (b - a) * (f(a) + 4 * f(xBar) + f(b)) / 6 
}
def error(valorEsperado: Double, valorObtenido: Double): Double =
  (valorEsperado - valorObtenido).abs



val f1 = (x: Double) => -x * x + 8 * x - 12 
val i1 = integracion(3, 5, f1)

error(7.33, i1) 

val f2 = (x: Double) => 3 * x * x 
val i2 = integracion(0, 2, f2)
error(8, i2)


val f3 = (x: Double) => x + 2*x*x - x*x*x + 5*math.pow(x,4)
val i3 = integracion(-1, 1, f3)
error(3.333, i3)


val f4 = (x: Double) => (2*x + 1) / (x*x + x)
val i4 = integracion(1, 2, f4)
error(1.09861, i4)

val f5 = (x: Double) => math.exp(x) 
val i5 = integracion(0, 1, f5)
error(1.71828, i5)

val f6 = (x: Double) => 1 / (x - 1)
val i6 = integracion(2, 3, f6)
error(0.828427, i6)


val f7 = (x: Double) => 1 / (1 + x*x)
val i7 = integracion(0, 1, f7)
error(0.785398, i7)