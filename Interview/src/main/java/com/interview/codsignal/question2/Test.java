package com.interview.codsignal.question2;

//https://www.chegg.com/homework-help/questions-and-answers/found-old-push-button-phone-room-unfortunately-buttons-broken-t-pushed-anymore-test-phone--q84322443
public class Test {

    public int getLetterDigit(char letter){
        switch(letter){
            case 'a':case 'b': case 'c':return 2;
            case 'd':case 'e': case 'f':return 3;
            case 'g':case 'h': case 'i':return 4;
            case 'j':case 'k': case 'l':return 5;
            case 'm':case 'n': case 'o':return 6;
            case 'p':case 'q': case 'r': case 's': return 7;
            case 't':case 'u': case 'v':return 8;
            case 'w':case 'x': case 'y': case 'z': return 9;
        }
        return 0;
    }

    boolean isDigitInArray(int digit, int broken[], int size){
        for(int i=0; i<size; i++){
            if(broken[i]==digit)return true;
        }
        return false;
    }

    boolean canBeTexted(String word, int broken[], int arraySize){

        char letter; int digit;
        for(int i=0; i<word.length(); i++){
            //letter = tolower(word.at(i));

            letter = Character.toLowerCase(word.charAt(i));
            digit = getLetterDigit(letter);
            if(isDigitInArray(digit,broken,arraySize)){
                return false;
            }

        }

        return true;
    }

    public static void main(String args[]){
        Test test=new Test();

        boolean[] possibles=new boolean[11];

        String[] words = new String[]{"Hi","John","I","am","sick","I","can\'t","come","to","play","today"};
        // digit 5 and 1 are broken the array size is 2
        int broken[] = {5,1};

        // loop through all words and update the bool array
        for(int i=0; i<11;i++){
            possibles[i] = test.canBeTexted(words[i],broken,2);
        }

        for(int i=0; i<11;i++){
            System.out.println( possibles[i]);
        }

    }
}
