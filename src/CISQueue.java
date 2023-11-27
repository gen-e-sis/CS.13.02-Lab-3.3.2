import java.util.Arrays;

public class CISQueue {

    // Array property.
    private Integer[] queue;
    
    // Size property.
    private int size;
    
    // Index pointer. Indicates the index of the most recently added element.
    private int ptr;

    // Constructor.
    public CISQueue(int a)
    {
        size = a;
        queue = new Integer[a];
        ptr = -1;
    }

    // Enqueue. This method adds a node to the end of the linked list.
    public void enqueue(int element)
    {
        queue[++ptr] = element;
    }

    // Dequeue. This method removes a node from the beginning of the linked list.
    public Object dequeue()
    {
        if (isEmpty())
        {
            return null;
        }
        int temp = queue[0];
        reshuffle();
        ptr--;
        return temp;
    }

    // isEmpty. Returns a boolean indicating whether the linked list is empty.
    public boolean isEmpty()
    {
        if (ptr == -1)
        {
            return true;
        }
        return false;
    }

    // size. Returns the size of the queue.
    public int size()
    {
        return (ptr + 1);
    }


    // reshuffle. Moves each element down one index. Called whenever we dequeue.
    public void reshuffle()
    {
        for (int i = 0; i < ptr; i++)
        {
            queue[i] = queue[i + 1];
        }
    }

    // toString. Returns a description of the queue in, for example, the following format:

    @Override
    public String toString() {
        return "CISQueue{" +
                "queue=" + Arrays.toString(queue) +
                ", size=" + (ptr + 1) +
                ", pointer=" + ptr +
                '}';
    }

    // CISQueue{queue=[7, 11], size=2, pointer=1}

}
