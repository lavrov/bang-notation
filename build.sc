import mill._, mill.scalalib._

object core extends ScalaModule {
  def scalaVersion = "2.13.1"
  object test extends Tests {
    def ivyDeps = Agg(
      ivy"com.lihaoyi::utest:0.7.1"
    )
    def testFrameworks = List("utest.runner.Framework")
  }
}
