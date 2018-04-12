
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
  <a href=""""),_display_(/*6.13*/routes/*6.19*/.HomeController.playtime()),format.raw/*6.45*/("""" Kids target="_blank">
    <img src=""""),_display_(/*7.16*/routes/*7.22*/.Assets.versioned("images/photo/childLaugh.png")),format.raw/*7.70*/(""""alt=" kids having fun" />
  </a>
  <a href=""""),_display_(/*9.13*/routes/*9.19*/.HomeController.contact()),format.raw/*9.44*/("""" Contact Us target="_blank">
    <img src=""""),_display_(/*10.16*/routes/*10.22*/.Assets.versioned("images/photo/readingculture1.png")),format.raw/*10.75*/("""" alt="children reading" />
  </a>
  <a href=""""),_display_(/*12.13*/routes/*12.19*/.HomeController.requestforbooks()),format.raw/*12.52*/("""" TwoforBooks target="_blank">
    <img src=""""),_display_(/*13.16*/routes/*13.22*/.Assets.versioned("images/photo/donatebanner.png")),format.raw/*13.72*/("""" alt="donation" />
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
        <a href=" """),_display_(/*32.20*/routes/*32.26*/.Assets.versioned("images/photo/http://www.nigeriahc.org.uk/culture-tourism")),format.raw/*32.103*/("""">Explore History</a>
       
      </li>
      <li>
        <a href=""""),_display_(/*36.19*/routes/*36.25*/.HomeController.requestforbooks()),format.raw/*36.58*/("""">Request For Books</a>
      </li>
      <li>
        <a href=""""),_display_(/*39.19*/routes/*39.25*/.HomeController.morenike),format.raw/*39.49*/("""'s Corner()">Morenike's Corner</a>
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
                  DATE: Thu Apr 12 17:42:48 IST 2018
                  SOURCE: /home/wdd/webapps/webappsyear2/app/views/index.scala.html
                  HASH: 8e242505112871b945f5b95e402347ce84f368a2
                  MATRIX: 948->1|1059->17|1088->21|1113->38|1152->40|1181->43|1237->73|1251->79|1313->121|1373->155|1387->161|1433->187|1498->226|1512->232|1580->280|1652->326|1666->332|1711->357|1783->402|1798->408|1872->461|1946->508|1961->514|2015->547|2088->593|2103->599|2174->649|3026->1474|3041->1480|3140->1557|3238->1628|3253->1634|3307->1667|3399->1732|3414->1738|3459->1762
                  LINES: 28->1|33->1|35->3|35->3|35->3|36->4|36->4|36->4|36->4|38->6|38->6|38->6|39->7|39->7|39->7|41->9|41->9|41->9|42->10|42->10|42->10|44->12|44->12|44->12|45->13|45->13|45->13|64->32|64->32|64->32|68->36|68->36|68->36|71->39|71->39|71->39
                  -- GENERATED --
              */
          