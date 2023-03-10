package com.example.myqurannavigation;

public class QuranModel {
    public String number;
    private String text;

    private int numberInSurah;
    private int juz;
    private int manzil;
    private int page;
    private int ruku;

    private int hizbQuarter;
    private int sajda;
    private int surah_number;

    private String surah_name;
    private String englishName;
    private String englishNameTranslation;
    private String revelationType;

    public String sajdaId;
    public String sajdaRecommended;
    public String sajdaObligatory;


    private String UrduTranslation;
    private String UrduTafseer;
    private String EnglishTranslation;
    private String Englishtafseer;
    private String SindhiTranslation;
    private String SindhiTafseer;
    private String HindiTranslation;
    private String HindiTafseer;
    private String PushtoTransation;
    private String PushtoTafseer;

    public QuranModel(String number, String text, int numberInSurah, int juz, int manzil, int page, int ruku, int hizbQuarter, int sajda, int surah_number, String surah_name, String englishName, String englishNameTranslation, String revelationType, String sajdaId, String sajdaRecommended, String sajdaObligatory, String urduTranslation, String urduTafseer, String englishTranslation, String englishtafseer, String sindhiTranslation, String sindhiTafseer, String hindiTranslation, String hindiTafseer, String pushtoTransation, String pushtoTafseer) {
        this.number = number;
        this.text = text;
        this.numberInSurah = numberInSurah;
        this.juz = juz;
        this.manzil = manzil;
        this.page = page;
        this.ruku = ruku;
        this.hizbQuarter = hizbQuarter;
        this.sajda = sajda;
        this.surah_number = surah_number;
        this.surah_name = surah_name;
        this.englishName = englishName;
        this.englishNameTranslation = englishNameTranslation;
        this.revelationType = revelationType;
        this.sajdaId = sajdaId;
        this.sajdaRecommended = sajdaRecommended;
        this.sajdaObligatory = sajdaObligatory;
        UrduTranslation = urduTranslation;
        UrduTafseer = urduTafseer;
        EnglishTranslation = englishTranslation;
        Englishtafseer = englishtafseer;
        SindhiTranslation = sindhiTranslation;
        SindhiTafseer = sindhiTafseer;
        HindiTranslation = hindiTranslation;
        HindiTafseer = hindiTafseer;
        PushtoTransation = pushtoTransation;
        PushtoTafseer = pushtoTafseer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumberInSurah() {
        return numberInSurah;
    }

    public void setNumberInSurah(int numberInSurah) {
        this.numberInSurah = numberInSurah;
    }

    public int getJuz() {
        return juz;
    }

    public void setJuz(int juz) {
        this.juz = juz;
    }

    public int getManzil() {
        return manzil;
    }

    public void setManzil(int manzil) {
        this.manzil = manzil;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRuku() {
        return ruku;
    }

    public void setRuku(int ruku) {
        this.ruku = ruku;
    }

    public int getHizbQuarter() {
        return hizbQuarter;
    }

    public void setHizbQuarter(int hizbQuarter) {
        this.hizbQuarter = hizbQuarter;
    }

    public int getSajda() {
        return sajda;
    }

    public void setSajda(int sajda) {
        this.sajda = sajda;
    }

    public int getSurah_number() {
        return surah_number;
    }

    public void setSurah_number(int surah_number) {
        this.surah_number = surah_number;
    }

    public String getSurah_name() {
        return surah_name;
    }

    public void setSurah_name(String surah_name) {
        this.surah_name = surah_name;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String getEnglishNameTranslation() {
        return englishNameTranslation;
    }

    public void setEnglishNameTranslation(String englishNameTranslation) {
        this.englishNameTranslation = englishNameTranslation;
    }

    public String getRevelationType() {
        return revelationType;
    }

    public void setRevelationType(String revelationType) {
        this.revelationType = revelationType;
    }

    public String getSajdaId() {
        return sajdaId;
    }

    public void setSajdaId(String sajdaId) {
        this.sajdaId = sajdaId;
    }

    public String getSajdaRecommended() {
        return sajdaRecommended;
    }

    public void setSajdaRecommended(String sajdaRecommended) {
        this.sajdaRecommended = sajdaRecommended;
    }

    public String getSajdaObligatory() {
        return sajdaObligatory;
    }

    public void setSajdaObligatory(String sajdaObligatory) {
        this.sajdaObligatory = sajdaObligatory;
    }

    public String getUrduTranslation() {
        return UrduTranslation;
    }

    public void setUrduTranslation(String urduTranslation) {
        UrduTranslation = urduTranslation;
    }

    public String getUrduTafseer() {
        return UrduTafseer;
    }

    public void setUrduTafseer(String urduTafseer) {
        UrduTafseer = urduTafseer;
    }

    public String getEnglishTranslation() {
        return EnglishTranslation;
    }

    public void setEnglishTranslation(String englishTranslation) {
        EnglishTranslation = englishTranslation;
    }

    public String getEnglishtafseer() {
        return Englishtafseer;
    }

    public void setEnglishtafseer(String englishtafseer) {
        Englishtafseer = englishtafseer;
    }

    public String getSindhiTranslation() {
        return SindhiTranslation;
    }

    public void setSindhiTranslation(String sindhiTranslation) {
        SindhiTranslation = sindhiTranslation;
    }

    public String getSindhiTafseer() {
        return SindhiTafseer;
    }

    public void setSindhiTafseer(String sindhiTafseer) {
        SindhiTafseer = sindhiTafseer;
    }

    public String getHindiTranslation() {
        return HindiTranslation;
    }

    public void setHindiTranslation(String hindiTranslation) {
        HindiTranslation = hindiTranslation;
    }

    public String getHindiTafseer() {
        return HindiTafseer;
    }

    public void setHindiTafseer(String hindiTafseer) {
        HindiTafseer = hindiTafseer;
    }

    public String getPushtoTransation() {
        return PushtoTransation;
    }

    public void setPushtoTransation(String pushtoTransation) {
        PushtoTransation = pushtoTransation;
    }

    public String getPushtoTafseer() {
        return PushtoTafseer;
    }

    public void setPushtoTafseer(String pushtoTafseer) {
        PushtoTafseer = pushtoTafseer;
    }

    @Override
    public String toString() {
        return "QuranModel{" +
                "number='" + number + '\'' +
                ", text='" + text + '\'' +
                ", numberInSurah=" + numberInSurah +
                ", juz=" + juz +
                ", manzil=" + manzil +
                ", page=" + page +
                ", ruku=" + ruku +
                ", hizbQuarter=" + hizbQuarter +
                ", sajda=" + sajda +
                ", surah_number=" + surah_number +
                ", surah_name='" + surah_name + '\'' +
                ", englishName='" + englishName + '\'' +
                ", englishNameTranslation='" + englishNameTranslation + '\'' +
                ", revelationType='" + revelationType + '\'' +
                ", sajdaId='" + sajdaId + '\'' +
                ", sajdaRecommended='" + sajdaRecommended + '\'' +
                ", sajdaObligatory='" + sajdaObligatory + '\'' +
                ", UrduTranslation='" + UrduTranslation + '\'' +
                ", UrduTafseer='" + UrduTafseer + '\'' +
                ", EnglishTranslation='" + EnglishTranslation + '\'' +
                ", Englishtafseer='" + Englishtafseer + '\'' +
                ", SindhiTranslation='" + SindhiTranslation + '\'' +
                ", SindhiTafseer='" + SindhiTafseer + '\'' +
                ", HindiTranslation='" + HindiTranslation + '\'' +
                ", HindiTafseer='" + HindiTafseer + '\'' +
                ", PushtoTransation='" + PushtoTransation + '\'' +
                ", PushtoTafseer='" + PushtoTafseer + '\'' +
                '}';
    }
}
