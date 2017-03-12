import java.util.*;
public class Chapter13Exercise {
	static MyCalendar calendar = new MyCalendar();

		public static void main(String[] args) {
		    int month = 0 ;
		    int year = 0 ;

		    printMonth(year, month);
		  }

		  static void printMonth(int year, int month) {
		    MyCalendar startDay = getStartDay();


		    printMonthTitle(year, month);

		  }

		  static MyCalendar getStartDay() {
		    return calendar;
		  }

		  static void printMonthBody(MyCalendar startDay, int numOfDaysInMonth) {
		    int i = 0;

		      System.out.print("    ");

		    for (i = 1; i <= numOfDaysInMonth; i++) {
		      if (i < 10)
		        System.out.print("   "+i);
		      else
		        System.out.print("  "+i);

		        System.out.println();
		    }

		    System.out.println("");
		  }

		  static void printMonthTitle(int year, int month) {
		    System.out.println("  "+Calendar()+", "+year);
		    System.out.println("---");
		    System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
		  }

		private static String Calendar(){
			return null;
		}
		
	}


