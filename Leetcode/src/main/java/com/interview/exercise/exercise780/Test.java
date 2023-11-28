package com.interview.exercise.exercise780;

public class Test {

    public boolean reachingPoints(int sx,int sy,int tx,int ty){
        while(tx>=sx && ty>=sy){
            if(tx==ty) break;

            if(tx>ty){
                if(ty>sy) {
                    tx %= ty;
                }else{
                    return (tx-sx)%ty==0;
                }
            }else{
                if(tx>sx){
                    ty%=tx;
                }else{
                    return (ty-sy)%tx==0;
                }
            }
        }

        return (tx==sx && ty==sy);
    }

    public static void main(String args[]){
        int sx=1;
        int sy=1;
        int tx=3;
        int ty=5;

//        int sx=1;
//        int sy=1;
//        int tx=1;
//        int ty=1;

        Test test=new Test();
        boolean result=test.reachingPoints(sx,sy,tx,ty);

        System.out.println(result);
    }
}
