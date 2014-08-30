public class Javadoc extends State{
   private static Javadoc instance = null;

   private Javadoc(){

   }

   public static Javadoc getInstance(){
      if(instance == null){
         instance = new Javadoc();
      }
      return instance;
   }

   public void read(Context c, String s){
      if(s.equals("*")){
         c.changeState(AwayJavadoc.getInstance());
      }
      else
         c.addJavadoc();

   }
}
