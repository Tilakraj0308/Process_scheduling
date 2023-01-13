import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many processes you wanna process?: ");
		int n = in.nextInt();
		System.out.print("Time quantum : ");
		int tq = in.nextInt();
		Processes p = new Processes(tq);
		for(int i = 1 ; i <= n ; i++) {
			System.out.println("For process: " + i);
			System.out.print("Arrival time: ");
			int ar = in.nextInt();
			System.out.print("Burst time: ");
			int br = in.nextInt();
			p.add("P"+i, ar, br);
		}
		int op = 0;
		while(op != 5) {
			System.out.println("Which scheduling technique you want to perform: ");
			System.out.println("First Come First Serve ------------- 1");
			System.out.println("Shortest Job First ----------------- 2");
			System.out.println("Shortest Remaining Time First ------ 3");
			System.out.println("Round Robin ------------------------ 4");
			op = in.nextInt();
			switch(op) {
			case 1:
				System.out.println("--------First Come First Serve---------------");
				p.fcfs();
				System.out.println();
				break;
			case 2:
				System.out.println("--------Shortest Job First-------------------");
				p.sjf();
				System.out.println();
				break;
			case 3:
				System.out.println("--------Shortest Remaining Time First--------");
				p.srtf();
				System.out.println();
				break;
			case 4:
				System.out.println("--------Round Robin--------------------------");
				p.rr();
				System.out.println();
				break;
			case 5:
				break;
			default:
				System.out.println("Wrong input, try again.");
				System.out.println();
			}
		}
		in.close();
	}

}
