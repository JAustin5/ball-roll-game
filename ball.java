// Jalena Austin

// I assert that I have written 100% of this code myself otherwise
// I will receive a 0% grade on this assignment.
//
// Status:
//
// This code is 100% tested and correct

public class ball {

	public static void main(String[] args) {
		int N = Integer.parseInt(args[0]);
		int xArea = Integer.parseInt(args[1]);
		float xPercent = (float) xArea / 100;
		char PlayArea[][] = new char[2*N][N];
		
		// puts '=' for every other row (1, 3, 5, ...) ex. N = 10; 10 X 10
		for(int i = 1; i < PlayArea.length; i += 2) {
			for(int j = 0; j < PlayArea[0].length;++j) {
				PlayArea[i][j] = '=';
			}
		}
		
		// puts ' ' for every other row (0, 2, 4, ...) to start blank spaces for 0
		for (int i = 0; i < PlayArea.length; i += 2) {
			for(int j = 0; j < PlayArea[0].length; ++j) {
				PlayArea[i][j] = ' ';
			}
		}
		
		// get so that these will be printed on all lines of the area an not just the last row
		for (int i = 1; i < PlayArea.length-1; i += 2) {
			for (int j = 0; j < PlayArea[0].length;++j) {
				if(Math.random() <= xPercent) {
					PlayArea[i][j] = ' ';
				}
				else {
					PlayArea[i][j] = '=';
				}	
			}
		}
		
		// ball movement
		boolean OpenSpot = true;		// false
		int rowLocation = 0;
		int columnLocation = 0;
		for(int i = 0; i < PlayArea.length-1;++i) {
			for(int j = 0; j < PlayArea[i].length;++j) {
				if (i == rowLocation && j == columnLocation) {
					PlayArea[i][j] = 'O';
					
					if(PlayArea[i+1][j] == ' ' && OpenSpot) {		// !OpenSpot
						rowLocation += 1;
						OpenSpot = true;
					}
					
					else {
						columnLocation += 1;
					}
				}
					
				else if(PlayArea[i][j] == '=' && !OpenSpot) {	// OpenSpot
					OpenSpot = false;
				}
			}
		}
		
		// prints play area
		for(int i = 0; i < PlayArea.length;++i) {
			for(int j = 0; j < PlayArea[0].length;++j) {
				System.out.print(PlayArea[i][j]);
			}
			System.out.println();
		}

		System.out.println();

	}

}
