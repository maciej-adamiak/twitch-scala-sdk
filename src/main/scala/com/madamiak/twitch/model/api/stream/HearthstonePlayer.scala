package com.madamiak.twitch.model.api.stream

/**
  * Hearthstone metadata about the broadcaster
  * @param hero Hearthstone metadata about the broadcaster's hero
  */
case class HearthstonePlayer(hero: Option[HearthstoneHero] = None)
