public class AwayJavadoc extends State{
   private static AwayJavadoc instance = null;
   private AwayJavadoc(){

   }

   public static AwayJavadoc getInstance(){
      if(instance == null){
         instance = new AwayJavadoc();
      }
      return instance;
   }

   public void read(Context c, String s){
      if(s.equals("/")){
         c.addJavadoc();
         c.addJavadoc();
         c.changeState(Code.getInstance());
      }
      else{
         c.addJavadoc();
         c.addJavadoc();
         c.changeState(Javadoc.getInstance());
      }
   }
}
