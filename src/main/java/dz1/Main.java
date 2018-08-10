package dz1;

   //Задание №1
	// Написать метод вычисляющий выражение a * (b + (c / d))
	// и возвращающий результат,где a, b, c, d – входные параметры этого метода;

   //Задание №2
    // Написать метод, принимающий на вход два числа, и проверяющий что их сумма
    // лежит в пределах от 10 до 20(включительно), если да – вернуть true, в противном случае – false;

   //Задание №3
    //Написать метод, которому в качестве параметра передается целое число,
    //метод должен напечатать в консоль положительное ли число передали, или отрицательное; Замечание: ноль считаем положительным числом.

   //Задание №4
    //Написать метод, которому в качестве параметра передается целое число, 
    //метод должен вернуть true, если число отрицательное;

   //Задание №5
    //Написать метод, которому в качестве параметра передается строка, обозначающая имя,
    //метод должен вывести в консоль сообщение «Привет, указанное_имя!»;

   //Задание №6
    //Написать метод, который определяет является ли год високосным, 
    //и выводит сообщение в консоль. Каждый 4-й год является високосным,
    //кроме каждого 100-го, при этом каждый 400-й – високосный.
public class Main {
	public static void main(String[] args) {
          //  System.out.println(calculate(1,2,3,4));
	      //  System.out.println(checkTwoNum(1,2));
	      //  printIsPositive(-5);
	        System.out.println("A leap year? " + isLeapYear(505));
	      
		
	}
	private static double calculate(int a, int b, int c, int d) {
        return a *(b + (c / d));
    }
	
	private static boolean checkTwoNum(int first, int second) {
        int sum = first + second;
        return  sum <= 20 && sum >= 10;
    }

    private static void printIsPositive(int a) {
        System.out.println("number " + ((a >= 0) ? "positive" : "negative") + "!");
    }

    private static void printName(String name) {
        System.out.println("Hello‚ " + name);
    }

    private static boolean isLeapYear(int year) {
        return (year % 100 != 0) && (year % 4 == 0 ) || (year % 400 == 0);
    }
}

