package at.htl.nvs.kneidinger.microprofilekneidinger

import at.htl.nvs.kneidinger.microprofilekneidinger.entity.Car
import at.htl.nvs.kneidinger.microprofilekneidinger.entity.Person
import at.htl.nvs.kneidinger.microprofilekneidinger.persistence.CarRepository
import at.htl.nvs.kneidinger.microprofilekneidinger.persistence.PersonRepository
import javax.annotation.PostConstruct
import javax.ejb.Singleton
import javax.ejb.Startup
import javax.inject.Inject

@Startup
@Singleton
open class InitBean {
    @Inject
    open lateinit var carRepository: CarRepository
    @Inject
    open lateinit var personRepository: PersonRepository

    @PostConstruct
    fun init() {
        val p1 = personRepository.create(Person(name = "Bürgi"))
        val p2 = personRepository.create(Person(name = "Bizi"))

        carRepository.create(Car(brand = "Audi", type = "A6", owner = p2))
        carRepository.create(Car(brand = "Audi", type = "RS8", owner = p2))
        carRepository.create(Car(brand = "Opel", type = "Corse", owner = p1))
    }

}