package Shorts;
	

	public class Reverse3 {
		public static void Task_1(String s) {
			String result = "";
			String[] arr = s.split(" ");
			for (int i = arr.length - 1; i >= 0;) {
				String rev = "";
				int j = arr[i].length() - 1;
				while (j >= 0) {
					char ch = arr[i].charAt(j);
					rev = rev + ch;
					j--;
				}
				result = result + rev + " ";
				break;
			}
			System.out.println(result + arr[0] + " " + arr[1]);
		}

		public static void Task_2(String s) {
			String result = "";
			String[] arr = s.split(" ");
			for (int i = 0; i < arr.length; i++) {
				String rev = "";
				int j = arr[i].length() - 1;
				while (j >= 0) {
					char ch = arr[i].charAt(j);
					rev = rev + ch;
					j--;
				}
				result = result + rev + " ";
			}
			System.out.println(result);
		}

		public static void Task_3(String s) {
			String result = "";
			String[] arr = s.split(" ");
			for (int i = 0; i < arr.length; i++) {
				String rev = "";
				int j = arr[i].length() - 1;
				while (j >= 0) {
					char ch = arr[i].charAt(j);
					rev = rev + ch;
					j--;
				}
				result = result + rev + " ";
			}
			String[] arr1 = result.split(" ");
			for (String w : arr1) {
				char ch = w.toUpperCase().charAt(w.length() - 1);
				System.out.print(w.substring(0, w.length() - 1) + ch + " ");

			}
		}

		public static void main(String[] args) {
			String s = "my name is sanjay";
			Task_1(s);
			Task_2(s);
			Task_3(s);
		}
	}

	
	