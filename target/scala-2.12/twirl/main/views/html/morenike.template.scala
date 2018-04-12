
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

    """),format.raw/*4.5*/("""<img src=""""),_display_(/*4.16*/routes/*4.22*/.Assets.versioned("images/photo/morelogo.png")),format.raw/*4.68*/("""" alt" Books inside box"/>
    
   <h3> Listen to Morenike on Syllables ...Below</h3><strong>
   <br>	 
     <audio controls>
<source src=""""),_display_(/*9.15*/routes/*9.21*/.Assets.versioned("images/photo/aud.ogg")),format.raw/*9.62*/("""" type="audio/ogg">
<source src=""""),_display_(/*10.15*/routes/*10.21*/.Assets.versioned("images/photo/aud.mp3")),format.raw/*10.62*/("""" type="audio/mpeg">
   
</audio>
<h3> Expressions...</h3><strong>
   <br>	 
     <audio controls>
<source src="e"""),_display_(/*16.16*/routes/*16.22*/.Assets.versioned("images/photo/xpression1.ogg")),format.raw/*16.70*/("""" type="audio/ogg">
<source src=""""),_display_(/*17.15*/routes/*17.21*/.Assets.versioned("images/photo/expression1.mp3")),format.raw/*17.70*/("""" type="audio/mpeg">



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
                  DATE: Thu Apr 12 16:54:33 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/morenike.scala.html
                  HASH: e3e1ee6f81d7b8fa5d221e7b977d42f69b4761a9
                  MATRIX: 951->1|1062->17|1091->21|1115->37|1154->39|1186->45|1223->56|1237->62|1303->108|1469->248|1483->254|1544->295|1605->329|1620->335|1682->376|1823->490|1838->496|1907->544|1968->578|1983->584|2053->633
                  LINES: 28->1|33->1|34->2|34->2|34->2|36->4|36->4|36->4|36->4|41->9|41->9|41->9|42->10|42->10|42->10|48->16|48->16|48->16|49->17|49->17|49->17
                  -- GENERATED --
              */
          