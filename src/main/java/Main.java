public class Main  {
    private String pin;

    public static void main(String[] args){
        System.out.println("Hello Java Bank ATM");
    }


    public boolean authenticateUser(String inputPin) {
        int attempts = 0;
        while (attempts < 3) {
            if (this.pin.equals(inputPin)) {
                return true;
            } else {
                attempts++;
                System.out.println("PIN incorrecto. Intento " + attempts + " de 3.");
            }
        }
        return false;
    }

}

