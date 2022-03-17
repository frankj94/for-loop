public class loop00 {
    public static void main(String args[]) {
        String bottles = "bottles";
        String phrase00 = "of beer on the wall,";
        String phrase01 = "bottles of beer.";
        String phrase02 = "Take one down and pass it around,";
        String phrase03 = "No more bottles of beer on the wall";
        String phrase04 = "no more bottle of beer.";
        String phrase05 = "Go to the store and buy some more, 99 bottles of beer on the wall.";
        for(int beer = 99; beer > 0; beer --) {
            if(beer == 1) {
                bottles = "bottle";
            }
            System.out.println(beer + " " + bottles + " " + phrase00);
            System.out.println(beer + " " + bottles + " " + phrase01);
            System.out.println(phrase02);
            if(beer > 1) {
                System.out.println(beer -1 + " " + bottles + phrase00);
            } else {
                System.out.println(phrase03 + " " + phrase04);
                System.out.println(phrase05);
            }
        }
    }
}
