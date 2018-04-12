
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/webappsyear2/conf/routes
// @DATE:Thu Apr 12 17:36:04 IST 2018

import play.api.routing.JavaScriptReverseRoute


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def donation: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.donation",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "donation"})
        }
      """
    )
  
    // @LINE:7
    def about: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.about",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "about"})
        }
      """
    )
  
    // @LINE:10
    def membership: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.membership",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "membership"})
        }
      """
    )
  
    // @LINE:11
    def bookscategory: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.bookscategory",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "bookscategory"})
        }
      """
    )
  
    // @LINE:13
    def morenike: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.morenike",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "morenike"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:8
    def contact: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.contact",
      """
        function() {
        
          if (true) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "contact"})
          }
        
        }
      """
    )
  
    // @LINE:12
    def playtime: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.playtime",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "playtime"})
        }
      """
    )
  
    // @LINE:15
    def requestforbooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.HomeController.requestforbooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "requestforbooks"})
        }
      """
    )
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[play.api.mvc.PathBindable[Asset]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
