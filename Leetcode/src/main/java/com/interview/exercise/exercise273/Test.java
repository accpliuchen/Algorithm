package com.interview.exercise.exercise273;

public class Test {

    private static final int BILLION = 1000000000;
    private static final int MILLION = 1000000;
    private static final int THOUSAND = 1000;

    private static final String[] ONES = { "Zero ", "One ", "Two ", "Three ", "Four ", "Five ", "Six ", "Seven ", "Eight ", "Nine ", "Ten " };
    private static final String[] TEENS = { "Ten ", "Eleven ", "Twelve ", "Thirteen ", "Fourteen ", "Fifteen ", "Sixteen ", "Seventeen ", "Eighteen ", "Nineteen " };
    private static final String[] TENS = { " ", "Ten ", "Twenty ", "Thirty ", "Forty ", "Fifty ", "Sixty ", "Seventy ", "Eighty ", "Ninety " };

    public String numberToWords(int num) {

        if (num == 0)
            return "Zero";

        StringBuilder numberBuilder = new StringBuilder();

        int _billion = num / BILLION;
        if (_billion > 0) {
            numberBuilder.append(ONES[_billion]);
            numberBuilder.append("Billion ");
            num = num % BILLION;
        }

        int _million = num / MILLION;
        if (_million > 0) {
            numberBuilder.append(convert(_million));
            numberBuilder.append("Million ");
            num = num % MILLION;
        }

        int _thousand = num / THOUSAND;
        if (_thousand > 0) {
            numberBuilder.append(convert(_thousand));
            numberBuilder.append("Thousand ");
            num = num % THOUSAND;
        }

        numberBuilder.append(convert(num));

        return numberBuilder.toString().trim();
    }

    private String convert(int num) {
        StringBuilder numberBuilder = new StringBuilder();
        int _10 = 0, _100 = 0;

        _100 = num / 100;
        if (_100 > 0) { // 100s
            numberBuilder.append(ONES[_100]);
            numberBuilder.append("Hundred ");
        }

        _100 = num % 100;
        if (_100 >= 20) { // 20 to 99
            _10 = _100 / 10;
            numberBuilder.append(TENS[_10]);
            _10 = _100 % 10;
            if (_10 > 0)
                numberBuilder.append(ONES[_10]);
        } else if (_100 >= 10) { // 10 to 19
            _10 = _100 % 10;
            numberBuilder.append(TEENS[_10]);
        } else if (_100 > 0) { // 1 to 9
            _10 = _100 % 10;
            numberBuilder.append(ONES[_10]);
        }

        return numberBuilder.toString();
    }


    public static void main(String args[]){
        int num = 1234567891;

        Test test=new Test();

        String str=test.numberToWords(num);
        System.out.println(str);

    }

}
