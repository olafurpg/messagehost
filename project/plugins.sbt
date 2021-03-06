addSbtPlugin("com.eed3si9n" % "sbt-doge"      % "0.1.5")
addSbtPlugin("com.eed3si9n" % "sbt-buildinfo" % "0.6.1")
addSbtPlugin("io.get-coursier"  % "sbt-coursier"        % "1.0.0-RC5")
addSbtPlugin("com.jsuereth"     % "sbt-pgp"             % "1.0.0")
addSbtPlugin("org.xerial.sbt"   % "sbt-sonatype"        % "1.1")
addSbtPlugin("me.lessis"        % "bintray-sbt"         % "0.3.0")
addSbtPlugin("com.dwijnand"     % "sbt-dynver"          % "1.2.0")
addSbtPlugin(
  "com.thesamet" % "sbt-protoc" % "0.99.11" exclude ("com.trueaccord.scalapb", "protoc-bridge_2.10"))
libraryDependencies += "com.trueaccord.scalapb" %% "compilerplugin-shaded" % "0.6.0"

libraryDependencies += "org.scala-sbt" % "scripted-plugin" % sbtVersion.value
