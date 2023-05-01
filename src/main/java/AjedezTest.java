public class AjedezTest {


    public static void main(String[] args) {
        TablAjedez();
    }

    public static void TablAjedez() {

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++){
                System.out.print(" ");
                System.out.print((i + j) % 2 == 0 ? "B" : "N");
            }
            System.out.println();
        }
    }

}
