public class MyCustomException extends Exception{
    private Errores error;



    MyCustomException(String mensaje, Errores e){
        super(mensaje + ". Error de tipo " + e.toString());
    }

    public MyCustomException(){}
}
