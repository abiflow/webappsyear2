
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/wdd/webapps/webappsyear2/conf/routes
// @DATE:Thu Apr 12 17:36:04 IST 2018

import play.api.mvc.Call


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers {

  // @LINE:6
  class ReverseHomeController(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def donation(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "donation")
    }
  
    // @LINE:7
    def about(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "about")
    }
  
    // @LINE:10
    def membership(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "membership")
    }
  
    // @LINE:11
    def bookscategory(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "bookscategory")
    }
  
    // @LINE:13
    def morenike(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "morenike")
    }
  
    // @LINE:6
    def index(): Call = {
      
      Call("GET", _prefix)
    }
  
    // @LINE:8
    def contact(): Call = {
    
      () match {
      
        // @LINE:8
        case ()  =>
          
          Call("GET", _prefix + { _defaultPrefix } + "contact")
      
      }
    
    }
  
    // @LINE:12
    def playtime(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "playtime")
    }
  
    // @LINE:15
    def requestforbooks(): Call = {
      
      Call("GET", _prefix + { _defaultPrefix } + "requestforbooks")
    }
  
  }

  // @LINE:23
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:23
    def versioned(file:Asset): Call = {
      implicit lazy val _rrc = new play.core.routing.ReverseRouteContext(Map(("path", "/public"))); _rrc
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[play.api.mvc.PathBindable[Asset]].unbind("file", file))
    }
  
  }


}
