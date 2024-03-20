package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashSet;
import java.util.Set;

public class FizzBuzzSolution {

    public String fizz_buzz(Integer number){
        if(multipleOf3(number) || hasGoalInIt(number, 3) && multipleOf5(number) || hasGoalInIt(number, 5)){
            return "fizz buzz";
        }

        if(multipleOf3(number) || hasGoalInIt(number, 3)){
            return "fizz";
        }

        if(multipleOf5(number) || hasGoalInIt(number, 5)){
            return "buzz";
        }

        return number.toString();
    }

//    public String fizzBuzz(Integer number) {
//        boolean multiple3 = multipleOf3(number);
//        boolean multiple5 = multipleOf5(number);
//
//        if(multiple3 && multiple5){
//            return "fizz buzz";
//        }
//
//        if(multiple3){
//            return "fizz";
//        }
//
//        if(multiple5){
//            return "buzz";
//        }
//
//        return number.toString();
//    }

    public boolean multipleOf3(Integer number){
        return number % 3 == 0;
    }

    public boolean multipleOf5(Integer number){
        return number % 5 == 0;
    }

    public boolean hasGoalInIt(Integer num, int goal){
        Set<Integer> set = new HashSet<>();
        while(true){
            set.add(num / 10);
        }
        int num = (int) num;
        while(num > 0){
            if(num % 10 == goal){
                return true;
            }
            num = num / 10;
        }
        return false;
    }

}



