package com.example.android.miwok;

/**
 * Created by Jaren Lynch on 6/28/2016.
 */
public class Word {
    //Default translation of the word
    private String mDefaultTranslation;

    //Miwok translation of the word
    private String mMiwokTranslation;

    //Image associated with the word
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    //Audio associated with the word
    private int mAudioResourceId;

    private static final int NO_IMAGE_PROVIDED = -1;

    /**
     *
     * @param defaultTranslation is the word in the user native language
     * @param miwokTranslation is the word in miwok
     * @param audioResourceId is the audio to play
     */
    public Word(String defaultTranslation, String miwokTranslation, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioResourceId = audioResourceId;
    }
    /**
     *
     * @param defaultTranslation is the word in the user native language
     * @param miwokTranslation is the word in miwok
     * @param imageResourceId is the resource id for image associated with the word.
     * @param audioResourceId is the resource id for the audio associated with the word.
     */
    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int audioResourceId) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioResourceId = audioResourceId;
    }

    /**
     * Get the Default translation of the word
     */
    public String getDefaultTranslation() {

        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word
     */
    public String getMiwokTranslation(){

        return mMiwokTranslation;
    }

    /**
     * Get the id of the image
     */
    public int getImageResourceId(){

        return mImageResourceId;
    }

    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    /**
     * Get the id of the audio
     */
    public int getAudioResourceId(){
        return mAudioResourceId;
    }


}
