package com.company;

public class Main {

    public static void main(String[] args) {
	    Stack stack = new Stack(10);
	    stack.push('1');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
	    stack.push('a');
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}
