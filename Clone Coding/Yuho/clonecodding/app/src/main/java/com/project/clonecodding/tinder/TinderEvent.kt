package com.project.clonecodding.tinder

sealed class TinderEvent {
    data object FetchTinderModels : TinderEvent()
    data object OnDislike : TinderEvent()
    data object OnFavorite : TinderEvent()
    data object OnLike : TinderEvent()
}