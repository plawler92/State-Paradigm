public class SingleComment extends State{
   private static SingleComment instance = null;

   private SingleComment(){

   }

   public static SingleComment getInstance(){
      if(instance == null){
         instance = new SingleComment();
      }
      return instance;
   }

   public void read(Context c, String s){
      c.addComment();
   }
}
