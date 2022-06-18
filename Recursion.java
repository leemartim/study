/*
해당 재귀함수에 대한 설명
if right쪽이 돌기위해선 if Left에 숫자가 들어가지 못하는 count4(15,16)까지 재귀함수가 돌아야하고
이 조건에 들어맞게 될 경우 그때 들어가지 못했던 if right쪽이 돌기 시작한다.(8->4->2) 즉 count의 역순으로
하지만 다시 이값이 idx값으로 들어가기에 if문(left, right모두)에 걸리는 숫자가 나오면
다시 정상적인 순서와 같이 출력되다가 if left에 걸리게되는 순간이 오면 그동안 쌓였던 right부분이 출력되고
idx값으로 더이상 들어갈수있는 인자가 존재하지않을때 종료된다. (break문이 없기에 들어갈수없을때까지 반복한다) 

*/


class BinaryTree {
    char[] arr; //

    BinaryTree(char[] data) {
        this.arr = data.clone();
    }

    public void preOrder(int idx) { // 궁금한 부분
        System.out.print(this.arr[idx] + " "); 

        int left = 2 * idx + 1;
        int right = 2 * idx + 2;
        if (left < this.arr.length) {
            this.preOrder(left);
        }

        if (right < this.arr.length) {  //break문이 없기에
                                        // if left 에서의 부분이 끝나면
                                        // if right 에서의 부분을 끝내야함
            this.preOrder(right);
        }
    }

}

public class Practice1 {
    public static void main(String[] args) {
        // Test code
        char[] arr = new char[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char)('A' + i);
        }


        BinaryTree bt = new BinaryTree(arr);

        System.out.println("== Preorder ==");
        bt.preOrder(0);
        System.out.println();
    }
}
