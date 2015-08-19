package SimpleDotComGame;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        int[] locations = {2,3,4};
        dot.setLocationCells(locations);

        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
        String testResult = "failed";
        String testWhat = " with hit";
        if (result.equals("hit")) { testResult="passed";}
        System.out.println(testResult+testWhat);

        userGuess = "1";
        result = dot.checkYourself(userGuess);
        testResult = "failed";
        testWhat = " with miss";
        if (result.equals("miss")) { testResult="passed";}
        System.out.println(testResult+testWhat);

        userGuess = "3";
        result = dot.checkYourself(userGuess);
        testResult = "failed";
        testWhat = " with hit";
        if (result.equals("hit")) { testResult="passed";}
        System.out.println(testResult+testWhat);

        userGuess = "4";
        result = dot.checkYourself(userGuess);
        testResult = "failed";
        testWhat = " with kill";
        if (result.equals("kill")) { testResult="passed";}
        System.out.println(testResult+testWhat);


    }

}
