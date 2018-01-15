
public class HeapData<T> {
    private T key;      //generic key
    private double pty;    //priority
    
    
    public HeapData(T key, double pty){
        this.key = key;
        this.pty = pty;
    }
    
    public void setKey(T key){
        this.key = key;
    }
    
    public void setPty(double pty){
        this.pty = pty;
    }
    
    public T getKey(){
        return key;
    }
    
    public double getPty(){
        return pty;
    }
}
