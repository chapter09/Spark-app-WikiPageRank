name := "WikiPageRank"

version := "1.0"

scalaVersion := "2.10.3"

libraryDependencies += "org.apache.spark" %% "spark-core" % "0.9.1"

libraryDependencies += "org.apache.spark" % "spark-bagel_2.10" % "0.9.1"

libraryDependencies += "org.apache.hadoop" % "hadoop-client" % "2.2.0"

resolvers += "Akka Repository" at "http://repo.akka.io/releases/"

