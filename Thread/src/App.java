public class App {
    public static void main(String[] args) throws Exception {
        ThreadExecucao threadExecucao = new ThreadExecucao();

        /* threadExecucao.start vem da classe ThreadExecucao que é uma extensão da classe Thread */
        threadExecucao.start();

        ThreadExecucao threadExecucao2 = new ThreadExecucao();
        threadExecucao2.start();

        /* Ele executou a melhor da melhor forma que ele achou. */

    }
}
