package Lesson40_hometask;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FistTask {
	public static void main(String[] args) {
		
		//принимает переменную типа Integer и возрощает методом Boolean
		Predicate<Integer> numbers = a -> a%2 ==0;
		System.out.println(numbers.test(12));
		
		//Принимает переменную типа String и возврощает элемент типом Integer
		Function<String, Integer> lenghtFunction =a -> a.length();
		Integer a =lenghtFunction.apply("Hello");
		System.out.println(a);
		
		//Принимает пита String и не возврощает
		Consumer<String> aConsumer= b -> System.out.println(b);
		System.out.println(aConsumer);
		
		//ничего не принимает и ничего не возврощает
		Supplier<Double> randomNumber =() -> Math.random();
		System.out.println(randomNumber.get());
		
		
		
	}
}
