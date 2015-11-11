package proyectorepeticiones;
import javax.swing.JOptionPane;
public class ProyectoRepeticiones {

    public static void main(String[] args) {
        int i=0;
         int a=Integer.parseInt(JOptionPane.showInputDialog("Introduzca numero de alumnos"));
            Alumno alumno[];
            alumno=new Alumno[30];
        while(i<a)    {
        String nomeA=JOptionPane.showInputDialog("Introduzca nombre alumno "+i);
        float nota1=Float.parseFloat(JOptionPane.showInputDialog("Introduzca primera nota"));
        float nota2=Float.parseFloat(JOptionPane.showInputDialog("Introduzca segunda nota"));
        float nota3=Float.parseFloat(JOptionPane.showInputDialog("Introduzca tercera nota"));        
            alumno[i]=new Alumno(nomeA,nota1,nota2,nota3);
            
            
        i++;
       
        }
        int x=0;
        while(x<a){
            JOptionPane.showMessageDialog(null,alumno[x].calcNotaMedia());
            x++;
        }
        
    }
    
}
