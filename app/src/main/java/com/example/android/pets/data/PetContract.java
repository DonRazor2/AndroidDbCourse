package com.example.android.pets.data;

import android.provider.BaseColumns;

/**
 * Created by visla on 6/29/2018.
 */

public final class PetContract {

    public static abstract class PetEntry implements BaseColumns {


        public static final String TABLE_NAME = "Pets";
        public static final String _ID = "_id";
        public static final String COLUMN_PET_NAME = "Name";
        public static final String COLUMN_PET_BREED = "Breed";
        public static final String COLUMN_PET_GENDER = "Gender";
        public static final String COLUMN_PET_WEIGHT = "Weight";

        //Values for Gender
        public static final int GENDER_MALE = 1;
        public static final int GENDER_FEMALE = 2;
        public static final int GENDER_UNKWOWN = 0;
    }
}
