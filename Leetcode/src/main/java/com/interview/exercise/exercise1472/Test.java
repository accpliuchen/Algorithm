package com.interview.exercise.exercise1472;


class BrowserHistory{
    class Node{
        String url;
        Node next,prev;

        public Node(String url){
            this.url=url;
            next=null;
            prev=null;
        }
    }

    Node head,curr;

    public BrowserHistory(String homepage){
        head=new Node(homepage);
        curr=head;
    }


    public void visit(String url){
        Node node=new Node(url);
        curr.next=node;
        node.prev=curr;
        curr=node;
    }

    public String back(int steps){
        while(curr.prev!=null && steps -- >0){
            curr=curr.prev;
        }
        return curr.url;
    }

    public String forward(int steps){
        while (curr.next != null && steps-- > 0) {
            curr = curr.next;
        }
        return curr.url;
    }

}

public class Test {
    public static void main(String[] args) {
        BrowserHistory browserHistory = new BrowserHistory("leetcode.com");
        browserHistory.visit("google.com");       // You are in "leetcode.com". Visit "google.com"
        browserHistory.visit("facebook.com");     // You are in "google.com". Visit "facebook.com"
        browserHistory.visit("youtube.com");      // You are in "facebook.com". Visit "youtube.com"
        browserHistory.back(1);                   // You are in "youtube.com", move back to "facebook.com" return "facebook.com"
        browserHistory.back(1);                   // You are in "facebook.com", move back to "google.com" return "google.com"
        browserHistory.forward(1);                // You are in "google.com", move forward to "facebook.com" return "facebook.com"
        browserHistory.visit("linkedin.com");     // You are in "facebook.com". Visit "linkedin.com"
        browserHistory.forward(2);                // You are in "linkedin.com", you cannot move forward any steps.
        browserHistory.back(2);                   // You are in "linkedin.com", move back two steps to "facebook.com" then to "google.com". return "google.com"
        browserHistory.back(7);                   // You are in "google.com", you can move back only one step to "leetcode.com". return "leetcode.com"
    }
}
