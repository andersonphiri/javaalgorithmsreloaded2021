package com.anderson.algorithms.expressions;

import java.util.Iterator;
import java.util.Stack;

public class DjikstraExpressionEvaluation {
    public static  Double Evaluate(String[] expression) {
        if (null == expression || expression.length < 1) {
            return null;
        }
        Stack<String> operators = new Stack<>();
        Stack<Double> values = new Stack<>();
        String token;
        for (int i = 0; i < expression.length; i++) {
            token = expression[i];
            if(token.equals("("))  {
                continue;
            }
            switch (token) {
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                case "sqrt":
                    operators.push(token);
                    continue;
            }
            if(")".equals(token)) {
                //closing brace needs evaluation
                String operator = operators.pop();
                Double value = values.pop();
                switch (operator) {
                    case "+":
                        value += values.pop();
                        break;
                    case "-":
                        value -= values.pop();
                        break;
                    case "*":
                        value *= values.pop();
                        break;
                    case "%":
                        value %= values.pop();
                    case "/":
                        value /= values.pop();
                    case "sqrt":
                        value = Math.sqrt(value);
                }
                // then update values
                values.push(value);
                continue;
            }
            else {
                values.push(Double.parseDouble(token));
            }
        }
        return values.pop();
    }


}
