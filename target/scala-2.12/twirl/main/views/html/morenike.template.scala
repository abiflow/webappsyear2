
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
  """),format.raw/*3.3*/("""<!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*11.35*/routes/*11.41*/.Assets.versioned("stylesheets/books.css")),format.raw/*11.83*/("""">
  </head>
    <img src=""""),_display_(/*13.16*/routes/*13.22*/.Assets.versioned("images/photo/morelogo.png")),format.raw/*13.68*/("""" alt" Books inside box"/>
    
   <h3> Listen to Morenike on Syllables ...Below</h3><strong>
   <br>	 
     <audio controls>
<source src=""""),_display_(/*18.15*/routes/*18.21*/.Assets.versioned("images/photo/aud.ogg")),format.raw/*18.62*/("""" type="audio/ogg">
<source src=""""),_display_(/*19.15*/routes/*19.21*/.Assets.versioned("images/photo/aud.mp3")),format.raw/*19.62*/("""" type="audio/mpeg">
   
</audio>
<h3> Expressions...</h3><strong>
   <br>	 
     <audio controls>
<source src="e"""),_display_(/*25.16*/routes/*25.22*/.Assets.versioned("images/photo/xpression1.ogg")),format.raw/*25.70*/("""" type="audio/ogg">
<source src=""""),_display_(/*26.15*/routes/*26.21*/.Assets.versioned("images/photo/expression1.mp3")),format.raw/*26.70*/("""" type="audio/mpeg">



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
                  DATE: Wed Apr 25 19:21:14 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/morenike.scala.html
                  HASH: 9110a69026805ab70a7ca3596cf50ac3b0fd10c0
                  MATRIX: 951->1|1062->17|1091->21|1115->37|1154->39|1183->42|1682->514|1697->520|1760->562|1815->590|1830->596|1897->642|2064->782|2079->788|2141->829|2202->863|2217->869|2279->910|2420->1024|2435->1030|2504->1078|2565->1112|2580->1118|2650->1167
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|43->11|43->11|43->11|45->13|45->13|45->13|50->18|50->18|50->18|51->19|51->19|51->19|57->25|57->25|57->25|58->26|58->26|58->26
                  -- GENERATED --
              */
          