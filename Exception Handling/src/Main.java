class prethishException extends Exception {
    public prethishException(String message) {
        System.out.println(message + "Prethish Error Catched!");
    }
}


public class Main {
    public static void main(String[] args) {
            String name = "Prethish";
            try{
                throw new prethishException("Oops");
            }
            catch (prethishException e){
                System.out.println(e);
            }
        }
    }
