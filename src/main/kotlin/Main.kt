fun main() {
println(peoplesHeight(listOf(2.1, 3.0, 6.7)))
 println(peoplesHeight(listOf(3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0, 10.0)))
 var peopleList = person(mutableListOf(Person("Novak", 56,1.5,70.0),
 Person("Marion", 25,1.5,70.0),
Person("Novak", 28,1.5,70.0)))
 var finalList = evenStringIndex(listOf("Zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "ten"))
println(finalList)
println(car(mutableListOf(Car("KDH-186", 6000),
        Car("KDH-187", 120000),
        Car("KDH-156", 130000),
        Car("KDH-186", 90000),
 Car("KDH-186", 168000))))
 twoPeople(mutableListOf(Person("Loice",18,6.1,50.0)))
 secondOccurenceIndex(listOf(32,33,35,33,37,38,39))


}

//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc


fun evenStringIndex(numbers: List<String>): List<String> {
 var anotherList = mutableListOf<String>()
 numbers.forEachIndexed { index, number ->
  if(index % 2 == 0){
   anotherList.add(number)
  }
 }
 return anotherList
}

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
fun person(people: List<Person>){
// var peopleList = mutableListOf(person1,person2,person3)
// println(peopleList)
 println(people.sortedByDescending {person -> person.age })
}
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.

fun twoPeople(listOfEveryone: MutableList<Person>){
// var otherPeople = mutableListOf<Person>()
listOfEveryone.addAll(mutableListOf(Person("Vee", 13, 1.6, 65.9),
Person("Cyntia", 17, 1.9, 60.9)))
 println(listOfEveryone)
}

/*Write a function that takes in a list of Car objects each with a
registration and mileage attribute and returns the average mileage of
all the vehicles in the list.*/
data class Car(val registration: String, val mileage: Int)
fun car(cars: List<Car>):Int{
 var avarage = 0
 cars.forEach { car ->
  avarage += (car.mileage / cars.size)
 }
 return avarage
}

fun secondOccurenceIndex(list: Collection<Int>){
 list.forEachIndexed { index, element ->
  println("${index}: ${element}")
//  if(element === 33){
//  }
 }
}


