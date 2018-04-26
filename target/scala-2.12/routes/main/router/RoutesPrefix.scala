
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/webappsyear2/conf/routes
// @DATE:Wed Apr 25 19:21:14 IST 2018


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
