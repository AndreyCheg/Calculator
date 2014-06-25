package suhorukov.ache.calculator.commands;

import suhorukov.ache.calculator.ICommand;

import java.util.Map;
import java.util.Stack;

/**
 * Created by demo4 on 25.06.14.
 */
public class AddCommand implements ICommand {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> def, String[] args) {
        double a = stack.pop();
        double b = stack.pop();
        stack.push(a + b);
    }
}
