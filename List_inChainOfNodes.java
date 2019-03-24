/**
  Represent a list, implemented in a chain of nodes
 */

public class List_inChainOfNodes{
    private Node headReference;

    /**
      Construct an empty list
     */
    public List_inChainOfNodes() {
	}

    /**
      @return the number of elements in this list
     */
    public int size() {
		int filledElements;
		Node nextNode = headReference;
		for (filledElements = 0; nextNode != null; filledElements++) 
			nextNode = nextNode.getReferenceToNextNode();
		return filledElements;
    }

    
     /**
       @return a string representation of this list,
       format:
           # elements [element0,element1,element2,] 
      */
    public String toString() {
		String ans = "[";
		Node nextNode = headReference;
		for (int i = 0; i < size(); i++) {
			ans += nextNode.getCargoReference() + ",";
			nextNode = nextNode.getReferenceToNextNode();
		}
		ans += "]";
		return ans;
    }
    
    
    /**
      Append @value to the head of this list.

      @return true, in keeping with conventions yet to be discussed
     */
    public boolean addAsHead( Object val) {
		Node oldHead = headReference;
		headReference = new Node(val);
		headReference.setReferenceToNextNode(oldHead);
		return true;
    }
}