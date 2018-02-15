
package Counter;

/**
 *
 * @author TBullock
 */
public class test {
        public static void main(String[] args){
            /*
                These lines Instatiate counter; Meaning new versions of a counter are made
                Format:
                <class name> <name of instance> = new <constructor name(<parameters>)>
            */
            counter count1 = new counter();
            counter count2 = new counter();
            
            /*
                Using the instances
                Format
                <instance name>.<method name(<parameters>)>
             */
            count1.increment();
            
            System.out.println(count1.getCount());
            System.out.println(count2.getCount());
        }
}
