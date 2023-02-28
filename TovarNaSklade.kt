abstract class TovarNaSklade {
    var num1 : Int = 5
    var num2 : Double = 7.0
    var yearOfRealiseSkate : Int = 1990
    var yearOfRealiseSamokat : Int = 2017
    var priceSkate : Double = 1500.0
    var priceSamoa : Double = 5000.0
    var thisYear : Int = 2023
    var Q1 : Double = 0.0
    var Q2 : Double = 0.0

    abstract fun Q2():Double
    abstract fun Q1():Double
    abstract fun InfoAboutSkate()
    abstract fun InfoAboutElectroSamokat()
}