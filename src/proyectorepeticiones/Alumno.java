
package proyectorepeticiones;

public class Alumno {
    private String nombreAlumno;
    private float nota1Ev;
    private float nota2Ev;
    private float nota3Ev;
    public Alumno(String nom,float nota1,float nota2,float nota3){
        this.nombreAlumno=nom;
        this.nota1Ev=nota1;
        this.nota2Ev=nota2;
        this.nota3Ev=nota3;
    }
    public String calcNotaMedia(){
        String notaMedia="";
        notaMedia=this.nombreAlumno+"\nNota media "+((this.nota1Ev+this.nota2Ev+this.nota3Ev)/3);
        return notaMedia;
    }
}
