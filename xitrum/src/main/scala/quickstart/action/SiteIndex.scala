package quickstart.action

import xitrum.Action
import xitrum.annotation.GET

@GET("ping")
class SiteIndex extends Action {
  def execute() {
    respondJsonText()
  }
}
