
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

object playtime extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 
 """),_display_(/*2.3*/main("Playtime")/*2.19*/ {_display_(Seq[Any](format.raw/*2.21*/("""
    """),format.raw/*3.5*/("""<!DOCTYPE html>
    <html lang="en">
    <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
      <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
      <link rel="stylesheet" href=""""),_display_(/*11.37*/routes/*11.43*/.Assets.versioned("stylesheets/books.css")),format.raw/*11.85*/("""">
    </head>

<a href="https://www.youtube.com/watch?v=5ZCgbGgA-_8" Teletubby target="_blank">
    <img src=""""),_display_(/*15.16*/routes/*15.22*/.Assets.versioned("images/photo/teletubbies.png")),format.raw/*15.71*/("""" alt="" />Watch</a>

<a href="https://www.youtube.com/watch?v=zb24hfez_sQ" nursery rhymes target="_blank">
    <img src=""""),_display_(/*18.16*/routes/*18.22*/.Assets.versioned("images/photo/dancing.png")),format.raw/*18.67*/("""" alt="" />Watch</a>
<a href="https://www.youtube.com/watch?v=FrsM9WggCdo&list=PL-2jf7tAUXPHApwu3FifugJOKlldawPds" happy songtarget="_blank">
    <img src=""""),_display_(/*20.16*/routes/*20.22*/.Assets.versioned("images/photo/cool.png")),format.raw/*20.64*/("""" alt="" />Watch</a>



<p>
    <h2>Why Have Fun Outdoor</h2>
</p>

<p>The Benefits of Outdoor Play. </p>
Playing outdoors is a form of exercise that promotes well-being and wholesome physical development.
<br> Children are naturally drawn to active play outdoors: it allows them to explore their environment, develop muscle strength
and coordination, and gain self-confidence.

<h2>How to Make Friends</h2>
Every friendship begins with some sign that two people are interested in becoming friends.
<br> So, the first ingredient for making friends involves showing that we like someone and expressing openness to friendship
with them.
<h4>Greetings</h4>
A very basic way to show openness is to greet potential friends.
<h4>Compliments</h4>
Compliments are another easy way to signal openness to friendship
<h4>Kindness</h4>

Small kindnesses can be another way to signal liking.
<br> This could mean lending a pencil to a classmate, saving them a seat, helping them carry something, or sharing a lunch treat.
<br> Kindness tends to elicit kindness, and it’s one of the best ways to begin a friendship.
<br>
<p>Expressing openness is the first ingredient of friendship formation, because it casts wide the metaphorical door to friendship.</p>






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
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/playtime.scala.html
                  HASH: 515d69a85ee139739b189821c025b455a16d1c6b
                  MATRIX: 951->1|1062->17|1091->21|1115->37|1154->39|1185->44|1700->532|1715->538|1778->580|1917->692|1932->698|2002->747|2152->870|2167->876|2233->921|2417->1078|2432->1084|2495->1126
                  LINES: 28->1|33->1|34->2|34->2|34->2|35->3|43->11|43->11|43->11|47->15|47->15|47->15|50->18|50->18|50->18|52->20|52->20|52->20
                  -- GENERATED --
              */
          