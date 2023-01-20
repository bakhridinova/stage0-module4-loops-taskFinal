package school.mjc.stage0.loops.finalTask;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        for (int i = cathetusLength - 1; i > -1; i--){
            for (int j = 0; j < cathetusLength; j++){
                if (j >= i){
                    System.out.print("*");
                    continue;
                }

                System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }
}
