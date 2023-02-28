class ElectroSamokat : TovarNaSklade() {
    override fun Q1() :Double {
        return (priceSkate/num2+0.5*(thisYear-yearOfRealiseSkate))
    }
    override fun Q2(): Double {
        return (priceSamoa/num1+0.5*(thisYear-yearOfRealiseSamokat))
    } override fun InfoAboutElectroSamokat() {
        println("Количество Электро-самокатов на складе $num1")
        println("Цена Электро-самоката $priceSamoa")
        println("Год выпуска Электро-самоката $yearOfRealiseSamokat")
        println("Качество товара Электро-самоката ${Q2()}")
    } override fun InfoAboutSkate() {
    }
}