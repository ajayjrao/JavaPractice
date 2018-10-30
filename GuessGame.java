public class GuessGame{
    Player p1;
    Player p2;
    Player p3;
    
    public void startGame(){
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();
        
        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;
        
        boolean p1Right = false;
        boolean p2Right = false;
        boolean p3Right = false;
        
        int targetNum = (int)(Math.random() * 10);
        System.out.println("I am thinking of a number between 0 and 9 ....");
        System.out.println("Number to guess is "+targetNum);
        
        while(true) {
            p1.guess();
            p2.guess();
            p3.guess();
            
            guessP1 = p1.number;
            System.out.println("Player - P1 guessed " +guessP1 );
            guessP2 = p2.number;
            System.out.println("Player - P2 guessed " +guessP2 );
            guessP3 = p3.number;
            System.out.println("Player - P3 guessed " +guessP3 );
            
            if (guessP1 == targetNum){
                
                p1Right = true;
            }
            
            if (guessP2 == targetNum){
                p2Right = true;
            }
            
            if (guessP3 == targetNum){
                p3Right = true;
            }
            if (p1Right || p2Right || p3Right){
                System.out.println("We have a winner !!!");
                System.out.println ("Player 1 got it right? "+p1Right );
                System.out.println ("Player 2 got it right? "+p2Right );
                System.out.println ("Player 3 got it right? "+p3Right );
                System.out.println("Game over!!");
                break;
                    
            }
            else {
                System.out.println("Players will have to try again");
            }
        }
    }
}