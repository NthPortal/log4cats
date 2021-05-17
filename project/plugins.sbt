addSbtPlugin("org.scalameta"             % "sbt-scalafmt"             % "2.4.2")
addSbtPlugin("org.scala-js"              % "sbt-scalajs"              % "1.5.1")
addSbtPlugin("com.47deg"                 % "sbt-microsites"           % "1.3.4")
addSbtPlugin("com.typesafe.sbt"          % "sbt-ghpages"              % "0.6.3")
addSbtPlugin("pl.project13.scala"        % "sbt-jmh"                  % "0.4.2")
addSbtPlugin("org.portable-scala"        % "sbt-scalajs-crossproject" % "1.0.0")
addSbtPlugin("org.scalameta"             % "sbt-mdoc"                 % "2.2.21")
addSbtPlugin("com.codecommit"            % "sbt-spiewak-sonatype"     % "0.20.4")
// temporary until sbt-spiewak-sonatype upgrades. This unlocks Scala 3.0.0 release at the cost of some deprecation warnings in sbt!
addSbtPlugin("ch.epfl.lamp"              % "sbt-dotty"                % "0.5.5")
