package com.madamiak.twitch.model

import com.madamiak.twitch.model.api.TwitchPayload

/**
  * Represent a response of a single Twitch API call
  *
  * @param rateLimit describes status of rate limits applied on the utilized endpoint
  * @param twitchPayload contains response body
  * @tparam T describes the type the body
  */
case class TwitchResponse[T](rateLimit: RateLimit, twitchPayload: TwitchPayload[T])
