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

        if (right < this.arr.length) {
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
