public class Transition extends State{
   private static Transition instance = null;

   private Transition(){

   }

   public static Transition getInstance(){
      if(instance == null){
         instance = new Transition();
      }
      return instance;
   }

   public void read(Context c, String s){
      if(s.equals("/")){
         c.addComment();
         c.addComment();
         c.changeState(SingleComment.getInstance());
      }
      else if(s.equals("*")){
         c.changeState(Transition2.getInstance());
      }
      else{
         c.addCode();
         c.addCode();
         c.changeState(Code.getInstance());
      }


   }
}
