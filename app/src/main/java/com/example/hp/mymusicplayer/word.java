package com.example.hp.mymusicplayer;

public class word  {
    private String movieName;
    private String songName;
    private  int imageSourceId;
    private int songSourceId;
    public word(String dmovieName,String dsongName,int dsongSourceId)
    {
        movieName=dmovieName;
        songName=dsongName;
        songSourceId=dsongSourceId;
    }
    public word(String dmovieName,String dsongName,int dimageSourceId,int dsongSourceId)
    {
        movieName=dmovieName;
        songName=dsongName;
        imageSourceId=dimageSourceId;
        songSourceId=dsongSourceId;
    }

    public String getMovieName() {
        return movieName;
    }


    public String getSongName() {
        return songName;
    }
    public int getImageSourceIdName() {
        return imageSourceId;
    }
    public int getSongSourceIdName() {
        return songSourceId;
    }

}
