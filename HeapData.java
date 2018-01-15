
public class HeapData<T> {
    private T key;      //generic key
    private int pty;    //priority
    
    
    public HeapData(T key, int pty){
        this.key = key;
        this.pty = pty;
    }
    
    public void setKey(T key){
        this.key = key;
    }
    
    public void setPty(int pty){
        this.pty = pty;
    }
    
    public T getKey(){
        return key;
    }
    
    public int getPty(){
        return pty;
    }
}
