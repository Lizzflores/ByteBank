class Cuenta{
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular = new Cliente();
    //No retorna valor
    public void depositar(
        double valor
    ){
        this.saldo+=valor;
    }
    //Retorna valor
    public boolean retirar(
        double valor
    ){
        if(this.saldo>=valor){
            this.saldo-=valor;
            return true;
         }
        return false;
    }

    public boolean transferir(
        double valor,
        Cuenta cuenta
    ){
        if(this.saldo>=valor){
            this.saldo-=valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }

    public double getSaldo(){
        return this.saldo;
    }

    public void setAgencia(int agencia){
        if(agencia>0){
            this.agencia = agencia;
        } else {
            System.out.println("No estan permitidos valores negativos");
        }
    }

    public int getAgencia(){
        return agencia;
    }
}
