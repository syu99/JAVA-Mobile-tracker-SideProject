package com.johan.mtrackeryo.model;


/**
 * These constructor and methods are the bases of the adapter and the view and the array's data
 * All elements that we stored in the array is used to be showed thanks the recycler view and his adapter
 * We stored all the data which are set from all the items to their content
 * The methods below give the possibility to retrieve all the value needed to be save
 */

//Ces constructeurs et méthodes sont les bases de l'adaptateur , des views  et de données des tableau
// * Tous les éléments qu'on à stockés dans le tableau doivent être affichés grâce
// à la vue du recycleur et à son adaptateur * tout est stocké ici
// Les méthodes ci-dessous permettent de récupérer
// toute la valeur nécessaire à la sauvegarde
public class  ListMoodItem {
    private int mColor;
    private int mSmileyValue;
    private String mComment;
    private int mIconComment;
    private String mDate;

    public ListMoodItem(int color, int smileyValue, String comment, int iconComment, String date) {
        mColor = color;
        mSmileyValue = smileyValue;
        mComment = comment;
        mIconComment = iconComment;
        mDate = date;
    }

    public int getColor() {
        return mColor;
    }

    public int getSmileyValue() {
        return mSmileyValue;
    }

    public String getComment() {
        return mComment;
    }

    public int getIconComment() {
        return mIconComment;
    }

    /*
     * @getDate method
     * @value param
     *
     * This method is using a trick to update the "date value"
     * We get the item position into the value and we return the string of this position
     * */
    public String getDate(int value) {
        String dayTab[] = {"Hier", "Avant-hier", "trois jours", "quatre jours", "cinq jours", "six jours", "une semaine"};
        mDate = dayTab[value];

        if (value >= 2)
            return "Il y a " + mDate;

        return mDate;
    }

}
