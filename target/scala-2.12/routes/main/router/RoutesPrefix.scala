
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/year2WebApp/conf/routes
// @DATE:Wed Apr 11 19:53:56 IST 2018


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
