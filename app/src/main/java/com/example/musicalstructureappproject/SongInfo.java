package com.example.musicalstructureappproject;

public class SongInfo {
    /** song name */
    private String mSongName;

    /** singer name */
    private String mSingerName;

    // Drawable resource ID
    private int mImageResourceId;

    private int mAudioResourceId;

    /**
     * Create a new Word object.
     *
     * @param SongName is the is the name of the song
     * @param SingerName is the is name of singer
     * @param ImageResourceId is drawable resource id
     * @param audioResourceId is the resource ID for the audio file associated with this song
     */
    public SongInfo(String SongName, String SingerName, int ImageResourceId, int audioResourceId) {
        mSongName = SongName;
        mSingerName = SingerName;
        mImageResourceId = ImageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the song name.
     */
    public String getSongName() {
        return mSongName;
    }

    /**
     * Get the singer name.
     */
    public String getSingerName() {
        return mSingerName;
    }

    /**
     * Get the image resource ID
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Return the audio resource ID
     */
    public int getAudioResourceId() {
        return mAudioResourceId;
    }


}
