package suhorukov.ache.calculator.commands;

import suhorukov.ache.calculator.ICommand;

import java.util.Map;
import java.util.Stack;

/**
 * Created by demo4 on 25.06.14.
 */
public class PushCommand implements ICommand {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> def, String[] args) {
        Double a = def.get(args[1]);
        if(a == null)
        {
            a = new Double(args[1]);
        }
        stack.push(a);
    }
}
