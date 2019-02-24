package com.example.android.lang;

public class Word {
  private String Defaulttranslate,miwoktranslate;
    private int mImageResourceId = NO_IMAGE_PROVIDED;

    private static final int NO_IMAGE_PROVIDED = -1;
    private int audioresourceid;

    public Word(String defaultt, String miwok,int audio) {
        Defaulttranslate = defaultt;
        miwoktranslate = miwok;
        audioresourceid=audio;
    }
    public Word(String defaultt, String miwok,int imageresid,int audio){
        Defaulttranslate=defaultt;
        miwoktranslate=miwok;
        mImageResourceId=imageresid;
        audioresourceid=audio;
    }

    public String getDefaulttranslate() {
        return Defaulttranslate;
    }
    public String getMiwoktranslate(){
        return miwoktranslate;
    }
    public int getImageResourceId() {
        return mImageResourceId;
    }

   public boolean hasImage() {
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }

    public int getAudioresourceid() {
        return audioresourceid;
    }
}
