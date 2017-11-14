import java.applet.*;   
import java.awt.*; 


  /*<APPLET code="hai" width="300" height="250">
<PARAM name="Message" value="Hai friend how are you ..?"></APPLET>*/
          
public class Hai extends Applet {

  private String defaultMessage = "Hello!";

  public void paint(Graphics g) {
  
    String inputFromPage = this.getParameter("Message");
    if (inputFromPage == null) inputFromPage = defaultMessage;
    g.drawString(inputFromPage, 50, 55);
   
  }
  
}
