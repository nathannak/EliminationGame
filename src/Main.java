import java.util.Stack;

public class Main {

    //    Input:
    //    n = 9,
    //            1 2 3 4 5 6 7 8 9
    //            2 4 6 8
    //            2 6
    //            6
    //
    //    Output:
    //            6

    public static void main(String[] args) {

        // 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20 21 22 23 24
        //

        //System.out.println( lastRemaining(24) );



        // 1 2 3 4 5 6
        // 2 4 6
        // 4
        //System.out.println( lastRemaining(6) );

    }

    // head is always the first number in our current list of numbers; head will be deleted when
    // either we are going from left or number of elements are odd (first element will be deleted)
    // how many steps to move head? twice the steps as previous step; because number remaining divides by half each time [step starts with 1]
    // first head should be moved by 1 , then 2 [next time applicable], then 4, steps multiply by 2 each time we get there because one start from left
    // AND one start from right has been applied so *2

    public static int lastRemaining(int n) {

        boolean left = true;
        int remaining = n;
        int step = 1;
        int head = 1;

        while (remaining > 1) {

            if (left || remaining % 2 ==1) {
                head = head + step;
            }

            remaining = remaining / 2;
            step = step * 2;
            left = !left;

        }

        return head;

    }

//    public static int lastRemaining(int n) {
//
//        Stack<Integer> stack = new Stack<>();
//
//        while (n > 1) {
//            n /= 2;
//            stack.push(n);
//        }
//
//        int result = 1;
//
//        while (!stack.isEmpty()) {
//            result = 2 * (1 + stack.pop() - result);
//        }
//
//        return result;
//
//    }

}
