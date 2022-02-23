public class Quests {
    String story;
    String failStory;
    double goldEarned;
    int choiceTEMP = 0;
    boolean questState = false;

    public void randomQuest() {
        switch (choiceTEMP) {     //(int)(Math.random() * 3)
            case 0 -> {  //Reach Gate 16
                story = "Reach Gate 16";
                failStory = "You have failed to reach gate 16 try again";
            }

            case 1 -> { //Other one

            }

            case 2 -> { //Another one

            }
        }
    }

    public void questState() {
        if (questState) choiceTEMP++;
        else System.out.println(story + "<--?-->");
    }
}
