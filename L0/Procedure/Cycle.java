package L0.Procedure;

public class Cycle {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        int oleksandr = 0;

        while (oleksandr < 10){
            System.out.println(oleksandr);
            oleksandr++;
        }
        oleksandr = 5;
    }
}
