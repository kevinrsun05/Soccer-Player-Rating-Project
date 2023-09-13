public class Player {
    private String playerName;
    private String playerPosition;
    private String playerRating;
    private String date;
    private String minutes;
    //Getters and Setters for the stats that will be printed out in the JTable
    public Player(String date, String playerName, String playerPosition, String minutes, String playerRating) {
        super();
        this.date = date;
        this.playerName = playerName;
        this.playerPosition = playerPosition;
        this.minutes = minutes;
        this.playerRating = playerRating;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public String getPlayerPosition() {
        return playerPosition;
    }

    public void setPlayerPosition(String playerPosition) {
        this.playerPosition = playerPosition;
    }

    public String getMinutes() {
        return minutes;
    }

    public void setMinutes(String minutes) {
        this.minutes = minutes;
    }

    public String getPlayerRating() {
        return playerRating;
    }

    public void setPlayerRating(String playerRating) {
        this.playerRating = playerRating;
    }

}
