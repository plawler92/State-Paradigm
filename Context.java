import java.io.*;

//need to add gui class
public class Context{
//will be renamed when needed
   //holds all the counter
   private State currentState;
   int comment;
   int javadoc;
   int code;
   BufferedReader br;
   String wholeFile = "";

   public Context(File file){
      changeState(Code.getInstance());
      try{
         br = new BufferedReader(new FileReader(file));
      }catch(Exception e){}
   }

   public void changeState(State newState){
      currentState = newState;
   }

   public void addCode(){
      code++;
   }
   public int getCode(){
      return code;
   }

   public void addComment(){
      comment++;
   }
  public int getComment(){
      return comment;
  }

   public void addJavadoc(){
      javadoc++;
   }
   public int getJavadoc(){
      return javadoc;
   }

   public void pressCount(){
      try{
      String line = br.readLine();
      while(line != null){
         for(int i = 0; i < line.length(); i++){
            currentState.read(this, line.substring(i,i+1));
         }
         if(currentState == SingleComment.getInstance()){
            currentState = Code.getInstance();
         }
         line = br.readLine();
      }
      }catch(Exception e){}
   }
}
