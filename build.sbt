ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "sample-scala-lib"
  )

credentials += Credentials(Path.userHome / ".sbt" / ".credentials")
publishTo := Some("repsy" at "https://repo.repsy.io/mvn/MY_USERNAME/MY_REPO")
