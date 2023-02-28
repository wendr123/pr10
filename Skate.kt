class Skate : TovarNaSklade() {
    override fun Q1() :Double {
        return (priceSkate/num2+0.5*(thisYear-yearOfRealiseSkate))
    }
    override fun Q2(): Double {
        return (priceSamoa/num1+0.5*(thisYear-yearOfRealiseSamokat))
    }
    override fun InfoAboutSkate() {
        println("Количество Скейтов на складе $num2")
        println("Цена Скейта $priceSkate")
        println("Год выпуска Скейта $yearOfRealiseSkate")
        println("Качество товара Скейта ${Q1()}")
        println("==============================================")
    } override fun InfoAboutElectroSamokat() {
    }
}




