public class Heap{
    private static final int DEF_MAX_HEAP_SIZE = 20; 
    private int size; 
    private HeapData [] element; 
    
    
    public Heap (){
        setup(DEF_MAX_HEAP_SIZE);
    }
    
    public Heap ( int maxNumber ) {
        setup(maxNumber);
    }
    
    private void setup ( int maxNumber ) // Called by constructors only
    {
        element = new HeapData[maxNumber];
        size = 0;
    }
    
    
    public void insert ( HeapData newElement ) // Insert element
    {
    
    } 
    public HeapData removeMin ( )
    {
    
        return null;
    }
    public void clear ( )
    {}
    
    public boolean isEmpty ( )
    {
        return size == 0;
    }
    
    public boolean isFull ( )
    {
        return size == element.length;
    }
    
    public void showStructure (){
    
    }
    public void buildHeap ( HeapData [ ] Array){
    
    }
    
    private void heapify(int index){
        if (index > size/2)
            return;
    }

}