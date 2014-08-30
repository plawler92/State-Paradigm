public class MultiComment extends State{
   private static MultiComment instance = null;
   private MultiComment(){

   }

   public static MultiComment getInstance(){
      if(instance == null){
         instance = new MultiComment();
      }
      return instance;
   }

   public void read(Context c, String s){
      if(s.equals("*")){
         c.changeState(AwayMulti.getInstance());
      }
      else
         c.addComment();

   }
}
