package suhorukov.ache.calculator.commands;

import suhorukov.ache.calculator.ICommand;

import java.util.Map;
import java.util.Stack;

/**
 * Created by demo4 on 25.06.14.
 */
public class DefCommand implements ICommand {
    @Override
    public void execute(Stack<Double> stack, Map<String, Double> def, String[] args){
        def.put(args[1], new Double(args[2]));
    }
}
