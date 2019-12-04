package com.yuans.datastructures.stack;

import java.util.Stack;

/**
 * leetcode
 * 155. 最小栈
 * <p>
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 *
 * @author yuans
 * @create 2019-12-02-16:52
 */
public class MinStack {

    private Stack stack;
    /**
     * initialize your data structure here.
     * 思路：每次入栈2个元素，一个是入栈的元素本身，一个是当前栈元素的最小值 * 如：入栈序列为2-3-1，则入栈后栈中元素序列为：2-2-3-2-1-1 * 用空间代价来换取时间代价
     */
    public MinStack() {
        stack = new Stack<Integer>();
    }

    public void push(int x) {
        if(stack.isEmpty()){
            stack.push(x);
            stack.push(x);
        }else{
            int tmp = (int) stack.peek();
            stack.push(x);
            if(tmp<x){
                stack.push(tmp);
            }else{
                stack.push(x);
            }
        }
    }

    public void pop() {
        stack.pop();
        stack.pop();
    }

    public int top() {
        return (int) stack.get(stack.size()-2);
    }

    public int getMin() {
        return (int) stack.peek();
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(10);
        minStack.push(20);
        minStack.push(5);
        System.out.println(minStack.getMin());
    }
}
