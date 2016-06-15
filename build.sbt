lazy val root = (project in file("."))
	.settings(
	    name := "counters",
	    version := "1.0",
	    scalaVersion := "2.11.8")
	.settings(
		libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.6" % "test")

