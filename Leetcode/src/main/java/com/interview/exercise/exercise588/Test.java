package com.interview.exercise.exercise588;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class FileSystem {

    class File{
        boolean isDir;
        ArrayList<File> children;
        String name;
        String content;
        public File(boolean isDir,String name){
            this.isDir = isDir;
            this.name = name;
            children = new ArrayList<>();
            content = new String("");
        }
    }

    File root;
    public FileSystem() {
        root = new File(true,"/");
    }

    public List<String> ls(String path) {
        File cur = getLast(path);
        if(cur.isDir){
            LinkedList<String> ret = new LinkedList<>();
            for(File file : cur.children){
                ret.add(file.name);
            }
            return ret;
        }else{
            LinkedList<String> ret = new LinkedList<>();
            ret.add(cur.name);
            return ret;
        }
    }

    public void mkdir(String path) {
        getAndCreate(path,true);
    }

    public void addContentToFile(String filePath, String content) {
        File f = getAndCreate(filePath,false);
        String contentnew = new String(f.content + content);
        f.content = contentnew;
    }

    public String readContentFromFile(String filePath) {
        File f =getLast(filePath);
        return f.content;
    }

    private File getLast(String path){
        File cur = root;
        path = path.substring(1);
        int idx = path.indexOf('/');
        while(idx >= 0){
            String curlvl = path.substring(0,idx);
            int found = searchFile(cur.children,curlvl);
            cur = cur.children.get(found);
            path = path.substring(idx+1);
            idx = path.indexOf('/');
        }
        int found = searchFile(cur.children,path);
        if(found < 0)
            return root;
        cur = cur.children.get(found);
        return cur;
    }

    private File getAndCreate(String path,boolean isDir){
        File cur = root;
        path = path.substring(1);
        int idx = path.indexOf('/');
        while(idx >= 0){
            String curlvl = path.substring(0,idx);
            if(cur.children.size() == 0){
                File dir = new File(true,curlvl);
                cur.children.add(dir);
                cur = dir;
                path = path.substring(idx+1);
                idx = path.indexOf('/');
                continue;
            }
            int found = searchFile(cur.children,curlvl);
            File tmp = cur.children.get(found);
            if(!tmp.name.equals(curlvl)){
                File dir = new File(true,curlvl);
                cur.children.add(found+1,dir);
                cur = dir;
                path = path.substring(idx+1);
                idx = path.indexOf('/');
                continue;
            }
            cur = tmp;
            path = path.substring(idx+1);
            idx = path.indexOf('/');
        }
        int found = searchFile(cur.children,path);
        if(found == -1 || !cur.children.get(found).name.equals(path)){
            File f = new File(isDir,path);
            if(cur.children.size() == 0){
                cur.children.add(f);
            }else{
                int foundLast = searchFile(cur.children,path);
                cur.children.add(foundLast+1,f);
            }
            cur = f;
        }else{
            cur = cur.children.get(found);
        }
        return cur;
    }

    private int searchFile(ArrayList<File> arr ,String name){
        if(arr.size() < 1)
            return -1;
        int lo = 0;
        int hi = arr.size()-1;
        int idx = -1;
        while(lo <= hi){
            int mid = (lo+hi)/2;
            if(arr.get(mid).name.equals(name))
                return mid;
            else if(arr.get(mid).name.compareTo(name)<0){
                idx = mid;
                lo = mid+1;
            }else{
                hi = mid-1;
            }
        }
        return idx;
    }
}


public class Test{
    public static void main(String args[]){
        FileSystem file=new FileSystem();

        List<String> files=file.ls("/");

        System.out.println(files.size());
    }
}