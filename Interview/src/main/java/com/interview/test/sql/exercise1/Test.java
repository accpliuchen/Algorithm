package com.interview.test.sql.exercise1;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.v4.runtime.tree.ParseTree;

public class Test {

    public static void main(String[] args) {
        String sql = "CREATE TABLE users (id INT PRIMARY KEY, name VARCHAR (50), age INT);";

        CharStream input=CharStreams.fromString(sql);



    }
}
