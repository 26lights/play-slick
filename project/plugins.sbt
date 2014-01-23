resolvers += Resolver.url("scalasbt",  new URL("http://scalasbt.artifactoryonline.com/scalasbt/sbt-plugin-releases"))(Resolver.ivyStylePatterns)

resolvers += "jgit-repo" at "http://download.eclipse.org/jgit/maven"

addSbtPlugin("com.typesafe.sbteclipse" % "sbteclipse-plugin" % "2.3.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.6.2")

//used for publishing: addSbtPlugin("com.jsuereth" % "xsbt-gpg-plugin" % "0.6")
