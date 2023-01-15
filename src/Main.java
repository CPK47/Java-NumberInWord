public class Main {
    public static void main(String[] args)
    {
        System.out.println("Test Data");
        NumberInWord.printNumberInWord(0);
        NumberInWord.printNumberInWord(1);
        NumberInWord.printNumberInWord(2);
        NumberInWord.printNumberInWord(3);
        NumberInWord.printNumberInWord(4);
        NumberInWord.printNumberInWord(5);
        NumberInWord.printNumberInWord(6);
        NumberInWord.printNumberInWord(7);
        NumberInWord.printNumberInWord(8);
        NumberInWord.printNumberInWord(9);
        NumberInWord.printNumberInWord(10);
    }

    public static class NumberInWord
    {
        public static void printNumberInWord(int number)
        {
            switch(number)
            {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;

                default:
                    System.out.println("Other");
                    break;
            }
        }
    }
}