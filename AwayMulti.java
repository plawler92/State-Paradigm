public class AwayMulti extends State{
   private static AwayMulti instance = null;
   private AwayMulti(){

   }

   public static AwayMulti getInstance(){
      if(instance == null){
         instance = new AwayMulti();
      }
      return instance;
   }

   public void read(Context c, String s){
      if(s.equals("/")){
         c.addComment();
         c.addComment();
         c.changeState(Code.getInstance());
      }
      else{
         c.addComment();
         c.addComment();
         c.changeState(MultiComment.getInstance());
      }

   }
}
