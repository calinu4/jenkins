import AssemblyKeys._

assemblySettings
name:="My hello world"
version:="1.0"
scalaVersion:="2.10.6"

jarName in assembly := "hello.jar"
mainClass in (Compile,assembly):=Some("com.whiteboardcoder.hello.hw")


