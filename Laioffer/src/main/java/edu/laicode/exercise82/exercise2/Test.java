package edu.laicode.exercise82.exercise2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Test {


    public static final int notFound=-1;

    public static int binarySearch(double a[],int low,int high,double key){
        int mid;

        while(low<high){
            mid=(low+high)/2;
            if(mid>key)
                high=mid-1;
            else if(mid<key)
                low=mid+1;
            else
                return mid;
        }

        return  notFound;
    }
    public static void main(String args[]) {
       Scanner scanner=new Scanner(System.in);

       String filePath=null;
       if(scanner.hasNext()){
            filePath=scanner.nextLine();
       }

       try{

       }catch(Exception e){
           System.out.println("catched bad file printing");
       }

    }


    private void readFile(String path) throws Exception{
        InputStream ls=null;
        BufferedReader br=null;

        try{
             br=new BufferedReader(new InputStreamReader(ls));
            printFile(br);
        }catch(IOException e){
            throw new Exception("rethrow bad file reading");
        }finally{
            ls.close();
            return;
        }

    }

    private void printFile(BufferedReader br) throws Exception{
        String line=null;
        while((line=br.readLine())!=null){
            if(line.startsWith("# ")){
                continue;
            }
            System.out.println(line);
        }
    }
}
