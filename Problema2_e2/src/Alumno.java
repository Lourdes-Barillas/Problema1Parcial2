public class Alumno {
    private String carne;

    public Alumno(int codeSede, int codeAlumno){
        this.carne = codeSede(codeSede) + "-" + codeAlumno(codeAlumno);
    }
    public Alumno(){}

    private String codeSede(int codeSede){
        return carne = Integer.toString(codeSede);
    }
    private String codeAlumno(int codeAlumno){
        return Integer.toString(codeAlumno);
    }

    public boolean validarCarnetSede(int codeSede) throws MyCustomException {
        boolean validar = true;
        //contar los dígitos del código de sede
        if((Integer.toString(codeSede)).length()>4 || (Integer.toString(codeSede)).length()<4){
            validar = false;
            throw new MyCustomException("El codigo de sede debe ser de 4 dígitos", Errores.CARNE_EXCEPTION);
        }
        return validar;
    }

    public boolean validarCarnetAlumno(int codeAlumno) throws MyCustomException {
        boolean validar = true;
        //contar los dígitos del código de alumno
        if((Integer.toString(codeAlumno)).length()>6 || (Integer.toString(codeAlumno)).length()<6){
            validar = false;
            throw new MyCustomException("El codigo de alumno (año + codigo de estudiante) debe ser de 6 dígitos", Errores.CARNE_EXCEPTION);
        }
        return true;
    }
}
