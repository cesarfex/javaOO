public class InfosSistema {


           public void infosSistema() {

                     StringBuffer buffer = new StringBuffer(200);
                     buffer.append("Gerenciador de Segurança Instalado: ");
                     buffer.append(System.getSecurityManager() == null ?
                              "Nenhum gerenciador de segurança instalado." : System.getSecurityManager().getClass().getName());
                     buffer.append('\n');
                     buffer.append("Class loader para esta classe: ");
                     ClassLoader classLoader = this.getClass().getClassLoader();
                     buffer.append(classLoader == null ?
                              "Nenhum Class loader encontrado." : classLoader.getClass().getName());
                     buffer.append('\n');
                     buffer.append("Número de processadores disponíveis para a JVM: ");
                     buffer.append(Runtime.getRuntime().availableProcessors());
                     buffer.append('\n');

                     System.out.println(buffer.toString());

           }


           public static void main (String args[]) {

                     InfosSistema infosSistema = new InfosSistema();
                     infosSistema.infosSistema();

           }


  }