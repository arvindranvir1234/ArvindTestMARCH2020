import buzz.BuzzFizzService;

import java.util.concurrent.ExecutionException;

public class BuzzMain {


    public static void main(String[] args) throws ExecutionException, InterruptedException {
        BuzzFizzService.generateFizzBuzz(100);
    }
}
