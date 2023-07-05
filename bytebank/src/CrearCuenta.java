public class CrearCuenta{
    public static void main(String[] args){
        //variable        = valor
        Cuenta miCuenta=new Cuenta();
        miCuenta.saldo=1000;
        miCuenta.depositar(200);

        System.out.println(miCuenta.saldo);

        miCuenta.retirar(100);
        System.out.println(miCuenta.saldo);

        Cuenta cuentaJimena=new Cuenta();
        cuentaJimena.depositar(1000);
        cuentaJimena.transferir(400, miCuenta);
        System.out.println(cuentaJimena.saldo);
        System.out.println(miCuenta.saldo);
    }
}
