package study;

public class Numbers {
    public void summaNumbers () {
       int number1 = 3;
        int number2 = 12;
        int sum = 0;
        for( int i=number1+1;  i<number2;i++) {
            if (i%3 ==0) {
                sum += i;
            }
        }
        System.out.println("Sum:" + sum);
    }
}
