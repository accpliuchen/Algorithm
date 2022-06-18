//package com.interview.exercise.exercise36;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class Test {
//
//<<<<<<< HEAD
//    public boolean inValidSudoku(char[][] board){
//
//        for(int i=0;i<board.length;i++){
//            Set<Character> rowsSet=new HashSet();
//            Set<Character> colsSet=new HashSet();
//            Set<Character> cubeSet=new HashSet();
//
//            for(int j=0;j<board[0].length;j++){
//                if(board[i][j]!='.' && !rowsSet.add(board[i][j])) return false;
//                if(board[j][i]!='.' && !colsSet.add(board[j][i])) return false;
//
//                //System.out.println(i/3);
//
//                int rowIndex=3*(i/3);
//                int colIndex=3*(i%3);
//
//                System.out.println("rowIndex value is "+ rowIndex);
//
//
//                if(board[rowIndex+j/3][colIndex+j%3]!='.' && !cubeSet.add(board[rowIndex+j/3][colIndex+j%3])) return false;
//=======
//    public boolean isValidSudoku(char[][] board) {
//        for(int i=0;i<9;i++){
//            boolean[] rowCheck=new boolean[9];
//            boolean[] colCheck=new boolean[9];
//            boolean[] boxCheck=new boolean[9];
//
//            for(int j=0;j<9;j++){
//
//                String str=String.valueOf(board[i][j]-'1');
//
//                System.out.println("======"+board[i][j]);
//                System.out.println("str value is "+str);
//                System.out.println(Boolean.valueOf(str));
//
//                if(board[i][j]=='.'){}
//                else if(rowCheck[board[i][j]-'1']) return false;
//                else rowCheck[board[i][j]-'1']=true;
//
//                if(board[j][i]=='.'){}
//                else if(colCheck[board[j][i]-'1']) return false;
//                else colCheck[board[j][i]-'1']=true;
//
//                String str1=String.valueOf(board[j][i]-'1');
//                System.out.println(Boolean.valueOf(str1));
//
//
//                int m=i/3*3+j/3;
//                int n=i%3*3+j%3;
//
//
//                if(board[m][n]=='.'){}
//                else if(boxCheck[board[m][n]-'1']) return false;
//                else boxCheck[board[m][n]-'1']=true;
//>>>>>>> origin/master
//            }
//        }
//
//        return true;
//    }
//<<<<<<< HEAD
//
////    public static void main(String args[]){
////
////        char[][] board = new char[][]
////                {{'5','3','.','.','7','.','.','.','.'}
////=======
////    public boolean isValidSudoku(char[][] board) {
////        HashSet<String> set=new HashSet<>();
////        for(int i=0;i<board.length;i++){
////            for(int j=0;j<9;j++){
////                if(board[i][j]=='.'){
////                    continue;
////                }
////
////                String num_str=new String("("+board[i][j]+")");
////                String row_str=new String(i+num_str);
////                String col_str=new String(num_str+j);
////                String sub_str=new String((i/3)+num_str+(j/3));
////
////                if(!set.add(row_str) || !set.add(col_str) || !set.add(sub_str)) return false;
////
////            }
////        }
////        return true;
////    }
//
//    public static  void main(String args[]){
////        char[][]  board = new char[][]{{'8','3','.','.','7','.','.','.','.'}
////                ,{'6','.','.','1','9','5','.','.','.'}
////                ,{'.','9','8','.','.','.','.','6','.'}
////                ,{'8','.','.','.','6','.','.','.','3'}
////                ,{'4','.','.','8','.','3','.','.','1'}
////                ,{'7','.','.','.','2','.','.','.','6'}
////                ,{'.','6','.','.','.','.','2','8','.'}
////                ,{'.','.','.','4','1','9','.','.','5'}
////                ,{'.','.','.','.','8','.','.','7','9'}};
//
//        char[][] board=new char[][]{{'5','3','.','.','7','.','.','.','.'}
//
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}};
//
//        Test test=new Test();
////<<<<<<< HEAD
////        boolean result=test.inValidSudoku(board);
////
////        System.out.println("result vaule is "+ result);
////
////
////        System.out.println(9%3);
////=======
////
////        boolean result=test.isValidSudoku(board);
////
////        System.out.println("result value is "+ result);
////>>>>>>> origin/master
//    }
//}
//package com.interview.exercise.exercise36;
//
//import java.util.HashSet;
//import java.util.Set;
//
//public class Test {
//
//<<<<<<< HEAD
//    public boolean inValidSudoku(char[][] board){
//
//        for(int i=0;i<board.length;i++){
//            Set<Character> rowsSet=new HashSet();
//            Set<Character> colsSet=new HashSet();
//            Set<Character> cubeSet=new HashSet();
//
//            for(int j=0;j<board[0].length;j++){
//                if(board[i][j]!='.' && !rowsSet.add(board[i][j])) return false;
//                if(board[j][i]!='.' && !colsSet.add(board[j][i])) return false;
//
//                //System.out.println(i/3);
//
//                int rowIndex=3*(i/3);
//                int colIndex=3*(i%3);
//
//                System.out.println("rowIndex value is "+ rowIndex);
//
//
//                if(board[rowIndex+j/3][colIndex+j%3]!='.' && !cubeSet.add(board[rowIndex+j/3][colIndex+j%3])) return false;
//=======
//    public boolean isValidSudoku(char[][] board) {
//        for(int i=0;i<9;i++){
//            boolean[] rowCheck=new boolean[9];
//            boolean[] colCheck=new boolean[9];
//            boolean[] boxCheck=new boolean[9];
//
//            for(int j=0;j<9;j++){
//
//                String str=String.valueOf(board[i][j]-'1');
//
//                System.out.println("======"+board[i][j]);
//                System.out.println("str value is "+str);
//                System.out.println(Boolean.valueOf(str));
//
//                if(board[i][j]=='.'){}
//                else if(rowCheck[board[i][j]-'1']) return false;
//                else rowCheck[board[i][j]-'1']=true;
//
//                if(board[j][i]=='.'){}
//                else if(colCheck[board[j][i]-'1']) return false;
//                else colCheck[board[j][i]-'1']=true;
//
//                String str1=String.valueOf(board[j][i]-'1');
//                System.out.println(Boolean.valueOf(str1));
//
//
//                int m=i/3*3+j/3;
//                int n=i%3*3+j%3;
//
//
//                if(board[m][n]=='.'){}
//                else if(boxCheck[board[m][n]-'1']) return false;
//                else boxCheck[board[m][n]-'1']=true;
//>>>>>>> origin/master
//            }
//        }
//
//        return true;
//    }
//<<<<<<< HEAD
//
////    public static void main(String args[]){
////
////        char[][] board = new char[][]
////                {{'5','3','.','.','7','.','.','.','.'}
////=======
////    public boolean isValidSudoku(char[][] board) {
////        HashSet<String> set=new HashSet<>();
////        for(int i=0;i<board.length;i++){
////            for(int j=0;j<9;j++){
////                if(board[i][j]=='.'){
////                    continue;
////                }
////
////                String num_str=new String("("+board[i][j]+")");
////                String row_str=new String(i+num_str);
////                String col_str=new String(num_str+j);
////                String sub_str=new String((i/3)+num_str+(j/3));
////
////                if(!set.add(row_str) || !set.add(col_str) || !set.add(sub_str)) return false;
////
////            }
////        }
////        return true;
////    }
//
//    public static  void main(String args[]){
////        char[][]  board = new char[][]{{'8','3','.','.','7','.','.','.','.'}
////                ,{'6','.','.','1','9','5','.','.','.'}
////                ,{'.','9','8','.','.','.','.','6','.'}
////                ,{'8','.','.','.','6','.','.','.','3'}
////                ,{'4','.','.','8','.','3','.','.','1'}
////                ,{'7','.','.','.','2','.','.','.','6'}
////                ,{'.','6','.','.','.','.','2','8','.'}
////                ,{'.','.','.','4','1','9','.','.','5'}
////                ,{'.','.','.','.','8','.','.','7','9'}};
//
//        char[][] board=new char[][]{{'5','3','.','.','7','.','.','.','.'}
//
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//                ,{'8','.','.','.','6','.','.','.','3'}
//                ,{'4','.','.','8','.','3','.','.','1'}
//                ,{'7','.','.','.','2','.','.','.','6'}
//                ,{'.','6','.','.','.','.','2','8','.'}
//                ,{'.','.','.','4','1','9','.','.','5'}
//                ,{'.','.','.','.','8','.','.','7','9'}};
//
//        Test test=new Test();
////<<<<<<< HEAD
////        boolean result=test.inValidSudoku(board);
////
////        System.out.println("result vaule is "+ result);
////
////
////        System.out.println(9%3);
////=======
////
////        boolean result=test.isValidSudoku(board);
////
////        System.out.println("result value is "+ result);
////>>>>>>> origin/master
//    }
//}
