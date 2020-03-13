package ir.ac.kntu;

public class Main {
    // TODO: This is where your program starts!

    public static void main(String[] args) {
        Users users[] = new Users[10];
        Date date = new Date(2019,5,12);

        for(int i=0 ; i<users.length ; i++){
            users[i] = new Users((long)123456,"mohamad","ranjbar",512,date,(long)1234567854);
        }

        System.out.println(users[0].toString());
    }
}
