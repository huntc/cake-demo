import sbt._
import sbt.Keys._

object CakeDemoBuild extends Build {

  lazy val cakeDemo = Project(
    id = "cake-demo",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Cake Demo",
      organization := "com.typesafe.cake",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.0",
      libraryDependencies += "org.specs2" %% "specs2" % "1.14" % "test",
      libraryDependencies += "org.mockito" % "mockito-core" % "1.9.5" % "test"
    )
  )
}
