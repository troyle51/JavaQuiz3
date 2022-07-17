package rocks.zipcode.io.quiz3.objectorientation.enums;

/**
 * @author leon on 09/12/2018.
 */
public enum RockPaperScissorHandSign {

    SCISSOR,
    PAPER,
    ROCK;


    public RockPaperScissorHandSign getWinner() {
        if(this == ROCK){
            return PAPER;
        }
        if(this == PAPER) {
            return SCISSOR;
        }
        if (this == SCISSOR) {
            return ROCK;
        }
        return null;
    }

    public RockPaperScissorHandSign getLoser() {

        if(this == PAPER){
            return ROCK;
        }
        if(this == SCISSOR) {
            return PAPER;
        }
        if (this == ROCK) {
            return SCISSOR;
        }return null;
    }
}
