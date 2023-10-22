public class ThreadExecucao extends Thread{
    /* Sobrescrevendo o método run() da classe Thread */
    public void run(){
        /* for com 0-10 elementos*/
        for(int i = 0; i <= 10; i++){
            /* Vai printar o nome da thread e o valor de i */
            System.out.println(Thread.currentThread().getName() + " - " + i);
        }
    }
}
