public class Heap<T>{
    private static final int DEF_MAX_HEAP_SIZE = 20; 
    private int size; 
    private HeapData<T> [] element; 
    
    
    public Heap (){
        setup(DEF_MAX_HEAP_SIZE);
    }
    
    public Heap ( int maxNumber ) {
        setup(maxNumber);
    }
    
    private void setup ( int maxNumber ) {
        element = (HeapData<T>[]) new HeapData[maxNumber+1];
        size = 0;
    }
    
    
    public void insert ( HeapData<T> newElement ){
    	if (isFull()) {
    		return;
    	}
    	
    	size++;
    	element[size] = newElement;
    	heapifyUp(size);
    } 
    
    public HeapData<T> removeMin ( )
    {
    	if (isEmpty()) {
    		return null;
    	}
    	
    	HeapData<T> toRemove = element[1];
    	
    	element[1] = element[size];
    	size--;
    	heapifyDown(1);
    	
        return toRemove;
    }
    
    public void clear ()
    {
    	size = 0;
    }
    
    
    public boolean isEmpty ( )
    {
        return size == 0;
    }
    
    public boolean isFull ( )
    {
        return size == element.length;
    }
    
    public void showStructure (){
    	for (int i=1; i<=size; i++) {
    		System.out.println("priority is " + element[i].getPty() + " and key is " + element[i].getKey());
    	}
    }
    public void buildHeap ( HeapData<T> [ ] Array){
    	for (int i=0; i<Array.length; i++) {
    		insert(Array[i]);
    	}
    }
    
    private void heapifyDown(int index){
    	int indexOfSmallerSon = getPriority(index*2) < getPriority(index*2+1) ? index*2 : index*2+1;

    	if (getPriority(indexOfSmallerSon) < getPriority(index)) {
        	swap(indexOfSmallerSon,index);
        	heapifyUp(indexOfSmallerSon);
    	}        
    }
    
    private void swap(int i, int j) {
    	HeapData<T> temp = element[i];
    	element[i] = element[j];
    	element[j] = temp;
    }
    
    private double getPriority(int index) {
    	if (index > size) {
    		return Integer.MAX_VALUE;
    	}
    	
    	return element[index].getPty();
    	
    }
    
    private void heapifyUp(int index) {
    	if (index == 1) {
    		return;
    	}

    	if (getPriority(index) < getPriority(index/2)) {
        	swap(index,index/2);
        	heapifyUp(index/2);
    	}        
    }
}