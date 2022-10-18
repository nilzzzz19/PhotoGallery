package com.bignerdranch.android.photogallery.api

import com.bignerdranch.android.photogallery.GalleryItem
import com.google.gson.annotations.SerializedName

class PhotoResponse {
    @SerializedName("photo")         //Gson finds this photo key in the response json
    lateinit var galleryItems: List<GalleryItem>
}