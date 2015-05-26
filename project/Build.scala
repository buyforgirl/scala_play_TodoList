//dependencies management

import sbt._
import Keys._

object ApplicationBuild extends Build {

  val appName         = "scala_play_todolist"
  val appVersion      = "1.0"

  val appDependencies = Seq(
    "postgresql" % "postgresql" % "8.4-702.jdbc4"
  )

}