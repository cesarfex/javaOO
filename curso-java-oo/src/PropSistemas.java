import java.util.Enumeration;
import java.util.Properties;


  public class PropSistemas {


           public void imprimePropriedadesSistema() {

                     StringBuffer buffer = new StringBuffer(1000);
                     Properties props = System.getProperties();

                     for (Enumeration keys = props.keys(); keys.hasMoreElements();) {
                              String key = (String)keys.nextElement();
                              buffer.append(key);
                              buffer.append("=");
                              buffer.append(System.getProperty(key));
                              buffer.append('\n');
                     }

                     System.out.println(buffer.toString());
           }


           public static void main (String args[]) {
                     PropSistemas propSistemas = new PropSistemas();
                     propSistemas.imprimePropriedadesSistema();
           }

  }