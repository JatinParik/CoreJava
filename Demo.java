

class Calc {
    static int add() {
        System.out.println("This method will add");
        return 0;
    }
    int sub() {
        System.out.println("This method will subtract");
        return 0;
    }
}

public class Demo {
    
    public static void main(String[] args) {
        int i = 1;
        for(; i < 6;) {   // For loop as a while loop
            System.out.println("DAY - 0" + i);
            for(int j = 1; j < 9; j++) {
                System.out.println("    " + (j+8) + " - " + (j+9));
            }
            i++;
        }
        Calc calc = new Calc(); //calc --> reference variable of Calc class (stores references of Objects of calculator class)
        Calc.add();  //We can't access items of other class directly
        calc.sub();
        int[][] arr = new int[2][3];
        for(int j = 0; j<arr.length; j++) {
            for(int k = 0; k<arr[j].length; k++) {
                 arr[j][k] = (int)(Math.random()*10);
            }
        }
        for(int j = 0; j<arr.length; j++) {
            for(int k = 0; k<arr[j].length; k++) {
                  System.out.print(arr[j][k] + " ");
            }
            System.out.println();
        }
        for(int[] a : arr) {
            for(int j :  a) {
                 System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
