package src;
public class TestReferencia{
    public static void main(String[] args){
        //variable        = valor
        Cuenta primeraCuenta=new Cuenta();
        primeraCuenta.saldo=1000;


        Cuenta seguntaCuenta=primeraCuenta;
        seguntaCuenta.saldo=200;
        System.out.println(primeraCuenta.saldo);
    }
}
