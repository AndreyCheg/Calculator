package suhorukov.ache.calculator;

import java.util.Map;
import java.util.Stack;

/**
 * Created by demo4 on 25.06.14.
 */
public interface ICommand {
    public void execute(Stack<Double> stack, Map<String, Double> def, String[] args);
}
