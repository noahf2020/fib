public class Fibonacci  implements Runnable {
    int amountOfNum;
    int numberOne;
    int numberTwo;

    public Fibonacci(int amountOfNum, int numberOne, int numberTwo) {
        this.amountOfNum = amountOfNum;
        this.numberOne = numberOne;
        this.numberTwo = numberTwo;
    }

    public int getAmountOfNum() {
        return amountOfNum;
    }

    public void setAmountOfNum(int amountOfNum) {
        this.amountOfNum = amountOfNum;
    }

    public int getNumberOne() {
        return numberOne;
    }

    public void setNumberOne(int numberOne) {
        this.numberOne = numberOne;
    }

    public int getNumberTwo() {
        return numberTwo;
    }

    public void setNumberTwo(int numberTwo) {
        this.numberTwo = numberTwo;
    }


    public void calculate() throws InterruptedException {
        int num1;
        int num2;
        int num3;
        num1 = numberOne;
        num2 = numberTwo;

        for (int i = 0; i <= amountOfNum; i = i + 1) {
           num3 =  num1+num2;
            System.out.println(num3);
           num1 = num2;
           num2 = num3;
           Thread.currentThread().sleep(1000);



        }
    }
    public void run(){
        try {
            calculate();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

