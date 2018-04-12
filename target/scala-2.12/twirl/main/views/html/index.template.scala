
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
  

"""),format.raw/*6.1*/("""<div class="list">
  <a href=""""),_display_(/*7.13*/routes/*7.19*/.HomeController.playtime()),format.raw/*7.45*/("""" Kids target="_blank">
    <img src=""""),_display_(/*8.16*/routes/*8.22*/.Assets.versioned("images/photo/ChildLaugh.png")),format.raw/*8.70*/(""""alt=" kids having fun" />
  </a>
  <a href=""""),_display_(/*10.13*/routes/*10.19*/.HomeController.contact()),format.raw/*10.44*/("""" Contact Us target="_blank">
    <img src=""""),_display_(/*11.16*/routes/*11.22*/.Assets.versioned("images/photo/readingculture.png")),format.raw/*11.74*/("""" alt="children reading" />
  </a>
  <a href=""""),_display_(/*13.13*/routes/*13.19*/.HomeController.requestforbooks()),format.raw/*13.52*/("""" TwoforBooks target="_blank">
    <img src=""""),_display_(/*14.16*/routes/*14.22*/.Assets.versioned("images/photo/donatebanner.png")),format.raw/*14.72*/("""" alt="donation" />
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
        <a href=" """),_display_(/*33.20*/routes/*33.26*/.Assets.versioned("images/photo/http://www.nigeriahc.org.uk/culture-tourism")),format.raw/*33.103*/("""">Explore History</a>
        <img src=""""),_display_(/*34.20*/routes/*34.26*/.Assets.versioned("images/photo/shelf.png")),format.raw/*34.69*/("""" alt="book shelf" />
      </li>
      <li>
        <a href=""""),_display_(/*37.19*/routes/*37.25*/.HomeController.requestforbooks()),format.raw/*37.58*/("""">Request For Books</a>
        <img src=""""),_display_(/*38.20*/routes/*38.26*/.Assets.versioned("images/photo/kidsbooks.png")),format.raw/*38.73*/("""" alt="children showing reading books" />
      </li>
      <li>
        <a href=""""),_display_(/*41.19*/routes/*41.25*/.HomeController.morenike),format.raw/*41.49*/("""'s Corner()">Morenike's Corner</a>
        <img src=""""),_display_(/*42.20*/routes/*42.26*/.Assets.versioned("images/photo/spe.png")),format.raw/*42.67*/("""" alt="picture speech head" />
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
                  DATE: Thu Apr 12 21:21:15 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/index.scala.html
                  HASH: af6e3170451a21b2ab0f840e26ce6c01b1ceddff
                  MATRIX: 948->1|1059->17|1088->21|1113->38|1152->40|1183->45|1240->76|1254->82|1300->108|1365->147|1379->153|1447->201|1520->247|1535->253|1581->278|1653->323|1668->329|1741->381|1815->428|1830->434|1884->467|1957->513|1972->519|2043->569|2895->1394|2910->1400|3009->1477|3077->1518|3092->1524|3156->1567|3246->1630|3261->1636|3315->1669|3385->1712|3400->1718|3468->1765|3578->1848|3593->1854|3638->1878|3719->1932|3734->1938|3796->1979
                  LINES: 28->1|33->1|35->3|35->3|35->3|38->6|39->7|39->7|39->7|40->8|40->8|40->8|42->10|42->10|42->10|43->11|43->11|43->11|45->13|45->13|45->13|46->14|46->14|46->14|65->33|65->33|65->33|66->34|66->34|66->34|69->37|69->37|69->37|70->38|70->38|70->38|73->41|73->41|73->41|74->42|74->42|74->42
                  -- GENERATED --
              */
          