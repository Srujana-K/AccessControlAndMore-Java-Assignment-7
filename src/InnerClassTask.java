class First{
    class FirstInner{
        FirstInner(String msg){
            System.out.println(msg);
        }
    }
}
class Second{
    class SecondInner extends First.FirstInner{
        SecondInner(First f,String msg){
            f.super(msg);
        }
    }
}
public class InnerClassTask {
    public static void main(String args[]) {
        Second s = new Second();
        First f = new First();
        Second.SecondInner si = s.new SecondInner(f,"Hello");
    }
}
