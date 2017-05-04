package com.java.examples.quiz;

import java.util.Scanner;

import com.java.examples.quiz.ArrayStack;
public class Evaluate {
    public static void main(String[] args) { 
        ArrayStack ops  = new ArrayStack();
        ArrayStack vals = new ArrayStack();
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter an expression to evaluate: ");

        while (!scan.hasNext()) {
            String s = scan.next();
            if      (s.equals("("))               ;
            else if (s.equals("+"))    ops.push(s);
            else if (s.equals("-"))    ops.push(s);
            else if (s.equals("*"))    ops.push(s);
            else if (s.equals("/"))    ops.push(s);
            else if (s.equals("sqrt")) ops.push(s);
            else if (s.equals(")")) {
                String op = ops.pop();
                double v = Double.parseDouble(vals.pop());
                if      (op.equals("+"))    v = Double.parseDouble(vals.pop()) + v;
                else if (op.equals("-"))    v = Double.parseDouble(vals.pop()) - v;
                else if (op.equals("*"))    v = Double.parseDouble(vals.pop()) * v;
                else if (op.equals("/"))    v = Double.parseDouble(vals.pop()) / v;
                else if (op.equals("sqrt")) v = Math.sqrt(v);
               String str = Double.toString(v);
                vals.push(str);
            }
            //else vals.push(Double.parseDouble(v));
        }
        System.out.println(vals.pop());
    }
}
