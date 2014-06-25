package suhorukov.ache.calculator;

import suhorukov.ache.calculator.commands.AddCommand;
import suhorukov.ache.calculator.commands.DefCommand;
import suhorukov.ache.calculator.commands.PushCommand;

import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Stack;

/**
 * Created by demo4 on 25.06.14.
 */
public class Calculator {
    private Stack<Double> stack;
    private Map<String, Double> dict;
    private Map<String, ICommand> commandsMap;

    Calculator(){
        stack = new Stack();
        dict  = new HashMap<String, Double>();
        commandsMap = new HashMap<String, ICommand>();
        // fill commandsMap by commands from calculator.commands pack
        commandsMap.put("add", new AddCommand());
        commandsMap.put("def", new DefCommand());
        commandsMap.put("push", new PushCommand());
    }

    Calculator(PrintStream out, Scanner in){
        this();
        this.execute(out, in);
    }

    public void execute(PrintStream out, Scanner in){
        while(in.hasNextLine()){
            String str = in.nextLine();
            String[] arg = str.split(" ");
            commandsMap.get(arg[0]).execute(stack, dict, arg);
            //in.nextLine();
        }
        out.println(stack.pop());
    }

    public static void main(String[] arg){
        Calculator calc = new Calculator(System.out, new Scanner("def a 4\n push 5\n push a\n add"));
    }
}
