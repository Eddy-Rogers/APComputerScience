import java.util.Arrays;

public class arrays {

	public static void main(String[] args) {
		int[][] asdf = {{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}};
		//fourSeven();
		//yass();
		//evod();
		//odev();
		//keyGen(2,2,"key","word");
		fizzbuzz(asdf);
	}
		static void fourSeven(){
			int[][] mat = new int[4][7];
			for(int row = 0; row < mat.length; row++){
				for(int col = 0; col < mat[0].length; col++){
					mat[row][col] = 9;
				}
			}
			for(int row = 0; row < mat.length; row++){
				System.out.println(Arrays.toString(mat[row]));
			}
		}
		static void yass(){
			String[][] mat = new String[5][2];
			for(int row = 0; row < mat.length; row++){
				for(int col = 0; col < mat[0].length; col++){
					mat[row][col] = "yes";
				}
			}
			for(int row = 0; row < mat.length; row++){
				System.out.println(Arrays.toString(mat[row]));
			}
		}
		static void evod(){
			String[][] mat = new String[10][10];
			for(int row = 0; row < mat.length; row++){
				for(int col = 0; col < mat[0].length; col++){
					if(row % 2 == 1){
						mat[row][col] = "even";
					}
					else{
						mat[row][col] = " odd";
					}
				}
			}
			for(int row = 0; row < mat.length; row++){
				System.out.println(Arrays.toString(mat[row]));
			}
		}
		static void odev(){
			String[][] mat = new String[10][10];
			for(int col = 0; col < mat[0].length; col++){
				if(col % 2 == 1){
					for (int row = 0; row < mat.length; row++){
						mat[row][col] = "even";
					}
				}
				else{
					for (int row = 0; row < mat.length; row++){
						mat[row][col] = " odd";
					}
				}
			}
			for (int row = 0; row < mat.length; row++){
				System.out.println(Arrays.toString(mat[row]));
			}
		}
		static void keyGen(int a, int b, String c, String d){
			int count = 0;
			System.out.println(count);
			String[][] mat = new String[a][b];
			for(int row = 0; row < mat.length; row++){
				for(int col = 0; col < mat[0].length; col++){
					int flag = (int)(Math.random()*2);
					if (flag == 0){
						mat[row][col] = d;
					}
					else{
						mat[row][col] = "heythatsprettygood";
					}
				}
			}
			for(int hey = 0; hey < mat.length; hey++){
				System.out.println(Arrays.toString(mat[hey]));
		}
	}
		static void question2(){
			
		}
		static void fizzbuzz(int[][] a){
			String[][] mat = new String[a.length][a[0].length];
			for(int row = 0; row < mat.length; row++){
				for(int col = 0; col < mat[0].length; col++){
					if(a[row][col] % 3 == 0 && a[row][col] % 5 == 0){
						mat[row][col] = "FizzBuzz";
					}
					else if(row % 5 == 0){
						mat[row][col] = "Buzz";
					}
					else if(row % 3 == 0){
						mat[row][col] = "Fizz";
					}
					else{
						mat[row][col] = String.valueOf(a[row][col]);
					}
				}
			}
			for(int hey = 0; hey < mat.length; hey++){
				System.out.println(Arrays.toString(mat[hey]));
		}
	}
}
