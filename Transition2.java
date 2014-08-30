public class Transition2 extends State{
   private static Transition2 instance = null;

   private Transition2(){

   }

   public static Transition2 getInstance(){
      if(instance == null){
         instance = new Transition2();
      }
      return instance;
   }

   public void read(Context c, String s){
      if(s.equals("*")){
         c.addJavadoc();
         c.addJavadoc();
         c.addJavadoc();
         c.changeState(Javadoc.getInstance());
      }
      else{
         c.addComment();
         c.addComment();
         c.addComment();
         c.changeState(MultiComment.getInstance());
      }
   }
}
