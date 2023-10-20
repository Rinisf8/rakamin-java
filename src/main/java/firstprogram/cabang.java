package firstprogram;

import java.util.Scanner;

public class cabang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = prompt("Enter Password :" );
        String validPassword = "password";

        // jika benar maka selamat dsatang bos
        // jika salah (else) maka error message
        if(password.equals(validPassword)){
            System.out.println("Selamat Datang Bos!");
        } else {
            System.out.println("Password Salah, Coba Lagi");
        }
        System.out.println("Terimakasih sudah menggunakan aplikasi kami");
    }

    public static String prompt(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        return scanner.nextLine();
    }

}

