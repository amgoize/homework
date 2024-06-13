package amgoize;

public class Task2 {
    private int count;

    public Task2() {
    }

    public int countDigits(int number){
        if (number < 0){
            number = number * -1;
        }
        if (number / 10 > 0){
            count++;
            countDigits(number / 10);
            return count;
        }
        count++;
        return count;
    }
}
