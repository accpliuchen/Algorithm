package com.interview.hackerrank.exercise8;

import java.util.Scanner;

class Parser {
    private int pos = 0;
    private String input;

    public Parser(String input) {
        this.input = input;
    }

    public String parse() {
        return parseExpression();
    }

    private String parseExpression() {
        String left = parseFactor();
        while (pos < input.length() && (input.charAt(pos) == '+' || input.charAt(pos) == '*')) {
            char op = input.charAt(pos);
            pos++;
            String right = parseFactor();
            if (op == '+') {
                left += right;
            } else {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < Integer.parseInt(right); i++) {
                    sb.append(left);
                }
                left = sb.toString();
            }
        }
        return left;
    }

    private String parseFactor() {
        if (input.charAt(pos) == '(') {
            pos++;
            String result = parseExpression();
            pos++;
            return result;
        } else {
            StringBuilder sb = new StringBuilder();
            while (pos < input.length() && Character.isLetter(input.charAt(pos))) {
                sb.append(input.charAt(pos));
                pos++;
            }
            return sb.toString();
        }
    }
}

public class Test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        Parser parser = new Parser(input);
        System.out.print(parser.parse());
    }
}

