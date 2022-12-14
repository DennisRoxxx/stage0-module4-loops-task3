package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
       String NUMBER = "9";
       int sum = 0;
       String sum2 = "";


       for (int i = 1; i <= lengthOfLastNumber; i++ ){
           sum2 += NUMBER;
           sum = sum + Integer.parseInt(sum2);
       }

        System.out.println(sum);

    }
}
