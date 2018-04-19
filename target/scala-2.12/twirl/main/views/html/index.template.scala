
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
  """),format.raw/*4.3*/("""<!DOCTYPE html>
  <html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href=""""),_display_(/*12.35*/routes/*12.41*/.Assets.versioned("stylesheets/books.css")),format.raw/*12.83*/("""">
  </head> 

<div class="list">
  <a href=""""),_display_(/*16.13*/routes/*16.19*/.HomeController.playtime()),format.raw/*16.45*/("""" Kids target="_blank">
    <img src=""""),_display_(/*17.16*/routes/*17.22*/.Assets.versioned("images/photo/ChildLaugh.png")),format.raw/*17.70*/(""""alt=" kids having fun" />
  </a>
  <a href=""""),_display_(/*19.13*/routes/*19.19*/.HomeController.contact()),format.raw/*19.44*/("""" Contact Us target="_blank">
    <img src=""""),_display_(/*20.16*/routes/*20.22*/.Assets.versioned("images/photo/readingculture.png")),format.raw/*20.74*/("""" alt="children reading" />
  </a>
  <a href=""""),_display_(/*22.13*/routes/*22.19*/.HomeController.requestforbooks()),format.raw/*22.52*/("""" TwoforBooks target="_blank">
    <img src=""""),_display_(/*23.16*/routes/*23.22*/.Assets.versioned("images/photo/donatebanner.png")),format.raw/*23.72*/("""" alt="donation" />
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
        <a href=" """),_display_(/*42.20*/routes/*42.26*/.Assets.versioned("images/photo/http://www.nigeriahc.org.uk/culture-tourism")),format.raw/*42.103*/("""">Explore History</a>
        <img src=""""),_display_(/*43.20*/routes/*43.26*/.Assets.versioned("images/photo/shelf.png")),format.raw/*43.69*/("""" alt="book shelf" />
      </li>
      <li>
        <a href=""""),_display_(/*46.19*/routes/*46.25*/.HomeController.requestforbooks()),format.raw/*46.58*/("""">Request For Books</a>
        <img src=""""),_display_(/*47.20*/routes/*47.26*/.Assets.versioned("images/photo/kidsbooks.png")),format.raw/*47.73*/("""" alt="children showing reading books" />
      </li>
      <li>
        <a href=""""),_display_(/*50.19*/routes/*50.25*/.HomeController.morenike),format.raw/*50.49*/("""'s Corner()">Morenike's Corner</a>
        <img src=""""),_display_(/*51.20*/routes/*51.26*/.Assets.versioned("images/photo/spe.png")),format.raw/*51.67*/("""" alt="picture speech head" />
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
                  DATE: Thu Apr 19 16:52:09 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/index.scala.html
                  HASH: c4abb0016a808572c1f742120bc3ad69ef76a1fa
                  MATRIX: 948->1|1059->17|1088->21|1113->38|1152->40|1181->43|1680->515|1695->521|1758->563|1831->609|1846->615|1893->641|1959->680|1974->686|2043->734|2116->780|2131->786|2177->811|2249->856|2264->862|2337->914|2411->961|2426->967|2480->1000|2553->1046|2568->1052|2639->1102|3491->1927|3506->1933|3605->2010|3673->2051|3688->2057|3752->2100|3842->2163|3857->2169|3911->2202|3981->2245|3996->2251|4064->2298|4174->2381|4189->2387|4234->2411|4315->2465|4330->2471|4392->2512
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|44->12|44->12|44->12|48->16|48->16|48->16|49->17|49->17|49->17|51->19|51->19|51->19|52->20|52->20|52->20|54->22|54->22|54->22|55->23|55->23|55->23|74->42|74->42|74->42|75->43|75->43|75->43|78->46|78->46|78->46|79->47|79->47|79->47|82->50|82->50|82->50|83->51|83->51|83->51
                  -- GENERATED --
              */
          