publishMavenStyle := true

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <scm>
    <url>git@github.com:freekh/play-slick.git</url>
    <connection>scm:git:git@github.com:freekh/play-slick.git</connection>
  </scm>
  <developers>
    <developer>
      <id>freekh</id>
      <name>Fredrik Ekholdt</name>
      <url>http://ch.linkedin.com/in/freekh</url>
    </developer>
  </developers>
)

publishTo <<= version { v: String =>
  val nexus = "http://build.26source.org/nexus/"
  if (v.trim.endsWith("SNAPSHOT")) 
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else                             
    Some("releases" at nexus + "content/repositories/releases")
}

credentials += Credentials(Path.userHome / ".ivy2" / ".credentials")
