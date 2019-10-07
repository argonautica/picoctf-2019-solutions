import java.util.StringJoiner;


class VaultDoor7 {

    public static void main(String[] args) {
        new VaultDoor7().crack();
    }

    private void crack() {
//        String password = "32characterString....";

//        int[] x = new int[8];
//        byte[] hexBytes = password.getBytes();

        // Encoding
//        for (int i = 0; i < 8; i++) {
//            x[i] = hexBytes[i * 4] << 24
//                    | hexBytes[i * 4 + 1] << 16
//                    | hexBytes[i * 4 + 2] << 8
//                    | hexBytes[i * 4 + 3];
//        }

//        System.out.print("HEX: ");
//        printHexArray(hexBytes);
//        System.out.print("ENC: ");
//        printHexArray(x);

        // Cracking
        int[] wanted = {0x415f6231, 1952395366, 1600270708, 1601398833, 1716808014, 1734305335, 962749284, 828584245};
        byte[] result = new byte[32];
        System.out.println(0x415f6231);
        // Decoding (We do the reverse of above)
        for (int i = 0; i < 8; i++) {
            result[i * 4] = (byte) (wanted[i] >> 24);
            result[i * 4 + 1] = (byte) (wanted[i] >> 16);
            result[i * 4 + 2] = (byte) (wanted[i] >> 8);
            result[i * 4 + 3] = (byte) wanted[i];
        }
        String crack = new String(result);

        System.out.print("RES: ");
        printHexArray(result);
        System.out.print("!!!: ");
        printHexArray(wanted);

        System.out.println("Flag: " + crack);

//        boolean cracked = "<redacted>".equals(crack);
//        System.out.println(cracked ? "Cracked! (" + crack + ")" : "Invalid Password.");
    }

    //
    // Utility Functions
    //

    private void printHexArray(int[] arr) {
        StringJoiner j = new StringJoiner(" ", "[", "]");
        for (int number : arr) {
            j.add(Integer.toHexString(number));
        }
        System.out.println(j.toString());
    }

    private void printHexArray(byte[] arr) {
        StringJoiner j = new StringJoiner("", "[", "]");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && i % 4 == 0) {
                j.add(" ");
            }
            byte num = arr[i];
            j.add(String.format("%x", num));
        }
        System.out.println(j.toString());
    }

}