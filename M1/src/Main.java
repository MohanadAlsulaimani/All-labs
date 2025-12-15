public class Main {
    public static void main(String[] args){
        char letter = 'A'; char letter2 = 'a';
        switch(letter){
            case 'A':
                System.out.println("Letter is A");


                switch(letter2){

                    case 'a':
                        System.out.println("Letter is really NOT P");
                break;
                    default:
                        System.out.println("Letter unvaled");

        }
        break;
            case 'B':
                System.out.println("Letter is B");
                switch(letter2){
                    case'b':
                        System.out.println("Letter is really B");
                }
                break;
            case 'C':
                System.out.println("Letter is C");
                switch(letter2){
                    case 'c':
                        System.out.println("Letter is really C");
                }
                break;
            default:
                System.out.println("No letter matched!");

        }
    }
}