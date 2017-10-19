name := "repotest"

version := "0.1"

scalaVersion := "2.12.4"

val scalaTestVersion = "3.0.1"

resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies += "org.scalatest" %% "scalatest" % scalaTestVersion % "test"