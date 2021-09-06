package com.example.android.miwok;

public class Word {


    private String mDefaultTranslation;


    private String mMiwokTranslation;

    private int mAudioId;


    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation,int audioid) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mAudioId=audioid;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId,int audioid) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        mImageResourceId = imageResourceId;
        mAudioId=audioid;
    }

    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }


    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }


    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getaudioid() {
        return mAudioId;
    }

    public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}