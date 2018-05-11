package com.madamiak.twitch.client

import akka.http.scaladsl.model.Uri.Query

//TODO should be changed to the operator to remove the need of explicitly merging queries
package object endpoint {
  
  implicit class RichMap[V](val map: Map[String, V]) extends AnyVal {

    def queryParams: Seq[(String, String)] = map.filter(_ != null).mapValues(_.toString).toSeq

    def query = Query(queryParams: _*)

  }
  
  implicit class RichOptionMap[V](val map: Map[String, Option[V]]) extends AnyVal {

    def queryParams: Seq[(String, String)] = map.filter(_._2.isDefined).mapValues(_.get.toString).toSeq

    def query = Query(queryParams: _*)

  }

  implicit class RichSeqMap[V](val map: Map[String, Seq[V]]) extends AnyVal {

    def queryParams: Seq[(String, String)] = map.mapValues(_.distinct).toSeq.flatMap {
      case (k, v) => v.map(i => (k, i.toString))
    }

    def query = Query(queryParams: _*)

  }

  implicit class RichQuery(val q1: Query) extends AnyVal {

    def merge(q2: Query) = Query((q1.toList ++ q2.toList).distinct: _*)

  }

}
