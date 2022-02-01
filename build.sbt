val scala3Version = "3.1.0"
// val circeVersion = "0.14.1"
lazy val root = project
  .in(file("."))
  .settings(
    name := "archive",
    version := "0.1.0-SNAPSHOT",

    scalaVersion := scala3Version,
    
    libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test",

    libraryDependencies ++= Seq(
      "com.typesafe.play" %% "play-json" % "2.8.2"
    ).map(_.cross(CrossVersion.for3Use2_13)),

  )
