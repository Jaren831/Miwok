package com.example.android.miwok;

/**
 * Created by Jaren Lynch on 6/28/2016.
 */
public class Word {
    //Default translation of the word
    private String mDefaultTranslation;

    //Miwok translation of the word
    private String mMiwokTranslation;

    /**
     *
     * @param defaultTranslation is the word in the user native language
     * @param miwokTranslation is the word in miwok
     */
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
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

}
