package dz1;

   //������� �1
	// �������� ����� ����������� ��������� a * (b + (c / d))
	// � ������������ ���������,��� a, b, c, d � ������� ��������� ����� ������;

   //������� �2
    // �������� �����, ����������� �� ���� ��� �����, � ����������� ��� �� �����
    // ����� � �������� �� 10 �� 20(������������), ���� �� � ������� true, � ��������� ������ � false;

   //������� �3
    //�������� �����, �������� � �������� ��������� ���������� ����� �����,
    //����� ������ ���������� � ������� ������������� �� ����� ��������, ��� �������������; ���������: ���� ������� ������������� ������.

   //������� �4
    //�������� �����, �������� � �������� ��������� ���������� ����� �����, 
    //����� ������ ������� true, ���� ����� �������������;

   //������� �5
    //�������� �����, �������� � �������� ��������� ���������� ������, ������������ ���,
    //����� ������ ������� � ������� ��������� �������, ���������_���!�;

   //������� �6
    //�������� �����, ������� ���������� �������� �� ��� ����������, 
    //� ������� ��������� � �������. ������ 4-� ��� �������� ����������,
    //����� ������� 100-��, ��� ���� ������ 400-� � ����������.
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
        System.out.println("Hello� " + name);
    }

    private static boolean isLeapYear(int year) {
        return (year % 100 != 0) && (year % 4 == 0 ) || (year % 400 == 0);
    }
}

