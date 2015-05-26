name := "scala_play_todolist"

version := "1.0"

lazy val `scala_play_todolist` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

//libraryDependencies ++= Seq( jdbc , anorm , cache , ws )

libraryDependencies += "postgresql" % "postgresql" % "9.1-901-1.jdbc4"

unmanagedResourceDirectories in Test <+=  baseDirectory ( _ /"target/web/public/test" )