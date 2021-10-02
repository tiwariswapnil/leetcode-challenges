package io.github.leetcode.linkedlist;

import java.util.Stack;

public class BrowserHistory {

    Stack<String> history = new Stack<String>();
    Stack<String> future = new Stack<String>();

    public BrowserHistory(String homepage) {
        history.push(homepage);
        future.clear();
    }

    public void visit(String url) {
        history.push(url);
        future.clear();
    }

    public String back(int steps) {
        while (steps > 0 && history.size() > 1) {
            future.push(history.pop());
            steps--;
        }
        return history.peek();
    }

    public String forward(int steps) {
        while (steps > 0 && future.size() > 0) {
            history.push(future.pop());
            steps--;
        }
        return history.peek();
    }

}
