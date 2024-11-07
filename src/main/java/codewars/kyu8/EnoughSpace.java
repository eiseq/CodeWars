package codewars.kyu8;

public class EnoughSpace {
    public static int enough(int cap, int on, int wait){
        int remainingSpace = cap - on;
        return remainingSpace >= wait ? 0 : wait - remainingSpace;
    }
}
