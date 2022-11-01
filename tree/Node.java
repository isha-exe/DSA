package tree;

import java.util.*;

public class Node {
    //contains the information about the sucessor left and right nodes
    Node left, right;
    //the node will also contain its own value
    int data;

    //creating a construcotr
    public Node(int data){
        this.data = data;
    }


    //function to add elements into the tree:
    static Node createTree(){
        Scanner sc = new Scanner(System.in);
        //creating a node called root and initialising it as null
        Node root = null;
        //asking for the values by the user
        System.out.println("enter data: ");
        int data = sc.nextInt();

        //base condition , if the user enters -1 there is no successive elements to the node neither to left nor right
        if(data == -1){
            return null;
        }

        //now making the next node root and solving it like a seperate tree
        root = new Node(data);

        System.out.println("Enter left of " + data);
        root.left = createTree();

        System.out.println("Enter right of " + data);
        root.right = createTree();


        return root;


    }
}
