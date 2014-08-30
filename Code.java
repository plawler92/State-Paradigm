public class Code extends State{
   private static Code instance = null;
   private char lastChar;

   private Code(){

   }
   //read in characters until // or /* is reached or javadoc comment whatever that is

   public static Code getInstance(){
      if(instance == null){
         instance = new Code();
      }
      return instance;
   }

   public void read(Context c, String s){
      if(s.equals("/")){
         c.changeState(Transition.getInstance());
      }
      else if(!s.equals(" ")){
         c.addCode();
      }
      else
         c.addCode();

   }


}
