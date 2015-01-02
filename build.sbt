name := "finagle-neo4j"
version := "0.1.0"

scalaVersion := "2.11.4"
crossScalaVersions := Seq("2.10.4", "2.11.4")

libraryDependencies ++= Seq(
  "com.twitter" %% "finagle-http" % "6.24.0",
  "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.4.4",
  "org.scalatest" %% "scalatest" % "2.2.2" % "test"
)
