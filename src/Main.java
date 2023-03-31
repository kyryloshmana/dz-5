public class Main {
    public static void main(String[] args) {

        int a = 5;
        int b = 1;
        int c = 2;
        int d = 1;

        int ab = a + b;
        int cd = c + d;
        System.out.println("ab is " + ab + " and cd is " + cd);
        System.out.println("First sum biggest than second:" + Main.verifyData(ab,cd));
        System.out.println("New ab is " + ++ab);
        cd = cd-2;
        System.out.println("New cd is " + cd);
        System.out.println("First sum biggest than second: " + Main.verifyData(ab,cd));
        boolean isMultipleOfTwo =  ((ab%2==0) && (ab!=0)) || ((cd%2==0) && (cd!=0));
        System.out.println("Оne sum is a multiple of two: " + isMultipleOfTwo);
    }

    static boolean verifyData (int first, int second){
        return first > second;
    }
}
