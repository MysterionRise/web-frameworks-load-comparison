package org.mystic.ping

import org.scalatra._

import scala.util.Random

class ScalatraPingServlet extends ScalatraServlet {

  private val rand = new Random()

  get("/ping") {
    s"${rand.nextInt()}"
  }

}
