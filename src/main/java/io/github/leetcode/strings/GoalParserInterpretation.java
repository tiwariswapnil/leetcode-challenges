package io.github.leetcode.strings;

public class GoalParserInterpretation {

    public String interpret(String command) {
        return command.replace("()", "o").replace("(al)", "al");
    }

}
