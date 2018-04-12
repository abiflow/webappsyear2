
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object morenike extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 
 """),_display_(/*2.3*/main("Playtime")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""

    """),format.raw/*4.5*/("""<img src="morelogo.png" alt" Books inside box"/>
    
   <h3> Listen to Morenike on Syllables ...Below</h3><strong>
   <br>	 
     <audio controls>
<source src="aud.ogg" type="audio/ogg">
<source src="aud.mp3" type="audio/mpeg">
   
</audio>
<h3> Expressions...</h3><strong>
   <br>	 
     <audio controls>
<source src="expression1.ogg" type="audio/ogg">
<source src="expression1.mp3" type="audio/mpeg">



""")))}))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Apr 11 20:42:13 IST 2018
                  SOURCE: /home/wdd/webapps/year2WebApp/app/views/morenike.scala.html
                  HASH: 47af34d103871966797adc840a6290ffcc5b0712
                  MATRIX: 951->1|1062->17|1091->21|1115->37|1154->39|1186->45
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4
                  -- GENERATED --
              */
          