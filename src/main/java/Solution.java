public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        // remove 0.0 and return your answer
        return (t1+t2+t3+t4)/4;
    }

    public int roundAverage(double average) {
        // remove 0 and return your answer
        return (int)(average+0.5);
    }

    public boolean isPassing(int roundedAverage) {
        // remove false and return your answer
        if (roundedAverage >= 65) {
            return true;
        }
        else {
            return false;
    }
}
    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        // remove 0.0 and return your answer
        double total = (shares*price);
        return total;
    }


    public int roundValueChange(double totalStock) {
        // remove 0 and return your answer
        if (totalStock < 0) {
             return (int)(totalStock-0.5);
        }
           else {
            return (int)(totalStock-0.5);
        }
     }    
     /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        // remove 0.0 and return your answer
        int third = (int)(userDouble/100)%10+1;
        int second = (int)(userDouble/10)%10+1;
        int first = (int)((userDouble)%10+1)%10;
        int tenth = (int)(userDouble*10)%10+1;
        int hundredth = (int)(userDouble*100)%10+1;
        return (hundredth*.01+tenth*.1+first+second*10+third*100);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
