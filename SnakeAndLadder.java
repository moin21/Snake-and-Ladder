public class SnakeAndLadder {

    public static void main(String[] args) {
        int position = 0;
        if (position < 95) {
            int diceRoll = (int) ((Math.random() * 10) % 6) + 1;
            int playOption = (int) (Math.random() * 3);
            System.out.println(playOption);
            switch (playOption) {
                case 0:
                    System.out.println("It's a Ladder");
                    position = position + diceRoll;
                    System.out.println("Current Position" + position);
                case 1:
                    System.out.println("It's a No Play");
                    position = position;
                    System.out.println("Current Position" + position);
                case 2:
                    System.out.println("It's a Snake");
                    position = position - diceRoll;
                    System.out.println("Current Position" + position);
            }

        }
        else if(position >=95){
            
        }
    }
}

