name := "projectn-bolt-scala-sample"

version := "0.1"

scalaVersion := "2.13.6"

assembly / assemblyJarName := "projectn-bolt-scala-aws-sample.jar"

libraryDependencies += "com.gitlab.projectn-oss" % "projectn-bolt-aws-java" % "1.0.0"

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}
