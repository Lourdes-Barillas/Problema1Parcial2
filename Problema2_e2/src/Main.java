import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sedeCarnet=0000, alumnoCarnet=111111;
        String seisDigitos;

        try{
            Alumno alumno = new Alumno();

            System.out.print("Nuevo Alumno\nNumero de sede: ");
            sedeCarnet = in.nextInt();
            //validar únicamente la sede
            alumno.validarCarnetSede(sedeCarnet);


            System.out.print("\nCódigo de año: ");
            alumnoCarnet = in.nextInt();
            //pasamos a un string el código de año
            seisDigitos = Integer.toString(alumnoCarnet);

            System.out.printf("\nCódigo de estudiante: ");
            alumnoCarnet = in.nextInt();
            //armamos codigo de año con los dígitos correspondientes del alumno
            seisDigitos = seisDigitos + Integer.toString(alumnoCarnet);


            //validar el alumno código
            if(alumno.validarCarnetAlumno(Integer.parseInt(seisDigitos))) {
                alumno = new Alumno(sedeCarnet, alumnoCarnet);
            }
            System.out.println(sedeCarnet + "-" + seisDigitos);

        }catch (MyCustomException error){
            System.out.println(error);
        }
    }


}
