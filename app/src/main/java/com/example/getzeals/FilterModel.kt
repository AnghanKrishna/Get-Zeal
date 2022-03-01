package com.example.getzeals

data class FilterModel(val filterName: String,var isClicked:Boolean)

data class FilterMoreModel(val filterDetail: String)

data class OfferModel(val img: Int, val offerAdd: String, val offerName: String)