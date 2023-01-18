import java.util

object Main extends App {

  class Person(nameAndSurname: String) {
    val res = nameAndSurname.split(" ")
    val firstName = res(0)
    val lastName = res(1)
  }

  println(new Person("Ivan Ivanov").firstName)
  println(new Person("Ivan Petrov").lastName)
}