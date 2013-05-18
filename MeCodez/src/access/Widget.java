package access;

public class Widget {
	private static int inst_counter = 0;

	public Widget() {
		inst_counter++;

		System.out.print(inst_counter);

		switch (inst_counter) {
		case 1:
			System.out.print("st ");
			break;
		case 2:
			System.out.print("nd ");
			break;
		case 3:
			System.out.print("rd ");
			break;

		default:
			System.out.print("th ");
			break;
		}

		System.out.println(" instance of Widget clas was created");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
