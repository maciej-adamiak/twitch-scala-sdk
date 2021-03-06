package com.madamiak.twitch.model.api.clip

import java.net.URL
import java.util.Date

/**
  * Represents a Twitch clip
  *
  * @param broadcasterId User ID of the stream from which the clip was created
  * @param createdAt Date when the clip was created
  * @param creatorId ID of the user who created the clip
  * @param embedUrl URL to embed the clip
  * @param gameId ID of the game assigned to the stream when the clip was created
  * @param id ID of the clip being queried
  * @param language Language of the stream from which the clip was created
  * @param thumbnailUrl URL of the clip thumbnail
  * @param title Title of the clip
  * @param url URL where the clip can be viewed
  * @param videoId ID of the video from which the clip was created
  * @param viewCount Number of times the clip has been viewed
  */
case class TwitchClip(
    broadcasterId: String,
    createdAt: Date,
    creatorId: String,
    embedUrl: URL,
    gameId: String,
    id: String,
    language: String,
    thumbnailUrl: URL,
    title: String,
    url: URL,
    videoId: String,
    viewCount: Long
)
