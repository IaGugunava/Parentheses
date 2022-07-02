import java.util.*;

public class Main {


    static boolean isProperly(String expr)
    {

        Deque<Character> stack
                = new ArrayDeque<Character>();

        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);

            if (x == '(')
            {
                stack.push(x);
                continue;
            }

            if (stack.isEmpty())
                return false;
            char check;

            if(x==')'){
                check = stack.pop();
            }
            else{
                return false;
            }

        }


        return (stack.isEmpty());
    }


    public static void main(String[] args)
    {
        String expr1 = "())";
        String expr2 = "()";
        // Function call
        if (isProperly(expr1))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
        if (isProperly(expr2))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}