public class Conta {

        private static final int AGENCIA_PADRAO = 1;
        private static int SEQUENCIAL = 1;
        protected int agencia;
        protected int numero;
        protected double saldo;

        protected Cliente cliente;

        public Conta(Cliente cliente){
            this.agencia = AGENCIA_PADRAO;
            this.numero = SEQUENCIAL++;
            this.cliente = cliente;
        }
        public int getAgencia() {
            return agencia;
        }

        public int getNumero() {
            return numero;
        }

        public double getSaldo() {
            return saldo;
        }


        public void sacar(double valor){

            if (this.saldo >= valor) {
                this.saldo -= valor;
            }else {
                System.out.println("Saldo insuficiente");
            }

        }

        public void depositar(double valor){
            if (valor > 0) {
                this.saldo += valor;
            }else {
                System.out.println("Valor inválido");
            }

        }

        public void transferir(double valor, Conta destino){
            if (this.saldo >= valor) {
                this.saldo -= valor;
                destino.depositar(valor);
            }else {
                System.out.println("Saldo insuficiente");
            }
        }

        protected void extracted() {
        System.out.println("Nome: " + this.cliente.getNome());
        System.out.println("Saldo: " + this.getSaldo());
        System.out.println("Agência: " + this.getAgencia());
        System.out.println("Número: " + this.getNumero());
         }
}




