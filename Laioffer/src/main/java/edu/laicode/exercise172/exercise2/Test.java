package edu.laicode.exercise172.exercise2;

public class Test {

    public String replace(String input, String source, String target) {
        // Write your solution here
        if (input.length() == 0 || source.length() == 0) {
            return input;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {  //注意不是i <= input.length() - s.length()
            if (i > input.length() - source.length()) {
                sb.append(input.charAt(i));
                continue;
            }
            for (int j = 0; j < source.length(); j++) {
                if (input.charAt(i + j) != source.charAt(j)) {
                    sb.append(input.charAt(i));
                    break;
                }
                if (j == source.length() - 1) {
                    sb.append(target);
                    i = i + j;
                }
            }
        }
        return sb.toString();
    }

    public static void main(String args[]){
        String input="appledogapple";
        String source="apple";
        String target="cat";


//        String input="aaaaa";
//        String source="aa";
//        String target="bbb";


        Test test=new Test();
        String result=test.replace(input,source,target);

        System.out.println(result);

    }
}
