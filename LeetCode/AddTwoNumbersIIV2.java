package udemy.LeetCode;

import java.util.Stack;

public class AddTwoNumbersIIV2 {

    public static void main(String[] args) {
        AddTwoNumbersIIV2 a = new AddTwoNumbersIIV2();
        ListNode l1 = new ListNode(7, new ListNode(2, new ListNode(4, new ListNode(3))));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));

        a.addTwoNumbers(l1, l2);
    }


    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = changeToStack(l1);
        Stack<Integer> stack2 = changeToStack(l2);

        int sum = 0 ;
        int carry = 0;
        ListNode dummyhead = new ListNode(0);
        ListNode l3 = dummyhead;

        while ( !stack1.isEmpty() || !stack2.isEmpty() || carry != 0){
            System.out.println("Here");
            sum+=carry;
            carry=0;
            if (!stack1.isEmpty()){
                sum+=stack1.pop();
            }

            if ( !stack2.isEmpty()){
                //System.out.println("stack pop" + stack2.pop());
                sum+= stack2.pop();
            }

            if ( sum > 9){
                carry +=1;
                sum-=10;
            }

            ListNode newNode = new ListNode(sum);
            //Add at tail
            //l3.next = newNode;
            //l3 = l3.next;
            //Add at head approach
            newNode.next = l3.next;
            l3.next = newNode;


            sum = 0;

        }
        System.out.println(dummyhead.next.next.val);
        return dummyhead.next;


    }

    private Stack changeToStack (ListNode l1){
        Stack<Integer> stack = new Stack<>();
        while ( l1 != null){
            stack.add(l1.val);
            System.out.println("l1"+l1.val);
            l1 = l1.next;
        }
        System.out.println(stack);
        return stack;
    }
}
