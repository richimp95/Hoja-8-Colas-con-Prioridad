import java.util.Scanner;

public class HeapTree
{
	Node head;
    Scanner input = new Scanner(System.in);
    HeapTree()
    {
        head = null;
    }

    public void createNode(Node temp,Node newnode) 
    {

        if(head==null)
        {
            System.out.println("No value exist in tree, the value just entered is set to Root");
            head = newnode;
            return;
        }
        if(temp==null)
            temp = head;
        
        char inputValue=' ';
        //System.out.println("where you want to insert this value, l for left of ("+temp.data+") ,r for right of ("+temp.data+")");
        if(((String) newnode.data.getKey()).charAt(0)>((String) temp.data.getKey()).charAt(0)){
        	inputValue='r';
        }else{
        	inputValue='l';
        }
        
        if(inputValue=='l'){
            if(temp.left==null)
            {
                temp.left=newnode;
                System.out.println("value got successfully added to left of ("+temp.data+")");
                return;
            }else {
                System.out.println("value left to ("+temp.data+") is occupied 1by ("+temp.left.data+")");
                createNode(temp.left,newnode);
            }
        }
        else if(inputValue=='r')
        {
            if(temp.right==null)
            {
                temp.right=newnode;
                System.out.println("value got successfully added to right of ("+temp.data+")");
                return;

            }else  {
                System.out.println("value right to ("+temp.data+") is occupied by ("+temp.right.data+")");
                createNode(temp.right,newnode);
            }

        }else{
            System.out.println("incorrect input plz try again , correctly");
            return;
        }

    }

    public Integer getData()
    {
        System.out.println("Enter the value to insert:");
        return (Integer)input.nextInt();
    }

    public void print()
    {
        inorder(head);
    }
    public void inorder(Node node)
    {
        if(node!=null)
        {
            inorder(node.left);
            System.out.println(node.data);
            inorder(node.right);
        }
        else
            return;
    }
}