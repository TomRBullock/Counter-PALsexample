package Counter;

/**
 *
 * @author TBullock
 */
public class counter {
    
    private int count;
    
    /**
    *  Class Constructor 
    *  Creates a new instance of counter, setting count to 0
    **/
    public counter(){
        this.count = 0;
    }
    
    /**
     * overloaded Class constructor 
     * Creates a new instance of counter, assigning the value of count(param)
     * 
     * @param count 
     */
    public counter(int count){
        this.count = count;
    }
    
    /**
     *  Retrieves the value of count
     * 
     * @return 
     */
    public int getCount(){
        return this.count;
    }
    
    /**
     *  Sets the value of count to new count(param)
     * 
     * @param count 
     */
    public void setCount(int count){
        this.count = count;
    }
    
    /**
     *  Increase the value of count 
     */
    public void increment(){
        this.count ++;
    }
    
}
