
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message:String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.18*/(""" 

"""),_display_(/*3.2*/main("Home Page")/*3.19*/ {_display_(Seq[Any](format.raw/*3.21*/("""
  """),format.raw/*4.3*/("""<link rel="stylesheet" href=""""),_display_(/*4.33*/routes/*4.39*/.Assets.versioned("stylesheets/books.css")),format.raw/*4.81*/("""">
<div class="list">
  <a href="kids.html" Kids target="_blank">
    <img src="childLaugh.png" alt=" kids having fun" />
  </a>
  <a href="contactus.html" Contact Us target="_blank">
    <img src="readingculture1.png" alt="children reading" />
  </a>
  <a href="two for books.html" TwoforBooks target="_blank">
    <img src="donatebanner.png" alt="donation" />
  </a>


  <div class="text">
    <h2>A simple name for an organisation with a simple mission.</h2>

    <p>We collect, sort, ship, and distribute books to students of all ages in Africa. Our goal: to end the book famine in Africa.
      Books For Africa remains the largest shipper of donated text and library books to the African continent, shipping over
      36 million books to 49 different countries since 1988. Over the past 12 months we have shipped 2.4 million books, 154
      computers and 62 e-readers containing 467,000 million digital books, as well as 7 new law and human rights libraries
      to 25 African countries. More than $2.5 million was raised last year to ship the books to the students of Africa.
    </p>
  </div>

  <div class="links">

    <ul>
      <li>
        <a href="Explore.html">Explore History</a>
      </li>
      <li>
        <a href="requestforbooks.html">Request For Books</a>
      </li>
      <li>
        <a href="morenike's Corner.html">Morenike's Corner</a>
      </li>
    </ul>
  </div>
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
                  DATE: Wed Apr 11 21:05:12 IST 2018
                  SOURCE: /home/wdd/webapps/year2WebApp/app/views/index.scala.html
                  HASH: 6e396afc5dfdbed05d99dd4230110d6e0cb7478f
                  MATRIX: 948->1|1059->17|1088->21|1113->38|1152->40|1181->43|1237->73|1251->79|1313->121
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4
                  -- GENERATED --
              */
          