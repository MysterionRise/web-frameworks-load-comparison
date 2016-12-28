package quickstart.action

import xitrum.Action
import xitrum.annotation.GET

import scala.util.Random

@GET("ping")
class SiteIndex extends Action {

  private val rand = new Random()

  def execute() {
    respondText(rand.nextInt())
  }
}
