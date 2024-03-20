package befaster.solutions.FIZ;

import befaster.runner.SolutionNotImplementedException;

public class FizzBuzzSolution {

    public String fizz_buzz(Integer number){
        return null;
    }

    public String fizzBuzz(Integer number) {
        boolean multiple3 = multipleOf3(number);
        boolean multiple5 = multipleOf5(number);

        if(multiple3 && multiple5){
            return "fizz buzz";
        }

        if(multiple3){
            return "fizz";
        }

        if(multiple5){
            return "buzz";
        }

        return number.toString();
    }

    public boolean multipleOf3(Integer number){
        return number % 3 == 0;
    }

    public boolean multipleOf5(Integer number){
        return number % 5 == 0;
    }

    public boolean hasGoalInIt(Integer number, int goal){
        while(number > 0){
            if(number % 10 == goal){
                return true;
            }
            number = number / 10;
        }
        return false;
    }

}

