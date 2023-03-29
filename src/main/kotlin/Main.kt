fun main() {
println(peoplesHeight(listOf(2.1, 3.0, 6.7)))
 println(peoplesHeight(listOf(3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)))
 person()
 var finalList = evenStringIndex(listOf("one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"))
println(finalList)
}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun evenStringIndex(numbers: List<String>): List<String> {
 var anotherList = mutableListOf<String>()
 numbers.forEachIndexed { index, number ->
  if(index % 2 != 0){
   anotherList.add(number)
  }
 }
 return anotherList
}
//fun evenIndeces(): List<String>{
//  for(string in stringList){
//
// }
//
//}
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height
data class SumAndAverageHeights(var sumHeights: Double, var averageHeights: Double)

fun peoplesHeight(heights: Collection<Double>): SumAndAverageHeights {

 val sumHeights = heights.sum()
 val averageHeights = heights.average()
 return SumAndAverageHeights(sumHeights, averageHeights)
}



//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age
data class Person(var name: String, var age: Int, var height: Double, var weight: Double)
fun person(){
 val person1 = Person("Novak", 24,1.5,70.0)
 val person2 = Person("Marion", 25,1.5,70.0)
 val person3 = Person("Novak", 28,1.5,70.0)
 val person4 = Person("Novak", 94,1.5,70.0)
 val person5 = Person("Novak", 56,1.5,70.0)
 val person6 = Person("Novak", 38,1.5,70.0)

 var peopleList = listOf(person1,person2,person3,person4,person5, person6)
// println(peopleList)

 var sortedages = peopleList.sortedByDescending {person -> person.age }
 println(sortedages)
}



/*Write a function that takes in a list of Car objects each with a
registration and mileage attribute and returns the average mileage of
all the vehicles in the list.*/
data class Car(val registration: String, val mileage: Double)
fun car(){
 val car1 = Car("KDH-186", 6000.9)
 val car2 = Car("KDH-187", 7000.9)
 val car3 = Car("KDH-156", 9000.9)
 val car4 = Car("KDH-186", 90000.9)
 val car5 = Car("KDH-186", 168000.9)
  var carList = listOf(car1, car2, car3, car4, car5)
// var milleage = carList.filter { car -> car.mileage }

}