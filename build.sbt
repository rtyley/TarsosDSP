scalaVersion := "2.12.7"

libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % "test"

fork in Test := true

parallelExecution in Test := false

javacOptions ++= Seq("-encoding", "UTF-8")

