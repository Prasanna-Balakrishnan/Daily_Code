package leet_code;

class AnswerTwo {
    public int[] checkValue(int[] arr) {

        int l = arr.length;
        int[] answer = new int[l];

        int totalSum = 0;
        for (int num : arr) {
            totalSum += num;
        }

        int leftSum = 0;

        for (int i = 0; i < l; i++) {
            totalSum -= arr[i];
            answer[i] = Math.abs(leftSum - totalSum);
            leftSum += arr[i];
        }

        return answer;
    }
}

public class LeftAndRightSum {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 3};
        AnswerTwo ans = new AnswerTwo();
        int[] results = ans.checkValue(arr);
        for (int num : results) {
            System.out.print(num + " ");
        }
    }
}