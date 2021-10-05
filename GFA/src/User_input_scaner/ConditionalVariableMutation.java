package User_input_scaner;

public class ConditionalVariableMutation {
    public static void main(String[] args) {
        double a = 24;
        int output1 = 0;
        // if a is even increment out by one
        double num1 = a;
        num1 = num1%2;
        if(num1==0){
            a++;
            System.out.println("This number was incremented to "+a+" from even number: "+(a-1)); // <-RESULT
        }

        //System.out.println(output1);  Result is writen in condition


        int b = 13;
        String output2 = "";
        // if b is between 10 and 20 set out2 to "Sweet!"
        // if less than 10 set out2 to "Less!",
        // if more than 20 set out2 to "More!"
        if (b >= 10 && b <= 20){
            output2 = "Sweet!";
        } else if (b >= 10 ){
            output2 = "Less!";
        }else if (b <= 20 ){
           output2 = "More!";
        }


        System.out.println(output2);


        int c = 123;
        int credits = 100;
        boolean isBonus = false;
        // if credits are at least 50,
        // and isBonus is false decrement c by 2
        if (credits >= 50 && isBonus == false){
            c=c-2;
        }

        // if credits are smaller than 50,
        // and isBonus is false decrement c by 1
        if (credits <= 50 && isBonus == false){
            c--;
        }

        // if isBonus is true c should remain the same
        if (isBonus == true){
            c = c; //This should be blank but i want to show that i know that c will be not changed
        }

        System.out.println(c);


        int d = 8;
        int time = 120;
        String output3 = "";
        // if d is dividable by 4
        // and time is not more than 200
        // set out3 to "check"
        boolean divid = (d % 4 == 0);

        if (time <= 200 && divid == true){
           output3 = "check";
        }

        // if time is more than 200
        // set out3 to "Time out"
        if (time >= 200 ){
            output3 = "Time out";
        }
        else {output3 = "Run Forest Run!";}

        // otherwise set out3 to "Run Forest Run!"


        System.out.println(output3);
    }
}
