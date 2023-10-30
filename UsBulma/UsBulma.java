package UsBulma;

public class UsBulma {

        static void us(int base, int power) {

            int result = 1;
            for(int i=1; i<=power; i++) {
                result=result*base;
            }

            System.out.println(result);

        }

        public static void main(String[] args) {

            us(3,3);
        }
}
